package entity;

import java.util.List;

public class SubCategoryEntity
{

	private int SubCategoryID;
	private String SubCategoryName;
	private List<String> Product;
	
	public void setSubCategoryID(int SubCategoryID)
	{
		this.SubCategoryID = SubCategoryID;
	}

	public int getSubCategoryID()
	{
		return SubCategoryID;
	}
	
	public void setSubCategoryName(String SubCategoryName)
	{
		this.SubCategoryName = SubCategoryName;
	}
	
	public String getSubCategoryName()
	{
		return SubCategoryName;
	}
	
	public void setProductList(List<String> Product)
	{
		this.Product = Product;
	}
	
	public List<String> getProduct()
	{
		return Product;
	}
}
