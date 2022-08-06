import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int j=0;j<arr.length;j++){
        arr[j]=sc.nextInt();
    }
    int max=arr[0],min=arr[n-1];
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1] && arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<arr[i+1] && arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println(max-min);
 }

}