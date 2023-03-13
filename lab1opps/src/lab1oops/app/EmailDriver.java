package lab1oops.app;

import java.util.Scanner;

import lab1oops.model.Employee;
import lab1oops.service.CredServiceImpl;

public class EmailDriver {
	public static void main (String[ ]srgs) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
		String fname=sc.next();
		System.out.println("Enter last name");
		String lname=sc.next();
		
		
		Employee e1=new Employee(fname,lname);
		
		Employee e2=new Employee();
		e2.setFirstname(fname);
		e2.setLastname(lname);
		
		
		
		CredServiceImpl cs=new CredServiceImpl();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. legal");
		System.out.println("Enter Choice");
		int choice=sc.nextInt();
		String genemial="";
		String genpass="";
		switch(choice)
		{
		case 1:
			genemial=cs.genetateEnailed(e1.getFirstname() .toLowerCase(), e1.getLastname(), "tech");
			break;
		case 2:
			genemial=cs.genetateEnailed(e1.getFirstname() .toLowerCase(), e1.getLastname(), "admin");
			break;
		case 3:
			genemial=cs.genetateEnailed(e1.getFirstname() .toLowerCase(), e1.getLastname(), "HR");
			break;
		case 4:
			genemial=cs.genetateEnailed(e1.getFirstname() .toLowerCase(), e1.getLastname(), "legal");
			break;
		
		default:
			 System.out.println("Please enter valid choice");
		}
		genpass = cs.genetatePassword();
		e1.setEmail(genemial);
		e1.setPassword(genpass);
		
		cs.ShowDeailes(e1);
		
}
}
