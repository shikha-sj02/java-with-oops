import java.util.*;
class SimpleInterest{
public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("enter the principle,time and rate: ");
int p = sc.nextInt();
int t = sc.nextInt();
int r = sc.nextInt();
int SI = (p*r*t)/100;
System.out.println(SI);

}
}