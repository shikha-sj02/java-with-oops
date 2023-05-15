import java.util.*;
class swap1{
int a;
int b;
public static void main(String args[]){
swap1 obj = new swap1();
int c;
Scanner sc = new Scanner(System.in);
System.out.print("enter the value of a and b = ");
obj.a = sc.nextInt();
obj.b = sc.nextInt();
System.out.println("before swapping   a3 = " +obj.a+ "  " +"b3 =" +obj.b);
c=obj.a;
obj.a=obj.b;
obj.b=c;
System.out.println("After swapping  a3 = " +obj.a+ "  " + "b3 ="  +obj.b);
}
}