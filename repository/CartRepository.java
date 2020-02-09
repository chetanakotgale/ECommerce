package repository;

public interface CartRepository 
{
	
	public void addCart(int CartId, String CartName, int CartQuantity, Long CartPrice);

	public void removeCart(int CartId, String CartName, int CartQuantity, Long CartPrice);

	public void displayCart(int CartId, String CartName, int CartQuantity, Long CartPrice);

}
