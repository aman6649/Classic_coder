# Classic_coder
# JAVA PROGRAMMING
USE OF OOPs CONCEPT , INHERITANCE AND KEYWORD SUCH AS.... SUPER , THIS
......................................
class a{
 int i=10;
}
class b extends a{
 int i=20;
 void print(int i){
 System.out.println(i);
 System.out.println(this.i);
 System.out.println(super.i);
}
public static void main(String[] args){
 b obj=new b();
 obj.print(30);
} 
}
