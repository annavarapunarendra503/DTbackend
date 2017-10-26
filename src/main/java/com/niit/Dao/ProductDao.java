package com.niit.Dao;


import java.util.List;

import com.niit.Model.Product;

public interface ProductDao
{
	
	public boolean addProduct (Product product);
	public Product deleteProduct(int product_Id);
	public List<Product>retrieveProduct();
	public boolean updateProduct(Product product);
	public Product getProduct(int productId);
	public Product getItem(int Id);
	

}
