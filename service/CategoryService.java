package service;


import repository.CategoryImplementation;
import repository.CategoryRepository;

public class CategoryService 
{
	CategoryRepository category = new CategoryImplementation();
	int initial_id = 1;
	
	
	public void add()
	{
		category.addCategory(initial_id,"Electronics");
	//	category.displayCategory();
		category.addCategory(++initial_id, "Fashion");
	//	category.displayCategory();
	}
	public void display()
	{
		category.displayCategory();
	}
		
}
