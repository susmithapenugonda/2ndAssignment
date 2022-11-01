package assignmenttwo;

public class Trainer {

	String name;
	String department;
	String email;	
	int id;
	
	public Trainer(String empName,String empDepartment,String empEmail,int empId)
	{	
		  name = empName;
		  department = empDepartment ;
		  email = empEmail;
		  id = empId;
	}
	
	public void selenium()
    {
        System.out.print("Trainer 1 can teach Selenium,");
    }
    public void WebDev()
    {
        System.out.print("Trainer 2 can teach Web Development,");
    }
    public void DevOps()
    {
        System.out.print("Trainer 3 can teach Devops.");
    }
	public static void main(String[] args) {
		
		Trainer trainer1 = new Trainer("Mukesh","Testing","mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh","Dev","mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh","DevOps","mukesh@gmail.com", 3);
		
		
		System.out.println("Trainer1 Information : ");
		trainer1.displayInformation();
		trainer1.selenium();
		
		System.out.println("\n---------------------------");
		System.out.println("Trainer2 Information : ");
		trainer2.displayInformation();
		
		trainer2.WebDev();
		System.out.println("\n---------------------------");
		System.out.println("Trainer3 Information : ");
		trainer3.displayInformation();
		trainer3.DevOps();

	}
	
	public void displayInformation() {
		System.out.println("Name : " + name);
		System.out.println("Department : " + department);
		System.out.println("Email : " + email);
		System.out.println("Employee id : " + id);
	}

}
