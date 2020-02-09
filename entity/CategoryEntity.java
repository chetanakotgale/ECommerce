package entity;

import java.util.List;

public class CategoryEntity 
{
	private int CategoryID;
	private String CategoryName;
	private List<String> SubCategory;
	
	
	public void setCategoryID(int CategoryID)
	{
		this.CategoryID = CategoryID;
	}

	public int getCategoryID()
	{
		return CategoryID;
	}
	
	public void setCategoryName(String CategoryName)
	{
		this.CategoryName = CategoryName;
	}
	
	public String getCategoryName()
	{
		return CategoryName;
	}
	
	public void setSubCategoryList(List<String> SubCategory)
	{
		this.SubCategory = SubCategory;
	}
	
	public List<String> getSubCategory()
	{
		return SubCategory;
	}
	
}
