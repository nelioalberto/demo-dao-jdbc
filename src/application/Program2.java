package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1 findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department.toString());

		System.out.println("\n=== Teste 2 findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
		   System.out.println(obj.toString());
		}

		System.out.println("\n=== Teste 3 Insert ===");

		Department newDepartment = new Department(null,"Engenharia");
		departmentDao.insert(newDepartment); 
		System.out.println("Inserted new id: " + newDepartment.getId());


		System.out.println("\n=== Teste 4 Update ===");

		department = departmentDao.findById(1); 
		department.setName("Arquitetura");
		departmentDao.update(department);
		System.out.println("Updated Completed");
		
		System.out.println("\n=== Teste 5 Delete ===");

		System.out.println("Enter id data for delete teste ===");

		int id = sc.nextInt();
		
		departmentDao.deleteById(id); 
		System.out.println("Deleted Completed");
		
		sc.close();

	}

}
