import java.util.Scanner;
class currency{
 void num(String s,int n){
     float d;
    if(s.equalsIgnoreCase("CAD")){
         d=(float) (n*52.08);
        System.out.println("Canada dollar "+n+" equals to "+d+" Indian Rupee");
    }
    else if(s.equalsIgnoreCase("HKD")){
        d=(float) (n*8.86);
        System.out.println("Hong Kong dollar "+n+" equals to "+d+" Indian Rupee");
    }
    else if(s.equalsIgnoreCase("SGD")){
        d=(float) (n*51.29); 
        System.out.println("Singapore dollar "+n+" equals to "+d+" Indian Rupee");
    }
    else if(s.equalsIgnoreCase("USD")){
        d=(float) (n*69.55);
        System.out.println("USA dollar "+n+" equals to "+d+" Indian Rupee");
    }
    else{
        System.out.println("Curency code not found");
    }

}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the currency code:");
 String a=s.next();
 System.out.println("enter the amount:");
 int b=s.nextInt();
 currency obj=new currency();
 obj.num(a,b);
}
 catch(Exception e){
 System.out.println("error");
}
}
}