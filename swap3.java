import java.util.*;
class swap3{
int a=65;
int b=98;
public static void main(String args[]){
swap3 obj = new swap3();
int c;
System.out.println("before swapping   a = " +obj.a+ "  " +"b =" +obj.b);
c=obj.a;
obj.a=obj.b;
obj.b=c;
System.out.println("After swapping  a = " +obj.a+ "  " + "b ="  +obj.b);
}
}