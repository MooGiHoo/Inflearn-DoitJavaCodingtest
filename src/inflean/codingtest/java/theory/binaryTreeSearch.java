package inflean.codingtest.java.theory;

class node{
    int data;
    node lt, rt;
    public node(int val){
        data = val;
        lt = rt = null;
    }
}

public class binaryTreeSearch {
    node root;
    public void DFS(node root){
        if(root == null) return;
        else{
            System.out.print(root.data +" ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args){
        binaryTreeSearch tree = new binaryTreeSearch();
        tree.root = new node(1);
        tree.root.lt = new node(2);
        tree.root.rt = new node(3);
        tree.root.lt.lt = new node(4);
        tree.root.lt.rt = new node(5);
        tree.root.rt.lt = new node(6);
        tree.root.rt.rt = new node(7);
        tree.DFS(tree.root);
    }
}

//            System.out.print(root.data +" ");
//            DFS(root.lt);
//            DFS(root.rt);
//전위

//            DFS(root.lt);
//            System.out.print(root.data +" ");
//            DFS(root.rt);
//중위

//            DFS(root.lt);
//            DFS(root.rt);
//            System.out.print(root.data +" ");
//후위