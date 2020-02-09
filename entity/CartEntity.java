package entity;

public class CartEntity 
{
	private int CartID;
	private String CartName;
	private int CartQuantity;
	private Long CartPrice;
	
	public void setCartID(int CartID)
	{
		this.CartID = CartID;
	}
	
	public int getCartID()
	{
		return CartID;
	}

	public void setCartName(String CartName)
	{
		this.CartName = CartName;
	}
	
	public String getCartName()
	{
		return CartName;
	}
	
	public void setCartQuantity(int CartQuantity)
	{
		this.CartQuantity = CartQuantity;
	}
	
	public int getCartQuantity()
	{
		return CartQuantity;
	}

	public void setCartPrice(Long CartPrice)
	{
		this.CartPrice = CartPrice;
	}
	
	public Long getCartPrice()
	{
		return CartPrice;
	}

}
