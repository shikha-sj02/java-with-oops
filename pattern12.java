import java.util.*;
class pallidromic{
public static void main(String args[]){
System.out.println(" \n Diamond pattern : ");
for(int i=1; i<=4; i++){
  for(int j=4; j>=i-1; j--){
  System.out.print("  ");
  }
  for(int j=1; j<=i; j++){
  System.out.print("* "); 
  }
  for(int j=2; j<=i; j++){
  System.out.print("* "); 
  }
  System.out.println();
}
for(int i=3; i>=1; i--){
  for(int j=4; j>=i-1; j--){
  System.out.print("  ");
  }
  for(int j=1; j<=i; j++){
  System.out.print("* "); 
  }
  for(int j=2; j<=i; j++){
  System.out.print("* "); 
  }
  System.out.println();
}

}
}