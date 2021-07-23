package Modul08;

public class Main4 {
    public static void main(String[] args) {


        Hashmappp<String, String> hashMap = new Hashmappp<String, String>();
        hashMap.put("name", "Tania Bilqis Thoharoh");
        hashMap.put("nim", "20104097");
        hashMap.put("email", "20104097@ittelkom-pwt.ac.id");
        hashMap.put("kelas", "S1SE 04-C");
        hashMap.put("kota", "banjarnegara");

        System.out.println("Nama \t: " + hashMap.get("name"));
        System.out.println("Nim \t: " + hashMap.get("nim"));
        System.out.println("Email \t: " + hashMap.get("email"));
        System.out.println("Kelas \t: " + hashMap.get("kelas"));
        System.out.println("Kota \t: " + hashMap.get("kota"));
        System.out.println("ukuran hashmap" + hashMap.size());

        System.out.println();
        System.out.println("mengecek key di hashmap apakah true atau false Nim ??" + hashMap.containsKey("nim"));
        System.out.println();
        System.out.println("mengecek value di hashmap apakah true atau false Kelas ??" + hashMap.containsValue("S1SE 04-C"));

        System.out.println();
        System.out.println("menghapus key kota = ");
        hashMap.remove("kota");
        System.out.println("ukuran hashmap" + hashMap.size());
    }
}