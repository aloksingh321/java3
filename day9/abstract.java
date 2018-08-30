import java.util.Scanner; 
abstract class Animals
{
String  color;
String breed;
String name;
public abstract void eat();	
}
class dog extends Animals
{
String color;
String breed;
String name; 
dog(String color,String breed,String name)
{
	this.color=color;
	this.breed=breed;
	this.name=name;
}

public void eat()
{
	System.out.println("heavy diet dog take");
	System.out.println(" color = "+color+" breed = "+breed+" name = "+name);
}
public void speak()
{
	System.out.println("have a high pitch of sound");
}


}
class cat extends Animals
{
	
String color;
String breed;
String name; 
cat(String color,String breed,String name)
{
	this.color=color;
	this.breed=breed;
	this.name=name;
}

public void eat()
{
	System.out.println("heavy diet dog take");
	System.out.println(" color = "+color+" breed = "+breed+" name = "+name);
}
public void speak()
{
	System.out.println("have a high pitch of sound");
}

}
class main
{
	public static void main(String args[])
	{
      Scanner obj = new Scanner(System.in);        	
     String color;
     String breed;
     String name; 
     System.out.println("enter color,breed and name of cat :-");
    color=obj.next();
    breed=obj.next();
    name=obj.next();
   cat sc = new cat(color,breed,name);
     sc.eat();
     sc.speak();
     System.out.println("enter color,breed and name of dog :-");
     color=obj.next();
    breed=obj.next();
    name=obj.next();
     dog sc1= new dog(color,breed,name);
       sc1.eat();
       sc1.speak();
	}
}