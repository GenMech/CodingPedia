package com.company;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertFirst(6);
        list.display();
//        list.duplicates();
//        list.display();
        list.insertRec(88, 2);
        list.display();
    }
}
