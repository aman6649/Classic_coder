import java.util.Scanner;
class year{
 void leap(int n){
   int len=0,i=n;
   while(i>0){
       i/=10;
       len++;
   }
   if(n<0||len<4||len>4){
       System.out.println("invalid year");
   }
   else {
     if(n%4==0){
         System.out.println("Leap year");
     }
     else {
         System.out.println("not a leap year");
     }
 }



}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the year:");
 int f=s.nextInt();
 year obj=new year();
 obj.leap(f);
}
 catch(Exception e){
 System.out.println("error");
}
}
}