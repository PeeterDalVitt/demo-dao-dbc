package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller1 = sellerDao.findById(6);
		
		//System.out.println(obj);
		System.out.println("=== Test 1 FindById === \n" + seller);
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println("\n=== Test 2 FindByDepartment === \n");
		for (Seller x : list) System.out.println(x);
		
		System.out.println("\n=== Test 3 FindAll === \n");
		list = sellerDao.findAll();
		for (Seller x : list) System.out.println(x);
	
		/*
		System.out.println("\n=== Test 4 FindInsert === \n"); 
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New ID = "+ newSeller.getId());
	*/
	
		System.out.println("\n=== Test 5 Update === \n"); 
		seller = sellerDao.findById(1);
		seller.setBaseSalary(4000.0);
		sellerDao.update(seller);
		System.out.println("Update concluded!");
	
		System.out.println("\n=== Test 6 Lelete === \n"); 
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
