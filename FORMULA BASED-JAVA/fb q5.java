//to find distance beetween two points
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a1=sc.nextInt();
    int a2=sc.nextInt();
    int b1=sc.nextInt();
    int b2=sc.nextInt();
    double dist=Math.sqrt(Math.pow(b1-a1,2) + Math.pow(b2-a2,2));
    System.out.println(dist);
}
}