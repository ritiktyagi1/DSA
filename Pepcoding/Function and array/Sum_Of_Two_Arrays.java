import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
    int n1=sc.nextInt();
    int arr1[] = new int[n1];
    for(int i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int arr2[] = new int[n2];
    for(int i=0;i<arr2.length;i++){
        arr2[i]=sc.nextInt();
    }
    int n3=n1>n2?n1:n2;
    int res[]= new int[n3];
    int i=n1-1,j=n2-1,c=0,k=n3-1;
    while(k>=0){
        int d=c;
        if(i>=0){
            d+=arr1[i];
        }
        if(j>=0){
            d+=arr2[j];
        }
        c=d/10;
        d=d%10;
        res[k]=d;
        k--;
        i--;
        j--;
        
    }
    if(c!=0){
        System.out.println(c);
    }
    for(int z=0;z<res.length;z++){
        System.out.println(res[z]);
    }
    
 }

}