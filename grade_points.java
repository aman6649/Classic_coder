import java.util.Scanner;
class grade{
 void point(float n){
if(n==5.0){
    System.out.println("Grade: O");
}
else if(n>=4.5&&n<5.0){
    System.out.println("Grade: A");
}
else if(n>=4.0&&n<4.5){
    System.out.println("Grade: B");
}
else if(n>=3.0&&n<4.0){
    System.out.println("Grade: C");
}
else if(n>=2.0&&n<3.0){
    System.out.println("Grade: D");
}
else if(n>=1.0&&n<2.0){
    System.out.println("Grade: E");
}
else if(n>=0.0&&n<1.0){
    System.out.println("Grade: F");
}
}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the grade point");
 float f=s.nextFloat();
 grade obj=new grade();
 obj.point(f);
}
 catch(Exception e){
 System.out.println("error");
}
}
}