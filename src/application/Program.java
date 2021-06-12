package application;

import java.util.Date;

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
		
		Seller seller = sellerDao.findById(7);
		
		System.out.println(seller.toString());
	}

}
