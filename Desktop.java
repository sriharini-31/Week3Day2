package week3day2Assignment;

public class Desktop implements Hardware,Software {

	public void SoftwareResources() {
		System.out.println("Software Resources");		
	}

	public Void hardwareResources() {
		System.out.println("Hardware Resources");
				return null;
	}
	
	public void ViewModel() {
		System.out.println("My desktop model is HP");

	}
	public static void main(String[] args) {
		Desktop model = new Desktop();
		model.hardwareResources();
		model.SoftwareResources();
		model.ViewModel();
	}


}
