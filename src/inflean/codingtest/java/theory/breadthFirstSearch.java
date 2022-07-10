package inflean.codingtest.java.theory;

import java.util.*;

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class breadthFirstSearch {
    Node root;
    public void BFS(Node root){
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            int L = 0;
            while(!q.isEmpty()){
                int len = q.size();
                System.out.print(L+ ": ");
                for(int i=0; i<len; i++){
                    Node current = q.poll();
                    System.out.print(current.data+" ");
                    if(current.lt!=null) q.offer(current.lt);
                    if(current.rt!= null) q.offer(current.rt);
                }
                L++;
                System.out.println();
        }
    }

    public static void main(String[] args){
        breadthFirstSearch tree = new breadthFirstSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}