public class Boxer extends BoxingMem{

private int time;
private String activity;
private int weight;

public Boxer(String _first , String _last, int _fee, int _phone, int _time, String  _activity , int _weight){
	super( _first ,  _last,  _fee);
	setTime( _time);
	setActivity( _activity);
	setWeight( _weight);
	}
	
	public void setTime( int _time)
	{
	
time= _time;
}

public void setWeight( int _weight)
{
weight= _weight;
}

public int getWeight()
{
return weight;

}




public int getTime(){
return time;
}

public void setActivity( String _activity)
{
activity= _activity;

}

public String getActivity()
{
return activity;
}


@Override

public String toString()
{
String res=super.toString()+" \n Time: "+getTime()+" \n Weight: "+getWeight()+" \n activity: "+getActivity();
return res;
}

}
	
