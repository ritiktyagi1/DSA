import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int d= sc.nextInt();
    int flag=-1;
    for(int i=0;i<n;i++){
        if(d==arr[i]){
            System.out.println(i);
            flag=1;
            break;
        }
    }
    if(flag==-1){
        System.out.println(flag);
    }
 }

}