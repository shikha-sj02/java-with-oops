import java.util.*;
class swap6{
int a=54;
int b=65;
public static void main(String args[]){
swap6 obj = new swap6(); 
System.out.println("before swapping   a3 = " +obj.a+ "  " +"b3 =" +obj.b);
obj.a=obj.a+obj.b;
obj.b=obj.a-obj.b;
obj.a=obj.a-obj.b;
System.out.println("After swapping  a3 = " +obj.a+ "  " + "b3 ="  +obj.b);
}
}