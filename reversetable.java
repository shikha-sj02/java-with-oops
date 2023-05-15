import java.util.*;
class reversetable{
public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("enter number: ");
int num = sc.nextInt();
int i;
for( i=10;i>=1;i--)
{
 System.out.println(num*i);
}
}
}