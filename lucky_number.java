import java.util.Scanner;
class car{
 void num(int n){
     int k=n,c=0,d=0,e=0;
     while(k>0){
         k/=10;
         c++;
     }
     k=n;
     if(c!=4){
         System.out.println(n+" is not a valid car number");
     }
     else{
         c=0;
         while(k>0){
             c=k%10;
             e+=c;
             if(c==3||c==5||c==7){
                 d=1;
             }
              k/=10;
         }
         if(d==1){
             if(e%3==0||e%5==0||e%7==0){
                 System.out.println("Lucky number");
                 
             }
             else{
                 System.out.println(" Sorry it's not my lucky number");
             }
         }
         else{
             System.out.println(" Sorry it's not my lucky number");
         }
     }
}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
 System.out.println("enter the distance travelled :");
 int b=s.nextInt();
 car obj=new car();
 obj.num(b);
}
 catch(Exception e){
 System.out.println("error");
}
}
}