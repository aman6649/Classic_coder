import java.util.Scanner;
class key{
 void num(long n,int k){
     long i=n;
     int a,count=0;
  while(i>0){
      a=(int)(i%10);
      if(a==k){
          count++;
      }
      i/=10;
  }
  System.out.println(k+" appears "+count+" times in "+n);

}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the number:");
 long a=s.nextLong();
 System.out.println("enter the key");
 int b=s.nextInt();
 key obj=new key();
 obj.num(a,b);
}
 catch(Exception e){
 System.out.println("error");
}
}
}