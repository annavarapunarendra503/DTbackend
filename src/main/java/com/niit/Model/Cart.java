package com.niit.Model;
import javax.persistence.*;


@Entity
public class Cart 
{

	
	@GeneratedValue
	@Id
	int cartId;
	private int productId,userId,price,productQuantity;
	//@OneToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="Useremail")
	//private User CartUserDetails;
	private double subTotal;
	
	public int getCartId() {
		return cartId;
	}
	//public User getCartUserDetails() {
		//return CartUserDetails;
	//}
	//public void setCartUserDetails(User cartUserDetails) {
		//CartUserDetails = cartUserDetails;
	//}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	String productName;

	
}
