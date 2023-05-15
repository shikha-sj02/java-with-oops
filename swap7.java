import java.util.*;
class swap7{
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
public static void main(String args[]){

System.out.println("enter the value of a and b =");
swap7 obj = new swap7(); 
System.out.println("before swapping   a3 = " +obj.a+ "  " +"b3 =" +obj.b);
obj.a=obj.a+obj.b;
obj.b=obj.a-obj.b;
obj.a=obj.a-obj.b;
System.out.println("After swapping  a3 = " +obj.a+ "  " + "b3 ="  +obj.b);
}
}