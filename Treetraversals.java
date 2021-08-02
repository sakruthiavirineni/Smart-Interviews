import java.io.*;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }
}
public class Solution {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static void preOrder(Node root) throws IOException{
        if(root==null) return;
        bw.write(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    
    static void inOrder(Node root) throws IOException{
        if(root==null) return;
        inOrder(root.left);
        bw.write(root.data+" ");
        inOrder(root.right);
        
    }
    
    static void postOrder(Node root) throws IOException{
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        bw.write(root.data+" ");
    }
    
    
    static Node insert(Node root, int ele){
        if(root==null) return new Node(ele);
        if(root.data > ele) root.left=insert(root.left,ele);
        else root.right = insert(root.right,ele);
        return root;
    }
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int tests=s.nextInt();
        while(tests-->0){
            int n = s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            Node root=null;
            for(int ele : arr){
                root=insert(root,ele);
            }
            preOrder(root);
            bw.write("\n");
            inOrder(root);
            bw.write("\n");
            postOrder(root);
            bw.write("\n");
            bw.write("\n");
        }
        bw.flush();
    }
}
