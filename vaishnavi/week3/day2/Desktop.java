package week3.day2.assignments;

public  class Desktop implements Hardware,Software {
	public void ViewModel() {
		System.out.println("The desktop model is HP");

	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware resources");
		
	}

	public void SoftwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software resources");
		
	}
public static void main(String[] args) {
	Desktop model = new Desktop();
	model.hardwareResources();
	model.SoftwareResources();
	model.ViewModel();
}
	
	}


