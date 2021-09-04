import java.util.*;
public class NewAss{
   
   static int newMethod1(int x, int y){
     return x + y;
   }

   static double newMethod2(double x , double y){
     return x + y;
   }

   static String newMethod3(String x , String y){
     return x + y;
   }
    public static void main(String[] args){
      System.out.println("newMethod1() = " + newMethod1(2, 3)); 
      System.out.println("newMethod2() = " + newMethod2(2, 3)); 
      System.out.println("newMethod3() = " + newMethod3("2", "3"));  

   }       
 }
