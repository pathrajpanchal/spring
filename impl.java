class sbi implements transaction//==============================SBI
{
	public void display()
	{
		System.out.println("sbi bank welcomes you");
	}
}
class axis implements transaction//=============================AXIS
{
	public void display()
	{
		System.out.println("axis bank welcomes you");
	}
}
interface transaction//=========================================TRANSACTIOON INTERFACE
{
	public void display();
}
class bankFactory//=====================BANK FACTORY
{
	public static transaction getInstance(String a)
	{
		if(a.equals("sbi"))
		{
			return new sbi();
		}else
		{
			
			return new axis();
		}
				
	}
	
}
public class impl
{
	public static void main(String bank[])
	{
		transaction trr=bankFactory.getInstance(bank[0]);
		trr.display();
	}
}