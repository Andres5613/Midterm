public class Coach extends BoxingMem{

private int phoneNumber;

public Coach(String _first , String _last, int _fee, int _phone){
	super( _first ,  _last,  _fee);
	setPhoneNumber(_phone);
	}
	
	public void setPhoneNumber( int phone)
	{
	
phoneNumber= phone;
}

public int getPhoneNumber(){
return phoneNumber;
}

@Override

public String toString()
{
String res=super.toString()+" \n Phonenumber: "+getPhoneNumber();
return res;
}
}
	
