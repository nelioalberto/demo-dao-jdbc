package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "Design");
		//System.out.println(obj.toString());
		//Seller seller = new Seller(1, "nelio", "nalberto@gmail.com", new Date(), 12000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1 findById ===");
		Seller seller = sellerDao.findById(7);
		System.out.println(seller.toString());

		System.out.println("\n=== Teste 2 findByDepartment ===");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
		   System.out.println(obj.toString());
		}

		System.out.println("\n=== Teste 3 findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
		   System.out.println(obj.toString());
		}

		System.out.println("\n=== Teste 4 Insert ===");

		Seller newSeller = new Seller(null,"Joao Alberto Costa", "jac@gamil.com", new Date(), 15500.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id: " + newSeller.getId());
	
	}

}
