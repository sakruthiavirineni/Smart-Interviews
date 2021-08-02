/*You are given an integer array and a number K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tests = Integer.parseInt(br.readLine());
        while(tests-->0){
            String inp[]=br.readLine().split(" ");
            int n =Integer.parseInt(inp[0]);
            int k = Integer.parseInt(inp[1]);
            int arr[]=new int[n];
            String inp1[]=br.readLine().split(" ");
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(inp1[i]);
            }
            Arrays.sort(arr);
            int flag=-1;
            for(int i=0;i<n-2;i++){
            int p1=i+1;
            int p2=n-1;
            while(p1<p2){
                if(arr[i]+arr[p1]+arr[p2]==k){
                    flag=1;
                    break;
                }
                else if(arr[i]+arr[p1]+arr[p2]<k)
                    p1++;
                else 
                    p2--;
            }
            }
            if(flag==1){
                bw.write("true");
            } else {
                bw.write("false");
            }
            bw.newLine();
        }
        bw.flush();
    }
}
