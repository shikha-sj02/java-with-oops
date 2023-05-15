import java.util.*;
class A{
         int M=93;
       }

class B extends A{
         int P=85;
       }

class C extends B{
         int Ch=73;
       }
class D extends C{
         int H=74;
       }
class E extends D{
         int Sc=89;
       }
class F extends E{
public static void main(String args[]){
F obj = new F();
int avg;
avg = ((obj.M + obj.P + obj.Ch + obj.H +obj.Sc)/5);
System.out.println("average is "+avg);
}
}