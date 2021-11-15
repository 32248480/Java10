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
 CShape shp[]=new CShape[6];
 shp[0]=new CCircle(1.0);
 shp[1]=new CCircle(2.0);
 shp[2]=new CSquare(1.0);
 shp[3]=new CSquare(2.0);
 shp[4]=new CTriangle(3,6);
 shp[5]=new CTriangle(4,10);
 for(int i=0;i<shp.length;i++)
 System.out.println("area of shp["+i+"]="+shp[i].area());
 System.out.println("The largest area is "+largest(shp));
}
public static double largest(CShape a[]){
 double max=a[0].area();
 for(int i=0;i<a.length;i++)
 if(max<a[i].area())
 max=a[i].area();
 return max;
}
}

//area of shp[0]=3.14
//area of shp[1]=12.56
//area of shp[2]=1.0
//area of shp[3]=4.0
//area of shp[4]=9.0
//area of shp[5]=20.0
//The largest area is 20.0