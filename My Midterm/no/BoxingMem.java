public class BoxingMem{
	private String firstName;
private String lastName;
	private int fee;
	
	
	public BoxingMem( String _first , String _last, int _fee)

	{

	firstName= _first;
	lastName= _last;
	fee= _fee;
	
	
	}

	public void setFirstName( String first)
	{
	firstName= first;
	}


	public String getFirstName( )
	{
	return firstName;	
	}



	public void setLastname( String last)
	{
	lastName= last;
	}


	public String getLastName()
	{
	return lastName;
	}


	public void setFee( int fees)
	{
	fee= fees;
	}

	public int getFee( )
	{
 	return fee;
 	}
 	
	@Override

	public String toString()
	{

	
	String res=getFirstName()+getLastName()+" \n Fee:  "+getFee();
return res;
	}


	}









