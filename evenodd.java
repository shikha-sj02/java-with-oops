import java.util.*;
class evenodd{
public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("enter integer: ");
int num = sc.nextInt();
if(num%2==0)
{
 System.out.println("The given integer is even");
}
else{
System.out.println("the given integer is odd");
}
}
}