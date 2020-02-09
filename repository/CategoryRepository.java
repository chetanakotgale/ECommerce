package repository;

public interface CategoryRepository 
{
	public void addCategory(int CategoryId, String CategoryName);

	public void removeCategory(int CategoryId, String CategoryName);

	public void displayCategory();

}
