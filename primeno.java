import java.util.Scanner;
class prime{
 void primeno(int a,int b){
   if(a>=b||a<0||b<0){
     System.out.println("provide valid input");
}
   else {
 int i;
 for(i=a;i<=b;i++){
 int j=2,count=0;
 while(j<=i){
 if(i%j==0){
 count++;
}
j++;
}
if(count==1){
 System.out.print(i+" ");
}

}

}
}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter first number");
 int f=s.nextInt();
 System.out.println("enter second number");
 int l=s.nextInt();
 prime obj=new prime();
 obj.primeno(f,l);
}
 catch(Exception e){
 System.out.println("error");
}
}
}