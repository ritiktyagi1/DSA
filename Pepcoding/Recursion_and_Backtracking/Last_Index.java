import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = lastIndex(arr, 0, x);
        System.out.println(fi);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        
        if(idx==arr.length){
            return -1;
        }
        int xiia=lastIndex(arr, idx+1, x);
        if(xiia==-1){
            if(arr[idx]==x){
                return idx;
            }
            else {
                return -1;
            }
        }
        else{
           return xiia; 
        }
    }

}