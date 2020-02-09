package repository;

import java.util.List;

public interface SubCategoryRepository 
{
	
	public void addSubCategory(int SubCategoryId, String SubCategoryName);

	public void removeSubCategory(int SubCategoryId, String SubCategoryName, List<String> Products);

	public void displaySubCategory();


}
