package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		
		System.out.println("\n=== TEST 4: seller insert ===");
		
		System.out.println("\n=== TEST 5: seller update ===");
		
		System.out.println("\n=== TEST 6: seller deleteById ===");
		
		sc.close();
	}

}
