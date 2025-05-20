package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

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
	
	
	}

}
