//to find SA,Vol of Sphere
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float a= sc.nextFloat();
    int r=sc.nextInt();
    System.out.println("Surface Area: "+ 4*(a*r*r));
    System.out.println("Volume: "+ (4.0/3)*(a*r*r*r));
}
}