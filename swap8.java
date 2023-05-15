import java.util.*;
class swap8{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the value of a and b =");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("before swapping   a3 = " +a+ "  " +"b3 =" +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping  a3 = " +a+ "  " + "b3 ="  +b);
}
}