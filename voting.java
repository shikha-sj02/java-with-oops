import java.util.*;
class vote{
public static void main(String args[]){

Scanner sc = new Scanner(System.in); 
System.out.println("enter age: ");
int age = sc.nextInt();
if(age>18)
{
 System.out.println("Eligible for voting");
}
else{
System.out.println("non eligible for voting");
}
}
}