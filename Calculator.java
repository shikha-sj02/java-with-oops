import java.util.*;
class Calculator{
public static void main(String args[]){
 
Scanner sc = new Scanner(System.in);
System.out.println("enter case: ");
int n = sc.nextInt();
System.out.println("enter the value of a and b: ");
int a = sc.nextInt();
int b = sc.nextInt();

int c;
switch(n){
case 1: c=a+b;
        System.out.println(c);
        break;
case 2: c=a-b;
        System.out.println(c);
        break;
case 3: c=a*b;
        System.out.println(c);
        break;
case 4: c=a/b;
        System.out.println(c);
        break;
case 5: c=a%b;
        System.out.println(c);
        break;
default: System.out.print("invalid case");
}
}
}