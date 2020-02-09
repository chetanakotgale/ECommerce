package repository;

public interface ProductRepository 
{
	
	public void addProduct(int ProductId, String ProductName, int ProductQuantity, Long ProductPrice);

	public void removeProduct(int ProductId, String ProductName, int ProductQuantity, Long ProductPrice);

	public void displayProduct();

	
}
