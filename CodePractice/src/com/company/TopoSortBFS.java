package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Program for Kahn's Algorithm ( Topological Sort with BFS )

public class TopoSortBFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= 6; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

//      System.out.println(Arrays.toString(adj.toArray())); // to print our adj list
        int[] ans = topo(6, adj);
        System.out.println(Arrays.toString(ans));
    }

    static int[] topo(int V, ArrayList<ArrayList<Integer>> A){
        int[] indegree = new int[V];
        for(int i = 0; i < V; i++){
            for(int it: A.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int a = 0;
        int[] topoArr = new int[V];
        while(!q.isEmpty()){
            int node = q.poll();
            topoArr[a++] = node;

            for(int j: A.get(node)){
                indegree[j]--;
                if (indegree[j] == 0){
                    q.add(j);
                }
            }
        }
       return topoArr;
    }
}
