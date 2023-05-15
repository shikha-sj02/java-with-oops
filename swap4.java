import java.util.*;
class swap4{
public static void main(String args[]){
int a;
int b;
int c;
Scanner sc = new Scanner(System.in);
System.out.print("enter the value of a and b = ");
a = sc.nextInt();
b = sc.nextInt();
System.out.println("before swapping   a3 = " +a+ "  " +"b3 =" +b);
c=a;
a=b;
b=c;
System.out.println("After swapping  a3 = " +a+ "  " + "b3 ="  +b);
}
}