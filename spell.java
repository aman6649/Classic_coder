import java.util.Scanner;
class spell{
 void practice(char a,char b,char c,char d,char e,char f,char g){
  if(a=='R'&& b=='A'&&c=='I'&&d=='N'&&e=='B'&&f=='O'&&g=='W'){
      System.out.println("RAINBOW");
  }
  else{
      System.out.println("the spelling is wrong");
  }


}

public static void main(String[] args){
try{
 Scanner s=new Scanner(System.in);
  System.out.println("enter the first letter:");
 char a=s.next().charAt(0);
 System.out.println("enter the second letter:");
 char b=s.next().charAt(0);
 System.out.println("enter the third letter:");
 char c=s.next().charAt(0);
 System.out.println("enter the fourth letter:");
 char d=s.next().charAt(0);
 System.out.println("enter the fifth letter:");
 char e=s.next().charAt(0);
 System.out.println("enter the sixth letter:");
 char f=s.next().charAt(0);
 System.out.println("enter the seventh letter:");
 char g=s.next().charAt(0);
 spell obj=new spell();
 obj.practice(a,b,c,d,e,f,g);
}
 catch(Exception e){
 System.out.println("error");
}
}
}