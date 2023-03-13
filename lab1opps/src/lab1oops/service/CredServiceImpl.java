package lab1oops.service;

import java.util.Random;

import lab1oops.model.Employee;

public class CredServiceImpl implements Creadservice{

	@Override
	public String genetateEnailed(String firstname, String lastname, String dept) {
		
		return firstname+lastname+"@"+dept+".gl.com";
	}

	@Override
	public String genetatePassword() {
		String caps="ABCDRFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*(),./';][{}:";
		
String combined=caps+lower+nums+splchars;
		
		
		String mypass="";  
		Random random=new Random();
		
		for(int i=0;i<8;i++)
		{
		mypass=mypass+String.valueOf(combined.charAt(random.nextInt(combined.length())));	
		}
		
		return mypass;
		
	}

	@Override
	public void ShowDeailes(Employee e1) {
		System.out.println("Employee First Name is "+ e1.getFirstname());
		System.out.println("Employee Last Name is "+ e1.getLastname());
		System.out.println("Employee Email  is "+ e1.getEmail());
		System.out.println("Employee Password is "+ e1.getPassword());
		
		
	}
	public String generateEmailId(Employee e1, String dept) {
		String mypass=e1.getFirstname().toLowerCase() + e1.getLastname().toLowerCase()+"@"+dept+".gl.com";
		return mypass;
	

}
}
