//(a),(b),
class CRectangle{
 protected int length;
 protected int width;

public CRectangle(int l,int w){
 length=l;
 width=w;
}
public String toString(){
 String str="length="+length+", width="+width;
 str+=", area="+length*width;
 return str;
}

public String toString(int a,int b){
 if(a>=b)
 return super.toString();
 else
 return "Argument Error";
}
}

public class Main{
public static void main(String args[]){
 CRectangle rect=new CRectangle(2,6);
 System.out.println(rect.toString());
 System.out.println(rect.toString(8,4));
 System.out.println(rect.toString(3,5));
}
}

//length=2, width=6, area=12
//CRectangle@28a418fc
//Argument Error

//(c),
//�b(a)�M(b)���ҩw�q�����toString()method�o�H�P�ɦs�b��@�����O��,�O�Q��OOP�����u�h���v�C