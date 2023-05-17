class One
{
    One(int x)
    {
        int a=x;
        System.out.println(a);
    }
}
class Two extends One 
{
    Two()
    {
        super(5);
    }
}
public class Main
{
	public static void main(String[] args) {
		One a=new One(5);
	
	}
}
