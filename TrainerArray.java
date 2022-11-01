package assignmenttwo;

public class TrainerArray {
	String name;
	String department;
	String email;	
	int id;
	
	/*
	 * public TrainerArray(String empName,String empDepartment,String empEmail,int
	 * empId) { name = empName; department = empDepartment ; email = empEmail; id =
	 * empId; }
	 */
	
	public static void main(String[] args) {

		//TrainerArray ta = new TrainerArray(null, null, null, 0);
		
		 String []trainer1 = {"Mukesh","Testing","mukesh@gmail.com", "1"};
		 String []trainer2 = {"Hitesh","Dev","mukesh@gmail.com", "2"};
		 String []trainer3 = {"Mukesh","DevOps","mukesh@gmail.com", "3"};	
		 
		 System.out.println("Name is " + trainer1[0]);
		 System.out.println("Department is " + trainer1[1]);
		 System.out.println("Email is " + trainer1[2]);
		 System.out.println("Id is " + trainer1[3]);
		 System.out.print("Trainer 1 can teach Selenium,");
		 
		 System.out.println("\n---------------------------");
		 
		 System.out.println("Name is " + trainer2[0]);
		 System.out.println("Department is " + trainer2[1]);
		 System.out.println("Email is " + trainer2[2]);
		 System.out.println("Id is " + trainer2[3]);
		 System.out.print("Trainer 2 can teach Web Development,");
		 
		 System.out.println("\n---------------------------");
		 
		 System.out.println("Name is " + trainer3[0]);
		 System.out.println("Department is " + trainer3[1]);
		 System.out.println("Email is " + trainer3[2]);
		 System.out.println("Id is " + trainer3[3]);
		 System.out.print("Trainer 3 can teach Devops.");
		 

}
}