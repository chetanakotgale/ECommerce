package repository;

import java.util.ArrayList;
import java.util.List;

import entity.ProductEntity;

public class ProductImplementation implements ProductRepository
{
	ProductEntity product = new ProductEntity();
	List<ProductEntity> productList = new ArrayList<ProductEntity>();

	public void addProduct(int ProductID, String ProductName, int ProductQuantity, Long ProductPrice)
	{
		product.setProductID(ProductID);
		product.setProductName(ProductName);
		product.setProductQuantity(ProductQuantity);
		product.setProductPrice(ProductPrice);
		
		productList.add(product);
		product = new ProductEntity();

		
	}

	public void removeProduct(int ProductId, String ProductName, int ProductQuantity, Long ProductPrice) 
	{
		
		
	}

	public void displayProduct() 
	{
		for(ProductEntity product: productList)
		{
			System.out.println(product.getProductID()+"\t"+product.getProductName()+"\t"+product.getProductQuantity()+"\t"+product.getProductPrice());
		}
		
	}

	
	

}
