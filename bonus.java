import java.util.Scanner;
class distance{
 void num(int n){
     int pe=1,po=1,b=0,c=0,d=1,bp=0,k=n;
     if(n<=0){
         System.out.println("Invalid input");
     }
     else{
     while(k>0){
         k=k/10;
         c++;
     }
     
         for(int j=1;j<=c;j++){
             d=n%10;
             if(c%2==0){
                if(j%2==0){
                   pe*=d;
                }
                else{
                    po*=d;
                }
             }
             else{
                 if(j%2==0){
                   po*=d;
                }
                else{
                    pe*=d;
                }
             }
             n/=10;
     }
         if(pe==po){
             bp=pe*2;
         }
         else if(pe>po){
             bp=pe;
         }
         else{
             bp=po;
         }
         System.out.println("Bonus point the player get is "+bp);
     }     

}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
 System.out.println("enter the distance travelled :");
 int b=s.nextInt();
 distance obj=new distance();
 obj.num(b);
}
 catch(Exception e){
 System.out.println("error");
}
}
}