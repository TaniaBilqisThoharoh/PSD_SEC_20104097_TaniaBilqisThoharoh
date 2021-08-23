package Modul05;

public interface List {

    boolean isEmpty();
    void addFirst(Node input);
    void addLast(Node input);
    void insertAfter(Node key, Node input);
    void insertBefore(Node key, Node input);
    void insert(int index, Node input);
    void replace(Node data1, Node data2);
    void remove(Node data);
    void removeAt(int index);
    void removeFirst();
    void removeLast();
    void clear();
    void show();
    void showreversed();
    void find(Node data);
    int length();
    boolean checking(Node input);
}
