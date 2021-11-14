//錯誤在於Cbbb類別沒有提供無引數的建構元,當26行建立Cbbb類別的物件時,會呼叫無引數的建構元Cbbb,Cbbb又會先呼叫父類別Caaa的無引數建構元,因為Caaa已撰寫有引數的建構元,所以Java將不再提供預設的無引數建構元,在找不到建構元的情形下產生錯誤。
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