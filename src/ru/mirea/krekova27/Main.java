package ru.mirea.krekova27;

public class Main {
    public static void main(String[] args) {
        Hasher<Integer, Integer>
                ht = new Hasher<Integer, Integer>(3);
        ht.put(123, 41);
        ht.put(124, 32);
        ht.put(12, 123);
        ht.put(125, 45);
        ht.printTable();
        System.out.println('\n');
        ht.remove(12);
        ht.printTable();
    }
}