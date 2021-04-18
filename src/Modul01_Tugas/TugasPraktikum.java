package Modul01_Tugas;

public class TugasPraktikum {

    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
    public class Crud {

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3307/perpustakaan";
        static final String USER = "root";
        static final String PASS = "";

        static Connection conn;
        static Statement stmt;
        static ResultSet rs;
        static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        static BufferedReader input = new BufferedReader(inputStreamReader);


        public static void main(String[] args) {

            try {
                // register driver
                Class.forName(JDBC_DRIVER);

                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                stmt = conn.createStatement();

                while (!conn.isClosed()) {
                    showMenu();
                }

                stmt.close();
                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        static void showMenu() {
            System.out.println("\n========= MENU UTAMA =========");
            System.out.println("1. Login Admin");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Data Pinjaman");
            System.out.println("0. Keluar");
            System.out.println("");
            System.out.print("PILIHAN> ");

            try {
                int pilihan = Integer.parseInt(input.readLine());

                switch (pilihan) {
                    case 1:
                        login();
                        break;
                    case 2:
                        pinjamBuku();
                        break;
                    case 3:
                        dataPinjaman();
                        break;
                    default:
                        System.out.println("Pilihan salah!");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void showMenuAdmin(){
            System.out.println("\n========= MENU UTAMA ADMIN =========");
            System.out.println("1. Insert Data");
            System.out.println("2. Show Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Logout");
            System.out.println("6. Registrasi");
            System.out.println("7. Data Peminjaman");
            System.out.println("0. Keluar");
            System.out.println("");
            System.out.print("PILIHAN> ");

            try {
                int pilihan = Integer.parseInt(input.readLine());

                switch (pilihan) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        insertBuku();
                        break;
                    case 2:
                        showData();
                        break;
                    case 3:
                        updateBuku();
                        break;
                    case 4:
                        deleteBuku();
                        break;
                    case 5:
                        showMenu();
                        break;
                    case 6:
                        regisAdmin();
                        break;
                    case 7:
                        dataPinjaman();
                        break;
                    default:
                        System.out.println("Pilihan salah!");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void showData() {
            String sql = "SELECT * FROM buku";

            try {
                rs = stmt.executeQuery(sql);

                System.out.println("+--------------------------------+");
                System.out.println("|    DATA BUKU DI PERPUSTAKAAN   |");
                System.out.println("+--------------------------------+");

                while (rs.next()) {
                    int idBuku = rs.getInt("id_buku");
                    String judul = rs.getString("judul");
                    String pengarang = rs.getString("pengarang");
                    String penerbit = rs.getString("penerbit");
                    int tahun = rs.getInt("tahun_terbit");


                    System.out.println(String.format("%d. %s | %s | %s | %s ", idBuku, judul, pengarang, penerbit, tahun));
                    showMenuAdmin();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        static void insertBuku() {
            try {
                // ambil input dari user
                System.out.print("Judul: ");
                String judul = input.readLine().trim();
                System.out.print("Pengarang: ");
                String pengarang = input.readLine().trim();
                System.out.println("Penerbit: ");
                String penerbit = input.readLine().trim();
                System.out.println("Tahun Terbit: ");
                String tahunTerbit = input.readLine().trim();

                // query simpan
                String sql = "INSERT INTO buku (judul, pengarang, penerbit, tahun_terbit) VALUE('%s', '%s', '%s', '%s')";
                sql = String.format(sql, judul, pengarang, penerbit, tahunTerbit);

                // simpan buku
                stmt.execute(sql);
                showMenuAdmin();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        static void updateBuku() {
            String sql = "SELECT * FROM buku";
            try {
                rs = stmt.executeQuery(sql);
                System.out.println("|    Peminjaman Buku   |");

                while (rs.next()) {
                    int idBuku = rs.getInt("id_buku");
                    String judul = rs.getString("judul");
                    String pengarang = rs.getString("pengarang");


                    System.out.println(String.format("%d. %s -- (%s)", idBuku, judul, pengarang));
                }
                // ambil input dari user
                System.out.print("ID yang mau diedit: ");
                int idBuku = Integer.parseInt(input.readLine());
                System.out.print("Judul: ");
                String judul = input.readLine().trim();
                System.out.print("Pengarang: ");
                String pengarang = input.readLine().trim();
                System.out.println("Penerbit :");
                String penerbit = input.readLine().trim();
                System.out.println("Tahun Terbit :");
                int tahun = Integer.parseInt(input.readLine());

                // query update
                String sql2 = "UPDATE buku SET judul='%s', pengarang='%s', penerbit='%s', tahun_terbit='%s' WHERE id_buku=%d";
                sql2 = String.format(sql2, judul, pengarang,penerbit,tahun, idBuku);

                // update data buku
                stmt.execute(sql2);
                showMenuAdmin();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void deleteBuku() {
            try {

                // ambil input dari user
                System.out.print("ID yang mau dihapus: ");
                int idBuku = Integer.parseInt(input.readLine());

                // buat query hapus
                String sql = String.format("DELETE FROM buku WHERE id_buku=%d", idBuku);

                // hapus data
                stmt.execute(sql);

                System.out.println("Data telah terhapus...");
                showMenuAdmin();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void login() throws IOException {
            System.out.println("== Silahkan Masukkan Username dan Password ==");
            System.out.println("Username \t");
            String username = input.readLine().trim();
            System.out.println("Password \t");
            String password = input.readLine().trim();

            try {
                String sql = "SELECT * FROM admin WHERE username='"+username+"' AND password='"+password+"'";
                rs = stmt.executeQuery(sql);
                if(rs.next()){
                    if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
                        System.out.println("Berhasil Login");
                        showMenuAdmin();
                    }
                }else{
                    System.out.println("Password salah");
                    login();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        static void pinjamBuku() throws IOException{
            String sql = "SELECT * FROM buku";

            try {
                rs = stmt.executeQuery(sql);
                System.out.println("|    Peminjaman Buku   |");

                while (rs.next()) {
                    int idBuku = rs.getInt("id_buku");
                    String judul = rs.getString("judul");
                    String pengarang = rs.getString("pengarang");
                    String penerbit = rs.getString("penerbit");
                    int tahun = rs.getInt("tahun_terbit");


                    System.out.println(String.format("%d. %s |%s | %s | %s)", idBuku, judul, pengarang, penerbit, tahun));
                }
                System.out.println("Masukkan Id Buku yang akan dipinjam :\t");
                int idbuku = Integer.parseInt(input.readLine());

                System.out.println("Nama Peminjam :\t");
                String nama = input.readLine().trim();

                System.out.println("No Tlp :\t");
                int notelp = Integer.parseInt(input.readLine());

                System.out.println("Alamat :\t");
                String alamat = input.readLine().trim();


                String sql2 = "INSERT INTO peminjaman (id_buku,nama,no_telp,alamat) VALUE('%s', '%s', '%s', '%s')";
                sql2 = String.format(sql2, idbuku, nama,notelp,alamat);

                // simpan buku
                stmt.execute(sql2);
                System.out.println("!!!! Data berhasil Dimasukkan !!!!");
                showMenu();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void dataPinjaman(){
            String sql = "SELECT * FROM peminjaman";

            try {
                rs = stmt.executeQuery(sql);

                System.out.println("+--------------------------------+");
                System.out.println("|    DATA PEMINJAMAN DI PERPUSTAKAAN   |");
                System.out.println("+--------------------------------+");

                while (rs.next()) {
                    int idpemijam = rs.getInt("id_peminjam");
                    int idBuku = rs.getInt("id_buku");
                    String nama = rs.getString("nama");
                    int no_telp = rs.getInt("no_telp");
                    String alamat = rs.getString("alamat");

                    System.out.println("No Peminjam | Id Buku | Nama Peminjam | No Telepon | Alamat |");
                    System.out.println(String.format("%d.\t %s | %s | %3s | %s ", idpemijam,idBuku,nama,no_telp,alamat));
                }
                showMenu();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static void regisAdmin() throws Exception {
            try {
                System.out.println("!!!Regitrasi Untuk Menjadi Admin!!!");

                System.out.println("username :\t");
                String uss = input.readLine().trim();

                System.out.println("Password :\t");
                String pass = input.readLine().trim();

                String sql = "INSERT INTO admin (username,password) VALUES ('%s', '%s')";
                sql = String.format(sql, uss, pass);

                stmt.execute(sql);
                System.out.println("Berhasil Melakukan Registrasi");
                login();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
}
