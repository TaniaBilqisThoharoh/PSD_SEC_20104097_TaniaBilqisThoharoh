package Modul09;

public class Method_Binary {

    Node root;

    //Method isEmpty
    boolean isEmpty() {
        return root == null;
    }

    //insert
    void insert(Node input) {
        Node temp = root;
        Node parent = null;
        boolean flag = false;//untuk penanda
        if (isEmpty()) {
            root = input;
        } else {
            while (temp != null) {
                parent = temp;
                if (input.data < temp.data) { // data lebih kecil dari root maka akan disimpan di kiri
                    temp = temp.left;
                    flag = true;
                } else if (input.data > temp.data) { // data lebih besar dari root maka akan disimpan di kanan
                    temp = temp.right;
                    flag = true;
                } else {
                    System.out.println("Data tidak boleh diduplikasi");
                    break;
                }
            }
            if (flag) {
                if (input.data > parent.data) {
                    parent.right = input;
                } else if (input.data < parent.data) {
                    parent.left = input;
                } else {
                    System.out.println("Data tidak boleh Duplikasi  !!");
                }
            }
        }
    }

    //Find
    void find(int cari) {
        Node temp = root;
        boolean cek = false;
        while (temp != null) {
            if (cari < temp.data) {
                temp = temp.left;
            } else if (cari > temp.data) {
                temp = temp.right;
            } else if (cari == temp.data) {
                cek = true;
                break;
            }
        }
        if (cek)
            System.out.println("Data " + cari + " Ditemukan");
        else {
            System.out.println("Data tidak ketemu !!");
        }
    }

    //FindMax
    Node findmax() {
        Node temp = root;
        if (isEmpty())
            return null;
        else {
            while (temp.right != null) {
                temp = temp.right;
            }
            return temp;
        }
    }

    Node findmin() {
        Node temp = root;
        if (isEmpty())
            return null;
        else {
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp;
        }
    }

    // method remove yang dipanggil di main
    public void remove(int input) {
        root = remove(input, root);
    }

    // method remove yang kedua (double parameter)
    // remove yang ini beda dengan modul
    private Node remove(int input, Node temp) {
        if (temp == null) {
            return null;
        }
        if (input == temp.data) {
            if (temp.left == null && temp.right == null) {
                return null;
            }
            if (temp.left == null) {
                return temp.right;
            }
            if (temp.right == null) {
                return temp.left;
            }
            temp.data = temp.right.data;
            temp.right = remove(temp.data, temp.right);
        } else if (input < temp.data) {
            temp.left = remove(input, temp.left);
        } else {
            temp.right = remove(input, temp.right);
        }

        return temp;
    }

    private boolean checking(int input) {
        Node temp = root;
        while (temp != null) {
            // If pertama untuk mengecek arah
            if (input < temp.data) {
                temp = temp.left;
            } else if (input > temp.data) {
                temp = temp.right;
                //Disini
            } else if (input == temp.data) {
                return true;
            }
        }
        return false;
    }

    void removeall(){
        if (isEmpty())
            System.out.println("Tree masih Kosong !!");
        else {
            root = null;
            System.out.println("Data berhasil dihapus semua");
        }
    }

    void findDirectory(int input){
        if (isEmpty())
            System.out.println("Tree masih kosong !!");
        else {
            if (this.checking(input) == true){
                Node temp = root;
                while (temp != null){
                    if (input > temp.data) {
                        System.out.println(temp.data + " ");
                    } else if (input < temp.data){
                        System.out.println(temp.data + " ");
                        temp = temp.left;
                    } else if (input == temp.data){
                        System.out.println(input);
                        break;
                    }
                }
            }
        }
    }

    //Method Untuk menghitung leaf
    public int getLeafCount(){
        return this.getLeafCountHelper(root);
    }

    //method getleafcounthelper menghitung leaf
    private int getLeafCountHelper(Node data){
        if (data == null){
            return 0;
        } else if (data.left == null && data.right == null){
            return 1;
        } else {
            return this.getLeafCountHelper(data.left) + this.getLeafCountHelper(data.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node input){
        if ( input == null ) return;
        System.out.printf(" %d ", input.data);
        preOrder(input.left);
        preOrder(input.right);
    }

    public void InOrder(){
        InOrder(root);
    }

    private void InOrder(Node input){
        if (input == null) return;
        InOrder(input.left);
        System.out.printf(" %d " , input.data);
        InOrder(input.right);

    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node input){
        if (input == null) return;
        postOrder(input.left);
        postOrder(input.right);
        System.out.printf(" %d " , input.data);
    }
}
