package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");	
		Seller seller = new Seller(1, "Jonny", "janio@gmail.com", new Date(), 1200.00, department);
		System.out.println(seller);
	}

}
