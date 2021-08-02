import java.io.*;
import java.util.*;
import java.math.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
public class Solution {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Node insert(Node root,int ele){
        if(root==null) return new Node(ele);
        if(root.data > ele) root.left=insert(root.left,ele);
        else root.right=insert(root.right,ele);
        return root;
    }
    static int height(Node root){
        if(root==null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
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
            bw.write(height(root)+"\n");
        }
        bw.flush();
    }
}
