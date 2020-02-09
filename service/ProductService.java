package service;

import entity.SubCategoryEntity;
import repository.ProductImplementation;
import repository.ProductRepository;

public class ProductService 
{
	ProductRepository product11 = new ProductImplementation();
	ProductRepository product12 = new ProductImplementation();
	ProductRepository product13 = new ProductImplementation();
	
	ProductRepository product21 = new ProductImplementation();
	ProductRepository product22 = new ProductImplementation();
	ProductRepository product23 = new ProductImplementation();
	
	int initialValue = 0;

	SubCategoryEntity subcategory = new SubCategoryEntity();
	
	public void add()
	{
		product11.addProduct(++initialValue, "IPhone", 10, 100000L);
		product11.addProduct(++initialValue, "Samsung", 10, 50000L);
		product11.addProduct(++initialValue, "Real me", 10, 30000L);
		
		initialValue = 0 ;
		
		product12.addProduct(++initialValue, "HP", 10, 100000L);
		product12.addProduct(++initialValue, "Dell", 10, 100000L);
		product12.addProduct(++initialValue, "MAC", 10, 100000L);
		
		initialValue = 0 ;
		
		product13.addProduct(++initialValue, "AC", 10, 50000L);
		product13.addProduct(++initialValue, "TV", 10, 40000L);
		product13.addProduct(++initialValue, "Refridgerator", 10, 30000L);
		
		initialValue = 0 ;
		
		product21.addProduct(++initialValue, "Jeans", 10, 3000L);
		product21.addProduct(++initialValue, "T-Shirts", 10, 1000L);
		product21.addProduct(++initialValue, "Shirts", 10, 2000L);
		
		initialValue = 0 ;
		
		product22.addProduct(++initialValue, "Saree", 10, 3000L);
		product22.addProduct(++initialValue, "Jeans", 10, 2000L);
		product22.addProduct(++initialValue, "Tops", 10, 1000L);
		
		initialValue = 0 ;
		
		product23.addProduct(++initialValue, "Jeans", 10, 2000L);
		product23.addProduct(++initialValue, "T-Shirts", 10, 1000L);
		product23.addProduct(++initialValue, "Shirts", 10, 1000L);
		
	}

	public void display(int choice) 
	{
		//Below one
		System.out.println(subcategory.getSubCategoryID()+" "+subcategory.getSubCategoryName());
		if(subcategory.getSubCategoryID()==0)
		{
			if(choice == 1)
			{
				product11.displayProduct();
			}
			else if(choice == 2)
			{
				product12.displayProduct();
			}
			else
			{
				product13.displayProduct();
			}
		}
		else
		{
			if(choice == 1)
			{
				product21.displayProduct();
			}
			else if(choice == 2)
			{
				product22.displayProduct();
			}
			else
			{
				product23.displayProduct();
			}
		}
		
	}

}
