//在撰寫(e)時,要先宣告一個陣列,用來存放6個物件的面積,然後要將這6個物件的面積值分別設給陣列元素儲存,再將這個陣列傳入largest()method中進行比較大小,最後傳回最大的面積值。使用這種方式,會相當浪費記憶體的空間,同時也會使得設值給陣列存放時,無法有效的運用迴圈來為陣列設值,造成程式過於冗長。
class CShape{
public double area(){
 return 0;
}
}
class CCircle extends CShape{
 double radius;
public CCircle(double r){
 radius=r;
}
public double area(){
 return (3.14*radius*radius);
}
}
class CSquare extends CShape{
 double side;
public CSquare(double s){
 side=s;
}
public double area(){
 return (side*side);
}
}
class CTriangle extends CShape{
 double base,height;
public CTriangle(double b,double h){
 base=b;
 height=h;
}
public double area(){
 return (base*height/2);
}
}
public class Main{
public static void main(String args[]){
 CCircle cir1=new CCircle(1.0);
 CCircle cir2=new CCircle(2.0);
 CSquare squ1=new CSquare(1.0);
 CSquare squ2=new CSquare(2.0);
 CTriangle tri1=new CTriangle(3,6);
 CTriangle tri2=new CTriangle(4,10);
 double a[]=new double[6];

 System.out.println("circle(1.0)="+cir1.area());
 System.out.println("circle(2.0)="+cir2.area());
 System.out.println("square(1.0)="+squ1.area());
 System.out.println("square(2.0)="+squ2.area());
 System.out.println("triangle(3,6)="+tri1.area());
 System.out.println("triangle(4,10)="+tri2.area());
 
 a[0]=cir1.area();
 a[1]=cir2.area();
 a[2]=squ1.area();
 a[3]=squ2.area();
 a[4]=tri1.area();
 a[5]=tri2.area();
 System.out.println("The largest area is "+largest(a));
}
public static double largest(double a[]){
 double max=a[0];
 for(int i=0;i<a.length;i++)
 if(max<a[i])
 max=a[i];
 return max;
}
}

//circle(2.0)=12.56
//square(1.0)=1.0
//square(2.0)=4.0
//triangle(3,6)=9.0
//triangle(4,10)=20.0
//The largest area is 20.0