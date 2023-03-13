package lab1oops.service;

import lab1oops.model.Employee;

public interface Creadservice {
	String genetateEnailed(String firstname,String lastname,String dept);
	String genetatePassword();
	void ShowDeailes(Employee e1);

}
