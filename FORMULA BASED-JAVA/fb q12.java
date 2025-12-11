//to find SA,Vol,Peri of Cube
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    System.out.println("Surface Area: "+ 6*b*b);
    System.out.println("Volume: "+ b*b*b);
    System.out.println("Perimeter: "+ 12*b);
}
}