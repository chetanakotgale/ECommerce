package repository;

import java.util.ArrayList;
import java.util.List;

import entity.CategoryEntity;
import entity.SubCategoryEntity;

public class SubCategoryImplementation implements SubCategoryRepository 
{
	
	SubCategoryEntity subCategory = new SubCategoryEntity();
	List<SubCategoryEntity> subCategoryList = new ArrayList<SubCategoryEntity>();
	
	public void addSubCategory(int subCategoryId, String subCategoryName)
	{
		subCategory.setSubCategoryID(subCategoryId);
		subCategory.setSubCategoryName(subCategoryName);
		subCategoryList.add(subCategory);
		
		subCategory = new SubCategoryEntity();
	}

	public void removeSubCategory(int SubCategoryId, String SubCategoryName, List<String> Products) 
	{
		

	}


	public void displaySubCategory() 
	{
		//System.out.println(((SubCategoryEntity) subCategoryList).getSubCategoryID()+"\t"+((SubCategoryEntity) subCategoryList).getSubCategoryName());
		
		for(SubCategoryEntity subcategory: subCategoryList)
		{
			System.out.println(subcategory.getSubCategoryID()+"\t"+subcategory.getSubCategoryName());
		}
		
	}

	

}
