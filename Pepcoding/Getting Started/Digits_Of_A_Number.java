import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int nod=0;
      int temp=n;
      while(temp!=0){
          temp=temp/10;
          nod++;
      }
      int div=(int)Math.pow(10,nod-1);
      int q=0;
      while(div!=0){
          q=n/div;
          System.out.println(q);
          n=n%div;
          div/=10;
      }
     }
    }