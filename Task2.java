package Lab5;
import java.util.Scanner;

public class Task2 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a Integer :");  
  int n=sc.nextInt();
  boolean flag=isEven(n);
  if(flag) {
	  System.out.println(" Even");
  }
  else
	  System.out.println("Odd");
 }
 
 public static boolean isEven(int num) {
	boolean isEven=false;
	 if (num%2==0) {
		isEven=true; 
	 }
	 else {
		 isEven=false;
	 }
	 return isEven;
 }
}
