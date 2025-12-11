//to find SA,Vol of Cylinder
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float a= sc.nextFloat();
    int r=sc.nextInt();
    int h=sc.nextInt();
    System.out.println("Surface Area: "+ 2*a*r*(r+h));
    System.out.println("Volume: "+ a*r*r*h);
}
}