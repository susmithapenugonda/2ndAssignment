package assignmenttwo;

import java.util.Scanner;

public class StudentScanner {
	
	String name;
    String email;
    int phone;
    String address;
    String status;
	
    StudentScanner(String name,String email,int phone,String address, String status)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.status=status;
        
    }	
	public static void main(String[] args)  {
			
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of students : ");
		
		int number=sc.nextInt();
		StudentScanner[] obj = new StudentScanner[number] ;
		
		for(int i=0;i<3;i++)
			
		{			
		
		sc.nextLine();		
		
		System.out.println("Please enter Name : ");
		
		String name=sc.nextLine();
		
		System.out.println("Please enter Email : ");
		
		String email=sc.nextLine();
		
		System.out.println("Please enter Phone : ");
		
		int phone=sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("Please enter Address : ");
		
		String address=sc.nextLine();
		
		System.out.println("Please enter Status : ");
		
		String status=sc.next();
		
	    obj[i]=new StudentScanner(name,email,phone,address,status);
		
		}
		
		System.out.println("Please enter which student details are looking for : ");
		int number1=sc.nextInt();
		
		System.out.println(obj[number1].name);
		System.out.println(obj[number1].email);
		System.out.println(obj[number1].phone);
		System.out.println(obj[number1].address);
		System.out.println(obj[number1].status);
		
		}	

}
