import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int maxFloor=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>maxFloor){
            maxFloor=arr[i];
        }
    }
    
    for(int i=maxFloor;i>=1;i--){
        for(int j=0;j<arr.length;j++){
            if(arr[j]>=i){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    
 }

}