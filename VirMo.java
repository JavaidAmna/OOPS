class Dog
{
      int age=20;
public void eat( )
{
   System.out.println(age);
}
public void description( )
{
   System.out.println("Dog has " + age );
}
}
public class VirMo
{
public static void main(String arg[])
{
Dog obj=new Dog( );
 obj.eat( );
obj.description( );

obj.age=20;
}
}