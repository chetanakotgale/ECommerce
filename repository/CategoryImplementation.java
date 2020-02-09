package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.CategoryEntity;

public class CategoryImplementation implements CategoryRepository
{
	CategoryEntity category=new CategoryEntity();
	List<CategoryEntity> categoryList = new ArrayList<CategoryEntity>();
	
	int choice=0;
	Scanner scan = new Scanner(System.in);

	public void addCategory(int CategoryId, String CategoryName) 
	{
		
		category.setCategoryID(CategoryId);
		category.setCategoryName(CategoryName);	
		categoryList.add(category);
		
		category=new CategoryEntity();
	}

	public void removeCategory(int CategoryId, String CategoryName) 
	{


	}

	public void displayCategory() 
	{
		for(CategoryEntity e: categoryList)
		{
			System.out.println(e.getCategoryID()+"\t"+e.getCategoryName());
		}
	}
	
}
