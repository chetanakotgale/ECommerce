package service;

import java.util.Scanner;

public class MainService 
{
	Scanner scan = new Scanner(System.in);
	public void display() 
	{
		CategoryService categoryservice = new CategoryService();
		categoryservice.add();
		categoryservice.display();

		int choice = 0;
		choice = scan.nextInt();
		
		SubCategoryService subcategoryservice = new SubCategoryService();
		subcategoryservice.add();
		subcategoryservice.display(choice);
		
		choice = scan.nextInt();
		
		ProductService productService = new ProductService();
		productService.add();
		productService.display(choice);
	}
}
