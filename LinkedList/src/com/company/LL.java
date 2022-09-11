package com.company;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //insert using recursion
    public void insertRec(int val, int index){
     head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index  == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Question 1 ( LeetCode 83 )
    public void duplicates() {
        Node node = head;
         while (node.next != null){
            if(node.value == node.next.value){
               node.next = node.next.next;
               size--;
       } else {
              node = node.next;
           }
       }
       tail = node;
       tail.next = null;
    }
    // O(n) complexity

    //Question 2 ( LeetCode 21 )
    public static LL merge(LL first , LL second){

        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while ( f != null && s != null){
            if( f.value < s.value ){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while ( f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while ( s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public boolean isHappy(int n) {

        int fast = n;
        int slow = n;

        int a;
        do{
            a = findSquare(slow);
            a = findSquare(findSquare(fast));
        }while(fast != slow);

        if(a == 1){
            return true;
        }
        return false;

    }
    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }

    // Bubble sort in Linked List using Row and column method as done in Recursion pattern video

    public void bubbleSort(){
        bubbleSort(size - 1 , 0);
    }

    private void bubbleSort(int row, int col){
        if(row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }else {
            bubbleSort(row - 1 , 0);
        }
    }


    public static void main(String[] args) {

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = LL.merge(first, second);
       // ans.display();

        LL list = new LL();
        for (int i = 6; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}


















