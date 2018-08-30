interface Animals
{
	void speak();
	void eat();
}
class dog implements Animals
{

public void speak()
{
	System.out.println("speak in high tone");
}
public void eat()
{
   System.out.println("eats much food");
}
}
class cat implements Animals
{
  public 	void speak()
{
	System.out.println("speak in low tone");
}
public void eat()
{
   System.out.println("not eats too much food");
}
}
class main 
{
	public static void main(String args[])
	{
	    dog obj = new dog();
	    cat obj1 = new cat();
	    obj.speak();
	    obj.eat();
	     obj1.speak();
	    obj1.eat();
	}
}
