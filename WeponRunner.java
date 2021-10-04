class WeponRunner{
public  static void main(String[] denger){
Wepon ref=new Wepon();
System.out.println(ref.name);
System.out.println(ref.type);
System.out.println(ref.colour);
System.out.println(ref.magzin);
System.out.println(ref.sound);
System.out.println(ref.weight);
System.out.println(ref.price);


String name="scaral";
String type="snapper";
String colour="gray";
int magzin=30;
String sound="high";
String weight="bohot";
float price=200.4f;
Wepon ref1=new Wepon(name,type,colour,magzin,sound,weight,price);
System.out.println(ref1.name);
System.out.println(ref1.type);
System.out.println(ref1.colour);
System.out.println(ref1.magzin);
System.out.println(ref1.sound);
System.out.println(ref1.weight);
System.out.println(ref1.price);
}
}