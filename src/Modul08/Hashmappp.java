package Modul08;

public class Hashmappp <K, V>{

    //    Deklarasi atribut
    private int capacity = 100; // menentukan total kapasitas pasangan key dan value
    private int size = 0;
    private Entry<K, V> table[] = new Entry[capacity]; // Deklarasi array untuk membuat tabel

    //digunakan untuk membuat kode unik berdasar method hashcode
    private int Hashing(int hashcode) {
        int location = hashcode % capacity;
        return location;
    }

    // Menentukan ukuran hashmap
    public int size() {
        return this.size;
    }

    //    Mengecek apakah key tersedia atau tidak
    public boolean containsKey(Object key) {
//        Jika key null
        if (key == null) {
            if (table[0].getKey() == null) {
                return true; // mengembalikan nilai true
            }
        }
//        Cari lokasi penyimpanan
        int location = Hashing(key.hashCode());
        Entry e = null; // entry null
//        Error handling
        try {
            e = table[location];
        } catch (NullPointerException ex) {
        }

//        Jika e != null dan kunci pada tabel == kunci yang kita cari
        if (e != null && e.getKey() == key) {
            return true; // mengembalikan nilai true
        }
//        Default mengembalikan nilai false
        return false;
    }

    //    Mengecek apakah value tersedia atau tidak
    public boolean containsValue(Object value) {
        for (int i = 0; i < table.length; i++) {
//            Jika table ke-i tidak kosong dan value yang ada di tabel == value yang di cari
            if (table[i] != null && table[i].getVal() == value) {
                return true; // mengembalikan nilai true
            }
        }
        return false; // mengembalikan nilai false
    }


    // Mengambil data pada Hashmap berdasarkan Key
    public V get(K key) {
        V ret = null;
//        Jika key == null
        Entry<K, V> e = null;
        if (key == null) {
//            Error handling
            try {
//                Cek e di table ke-0
                e = table[0];
            } catch (NullPointerException ex) {
            }
//            Jika e ditable[0] != null
            if (e != null) {
//                Mengembalikan nilai value yang ada di table ke-0
                return (V) e.getVal();
            }
        } else {
//                Cari lokasi peyimpanan key dan value
            int location = Hashing(key.hashCode());
            try {
//                    cek e di table ke-lokasi
                e = table[location];
            } catch (NullPointerException ex) {
            }
//                Jika e != null & kunci pada tabel = kunci yang dicati
            if (e != null && e.getKey() == key) {
//                    Mengembalikan value pada kunci tersebut
                return (V) e.getVal();
            }
        }
//        Mengembalikan nilai default jika semua tidak terpenuhi
        return ret;
    }

    //    Menaruh data ke dalam hashmap
    public V put(K key, V val) {
        V ret = null;
//        Jika key null
        if (key == null) {
            ret = putForNullKey(val);
            return ret;
//            Jika key tidak null
        } else {
            int location = Hashing(key.hashCode());
//            Jika lokasi melebihi kapasitas
            if (location >= capacity) {
                System.out.println("Rehashing required");
//                Mengembalikan nilai null
                return null;
            }
            Entry<K, V> e = null;
            try {
                e = table[location];
            } catch (NullPointerException ex) {
            }
//            jika e != null && key pada hashmap == key yang diinputkan
            if (e != null && e.getKey() == key) {
//                ret = value yang ada pada key yang diinputkan
                ret = (V) e.getVal();
            } else {
//                Jika e == null && key pada hashmap != key yang diinputkan
                Entry<K, V> eNew = new Entry<K, V>();
//                Set key dan value
                eNew.setKey(key);
                eNew.setVal(val);
                table[location] = eNew;
                size++;
            }
        }
        return ret;
    }


    //    Jika akan menaruh value pada key yang bernilai null
    private V putForNullKey(V val) {
        Entry<K, V> e = null;
        try {
            e = table[0];
        } catch (NullPointerException ex) {
        }
        V ret = null;
//        Jika e != null && key pada hashmap == null
        if (e != null && e.getKey() == null) {
            ret = (V) e.getVal();
//            put value
            e.setVal(val);
            return ret;
        } else {
            Entry<K, V> eNew = new Entry<K, V>();
//            set key jadi null
            eNew.setKey(null);
//            put value
            eNew.setVal(val);
            table[0] = eNew;
            size++;
        }
        return ret;
    }

    public void remove(K key) {
        int location = Hashing(key.hashCode());

        Entry e = null;

        try {
            e = table[location];
        } catch (NullPointerException ex) {}
        if (e != null && e.getKey() == key) {
            table[location] = null;
            size--;
        } else {
            e.setKey(null);
        }
    }
}
