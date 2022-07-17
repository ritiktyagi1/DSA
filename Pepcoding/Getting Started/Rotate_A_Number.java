import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     int k=sc.nextInt();
     int digit=0;
     int temp=n;
     while(temp!=0){
         digit++;
         temp/=10;
     }
     k=k%digit;
     if(k<0){
         k=digit+k;
         int rotn=0;
         int dev=(int)Math.pow(10,k);
         int rem=n%dev;
         int mul=digit-k;
         rotn+=rem*(int)Math.pow(10,mul);
         rotn+=n/dev;
         System.out.println(rotn);
     }
     else {
         int rotn=0;
         int dev=(int)Math.pow(10,k);
         int rem=n%dev;
         int mul=digit-k;
         rotn+=rem*(int)Math.pow(10,mul);
         rotn+=n/dev;
         System.out.println(rotn);
     }
    }
   }