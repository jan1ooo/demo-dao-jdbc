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
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
//		System.out.println("\n=== TEST 3: department insert ===");
//		Department dep = new Department(null, "Limpeza");
//		departmentDao.insert(dep);
//		System.out.println(dep);
		
		System.out.println("\n=== TEST 4: department update ===");
		Department department2 = departmentDao.findById(1);
		department2.setName("Eletronics");
		departmentDao.update(department2);
		System.out.println(department2);
		
		System.out.println("\n=== TEST 5: department deleteById ===");
		departmentDao.deleteById(9);
		
		sc.close();
	}

}
