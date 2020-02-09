package entity;

public class ProductEntity 
{

	private int ProductID;
	private String ProductName;
	private int ProductQuantity;
	private Long ProductPrice;
	
	public void setProductID(int ProductID)
	{
		this.ProductID = ProductID;
	}
	
	public int getProductID()
	{
		return ProductID;
	}

	public void setProductName(String ProductName)
	{
		this.ProductName = ProductName;
	}
	
	public String getProductName()
	{
		return ProductName;
	}
	
	public void setProductQuantity(int ProductQuantity)
	{
		this.ProductQuantity = ProductQuantity;
	}
	
	public int getProductQuantity()
	{
		return ProductQuantity;
	}

	public void setProductPrice(Long ProductPrice)
	{
		this.ProductPrice = ProductPrice;
	}
	
	public Long getProductPrice()
	{
		return ProductPrice;
	}
}
