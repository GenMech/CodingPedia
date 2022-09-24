package com.company;

import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
public class PrintRootToNodePath {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);

        ArrayList<Integer> arr = new ArrayList<>();
        boolean res;
        res = helper(root, arr, 7);

//        for(int nodes: arr){
//            System.out.print(nodes + " ");
//        }
        System.out.println(Arrays.toString(arr.toArray()));
    }

    static boolean helper(Node root, ArrayList<Integer> arr, int x) {
        // if root is NULL
        // there is no path
        if (root == null)
            return false;

        // push the node's value in 'arr'
        arr.add(root.val);

        // if it is the required node
        // return true
        if (root.val == x)
            return true;

        // else check whether the required node lies
        // in the left subtree or right subtree of
        // the current node
        if (helper(root.left, arr, x) || helper(root.right, arr, x))
            return true;

        // required node does not lie either in the
        // left or right subtree of the current node
        // Thus, remove current node's value from
        // 'arr' and then return false
        arr.remove(arr.size() - 1);
        return false;
    }
}
