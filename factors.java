import java.util.Scanner;
class factor{
 void num(int n){
     if(n==0){
         System.out.println("No Factors");
     }
     else if(n<0){
         n*=-1;
     }
     System.out.print("1");
    for(int i=2;i<=n;i++){
        if(n%i==0){
            System.out.print(","+i);
        }
    }

}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the number:");
 int b=s.nextInt();
 factor obj=new factor();
 obj.num(b);
}
 catch(Exception e){
 System.out.println("error");
}
}
}