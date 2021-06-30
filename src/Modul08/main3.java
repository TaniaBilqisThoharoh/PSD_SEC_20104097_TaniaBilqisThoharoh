package Modul08;

public class main3 {
    public static void main(String[] args) {
        Hashmappp<String, String> hashMap = new Hashmappp<String, String>();
    hashMap.put("name","Rekayasa Perangkat Lunak");
        hashMap.put("url","https://se.ittelkom-pwt.ac.id");
        hashMap.put("email", "se@ittelkom-pwt.ac.id");

        System.out.println("Nama \t: "+hashMap.get("name"));
        System.out.println("URL \t: "+hashMap.get("url"));
        System.out.println("Email \t: "+hashMap.get("email"));


        Hashmappp<Integer, String> hashMap1 = new Hashmappp <Integer, String>();
        hashMap1.put(10,"Apel");
        hashMap1.put(10,"Nanas");
        hashMap1.put(1, "Jeruk");
        hashMap1.put(79, "Anggur");

        System.out.println();
        System.out.println("Buah pada key ke-10 : "+hashMap1.get(10));
        System.out.println("Buah pada key ke-10 : "+hashMap1.get(10));
        System.out.println("Buah pada key ke-1 : "+hashMap1.get(1));
        System.out.println("Buah pada key ke-79 : "+hashMap1.get(79));

        hashMap1.put(null, "Semangka");
        hashMap1.put(null, "Nanas");
        System.out.println();
        System.out.println("Buah pada key null : "+hashMap1.get(null));
        System.out.println();
        System.out.println("Benarkah key pada hashmap tersebut bernilai null ? "+hashMap1.containsKey(null));
        System.out.println();
        System.out.println("Benarkah key pada hashmap tersebut bernilai null ? "+hashMap1.containsValue("Semangka"));
        System.out.println();
        System.out.println("Buah Apel apakah memiliki key ? "+hashMap1.containsKey(10));
        System.out.println();
        System.out.println("Buah Apel apakah memiliki key ? "+hashMap1.containsValue("Apel"));
        System.out.println();
        System.out.println("Size of map : "+hashMap1.size());
}
}
