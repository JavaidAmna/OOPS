public class Modifiers
{
    int num;
    String name;
 void  Customers(String a,int n)
{ 
      name=a;
      num=n;
System.out.println("Name"  +name + "Number"  + num);
}
public static void main(String arg[])
{
 Modifiers obj=new Modifiers();
      obj.Customers("Ali",580);
}
}

