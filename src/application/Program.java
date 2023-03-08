package application;

import java.time.LocalDateTime;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj1 = new Department(1, "Books");
		System.out.println(obj1.toString());
		
		LocalDateTime dtBirth = LocalDateTime.parse("1962-09-08T04:33:33");
		
		Seller obj2 = new Seller(1,"Nelio","nelio@gmail.com", dtBirth, 12000.0, obj1); 
		System.out.println(obj2.toString());
		
	}

}
