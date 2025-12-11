//to find SA,Vol of Cuboid
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    int h=sc.nextInt();
    System.out.println("Surface Area: "+ 2*(l*b+b*h+l*h));
    System.out.println("Volume: "+ l*b*h);
}
}