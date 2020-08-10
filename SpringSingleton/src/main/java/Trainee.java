
public class Trainee {

	TraineeInfo infodata;
Trainee()
{
	System.out.println("inside constructor");
}
	public Trainee(TraineeInfo infodata) {
		System.out.println("inside constructor 1");
		this.infodata = infodata;
		
	}
	public TraineeInfo getInfodata() {
		return infodata;
	}
	public void setInfodata(TraineeInfo infodata) {
		System.out.println("inside method");
		this.infodata = infodata;
	}
	public void show()
	{
		System.out.println("other:"+infodata.getAddress()+"and city:"+infodata.getCity());
	}
	
}
