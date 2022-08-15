import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
    }
    
    int n2=sc.nextInt();
    int arr2[]= new int[n2];
    for(int i=0;i<arr2.length;i++){
        arr2[i]=sc.nextInt();
    }
    
    int diff[]=new int[n2];
    int c=0; 
    
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=diff.length-1;
    
    while(k>=0){
        int d=0;
        int val= (i >=0 ? arr1[i] :0);
        if(arr2[j]+ c >= val){
            d=arr2[j]-val+c;
            c=0;
        }
        else {
            d=arr2[j]-val+c+10;
            c=-1;
        }
        diff[k]=d;
        k--;
        i--;
        j--;
    }
    int idx = 0;
    while (idx < diff.length && diff[idx] == 0) {
      idx++;
    }

    while (idx < diff.length) {
      System.out.println(diff[idx++]);

    }
    
 }

}