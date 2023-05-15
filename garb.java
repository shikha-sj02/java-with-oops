import java.util.*;
public class garb{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 int size = sc.nextInt();
int number[] = new int[size];
for(int i=0; i<size; i++)
{
  number[i] = sc.nextInt();
}
int max= Ineger.Min_Value;
int min= Integer.Max_Value;
for(int i=0; i<size; i++)
{
 if(number[i] < min){
 min = number[i];
}
 if(number[i] > max){
 max = number[i];
}
}
System.out.println("largest no is = " + max);
System.out.println("smallest no is = " + min);
}
}