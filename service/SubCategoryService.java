package service;

import java.util.ArrayList;
import java.util.List;

import repository.SubCategoryImplementation;
import repository.SubCategoryRepository;

public class SubCategoryService 
{
	int initialValue = 0;
	
	SubCategoryRepository subcategory1 = new SubCategoryImplementation();
	SubCategoryRepository subcategory2 = new SubCategoryImplementation();
	
	
	public void add()
	{
		subcategory1.addSubCategory(++initialValue, "Mobiles");
		subcategory1.addSubCategory(++initialValue, "Laptops");
		subcategory1.addSubCategory(++initialValue, "Home Appliances");
		
		initialValue = 0;
		
		subcategory2.addSubCategory(++initialValue, "Men");
		subcategory2.addSubCategory(++initialValue, "Women");
		subcategory2.addSubCategory(++initialValue, "Kids");
		
	}
	public void display(int choice)
	{
		if(choice == 1)
		{
			subcategory1.displaySubCategory();
		}
		else
		{
			subcategory2.displaySubCategory();
		}
		
	}
	

}
