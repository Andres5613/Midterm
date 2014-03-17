public class CoachTest{
	public static void main (String []args ) {



	BoxingMem[] members= new BoxingMem[3];
	members[0]=new Coach("Sofia ", "Di Lorenzo", 180, 9546652);
	members[1]=new Boxer("Rodrigo ", "Lopez", 180, 88, 730, "Train", 127);
	members[2]=new Heavywieght("Victor ", "Ishna", 9000, 954, 700, "Train", 150, "Bulk");   
	

//for(BoxingMem currentBoxingMem: members){
//System.out.println(currentBoxingMem[]);
	//}
	
	for(int i=0;i<members.length;i++){
		System.out.println(members[i]);
	}
	
}
}
//Coach: String _first , String _last, int _fee, int _phone
//String _first , String _last, int _fee, int _phone, int _time, String  _activity , int _weight