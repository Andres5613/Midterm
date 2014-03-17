public class Heavywieght extends Boxer{

private String weightlifting;

public Heavywieght(String _first , String _last, int _fee, int _phone, int _time, String  _activity , int _weight, String _weightlifting){
	super( _first ,  _last,  _fee, _phone , _time, _activity, _weight);
	setWeightLifiting( _weightlifting);

	}
	
	public void setWeightLifting( String _weightLifting){
weightlifting= _weightLifting;
}



public String getWeightLifting()
{
return weightlifting;

}

public void setWeightLifiting(String _weightlifting)
{
 weightlifting=_weightlifting;

}






@Override
public String toString()
{
String res=super.toString()+" \n Weightlifting: "+getWeightLifting();
return res;

}

}

	