package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
	/*	System.out.println("=== Test 1 Insert === \n"); 
		Department newDepartment = new Department(11, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New ID = "+ newDepartment.getId()); */
		
		Department dep = departmentDao.findById(2); 
	
		System.out.println("\n=== Test 2 FindById === \n" + dep);
		
		
		System.out.println("\n=== Test 3 Update === \n"); 
		dep = departmentDao.findById(1);
		dep.setName("Consoles");
		departmentDao.update(dep);
		System.out.println("Update concluded!");
		
		
	/*	System.out.println("\n=== Test 4 Delete === \n"); 
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		*/
		
		
		System.out.println("\n=== Test 3 FindAll === \n");
		List <Department> list = departmentDao.findAll();
		for (Department x : list) System.out.println(x);
	
		
		
	
	
		sc.close();
	}

}
