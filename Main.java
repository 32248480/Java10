//���~�b��Cbbb���O�S�����ѵL�޼ƪ��غc��,��26��إ�Cbbb���O�������,�|�I�s�L�޼ƪ��غc��Cbbb,Cbbb�S�|���I�s�����OCaaa���L�޼ƫغc��,�]��Caaa�w���g���޼ƪ��غc��,�ҥHJava�N���A���ѹw�]���L�޼ƫغc��,�b�䤣��غc�������ΤU���Ϳ��~�C
class Caaa{
 private int num;

public Caaa(int n){
 num=n;
}
public int get(){
 return num;
}
}
class Cbbb extends Caaa{
public Cbbb(){
 super(2);
}
public void show(){
 System.out.println("num="+get());
}
}
public class Main{
public static void main(String args[])
{
 Cbbb bb=new Cbbb();
 bb.show();
}
}

//num=2