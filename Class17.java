//(a),(b),(c),(d),
class Car{
 protected String owner;
 protected String id;

public Car(String own,String s){
 owner=own;
 id=s;
}

final void show(){
 System.out.println("車主姓名:"+owner);
 System.out.println("車牌號碼:"+id);
}
}

class CColor extends Car{
 public String color;

public CColor(String own,String s,String col){
 super(own,s);
 color=col;
}
public void show(){
 System.out.println("車主姓名:"+owner);
 System.out.println("車牌號碼:"+id);
 System.out.println("車身顏色:"+color);
}
}

public class Main{
public static void main(String args[]){
 CColor mycar=new CColor("Riaan","A1-2345","Black");
 mycar.show();
}
}

//(e),
//程式編譯後,產生了如下的錯誤訊息:
//show() in CColor cannot override show() in Car; overridden method is final public void show()
//錯誤訊息是指,CColor類別裡的show()method無法改寫父類別Car裡的show()method,父類別Car裡的show()method為final,不能被改寫。
//將CColor類別裡的show()method 刪除,直接使用父類別裡的show() method可以解決。

class Car{
 protected String owner;
 protected String id;

public Car(String own,String s){
 owner=own;
 id=s;
}
final void show(){
 System.out.println("車主姓名:"+owner);
 System.out.println("車牌號碼:"+id);
}
}

class CColor extends Car{
 public String color;

public CColor(String own,String s,String col){
 super(own,s);
 color=col;
}
}

public class Main{
public static void main(String args[]){
 CColor mycar=new CColor("Riaan","A1-2345","Black");
 mycar.show();
 System.out.println("車身顏色:"+mycar.color);
}
}

//車主姓名:Riaan
//車牌號碼:A1-2345
//車身顏色:Black
