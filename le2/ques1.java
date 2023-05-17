class Mother
{
    public static void show()
    {
        System.out.println("This is mother class");
    }
}
 class Child extends Mother
{
    
}
public class Main
{
	public static void main(String[] args) 
	{
		Mother m=new Mother();
		m.show();
		Child c=new Child();
		c.show();
	}
}
