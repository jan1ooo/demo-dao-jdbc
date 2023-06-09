package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println("\n" + seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {			
			System.out.println("\n"  + obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {			
			System.out.println("\n"  + obj);
		}
		
//		System.out.println("\n=== TEST 4: seller insert ===");
//		Seller newSeller = new Seller(null, "Jordan Silva", "jordan76@gmail.com.br", new Date(), 3900.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inser new ID = " + newSeller.getId());
//		
//		System.out.println("\n=== TEST 5: seller update ===");
//		seller = sellerDao.findById(1);
//		seller.setName("Robson Santos");
//		sellerDao.update(seller);
//		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: seller deleteById ===");
		System.out.println("Entre com id para ser excluido: ");
		Integer id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}

}
