package com.niit.DaoImpl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.Model.Product;

@SuppressWarnings("deprecation")
@Repository("productDao")
public class ProductDaoImpl implements ProductDao
{
	

    @Autowired
    SessionFactory sessionFactory;
    
    
	 public ProductDaoImpl(SessionFactory sessionFactory)
	  {
		  
		  this.sessionFactory=sessionFactory;
	  
	  }


    
    
    
    @Transactional
	public boolean addProduct(Product product) {
		 try
	        {
	            sessionFactory.getCurrentSession().saveOrUpdate(product);
	            return true;
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e.getMessage());
	        return false;
	        }
	}
    
    
    
    @Transactional
	public List<Product> retrieveProduct()
	{
		
		 Session session=sessionFactory.openSession();
	        @SuppressWarnings("rawtypes")
	        Query query=session.createQuery("from Product");
	        @SuppressWarnings("unchecked")
	        List<Product> listProduct=query.list();
	        session.close();
	        return listProduct;

	}
    @Transactional
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		 try
	        {
	        sessionFactory.getCurrentSession().saveOrUpdate(product);
	        return true;
	        }
	        catch(Exception e)
	        {
	        System.out.println("Exception Arised:"+e);
	        return false;
	        }
	    
	
	}
    @Transactional
	public Product getProduct(int productId) {
		
		String hql = "from"+" Product"+" where id=" + productId;
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();
		
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		
	
		return null;
	
		
	}
    @Transactional
	public Product getItem(int Id) {
		Product product=sessionFactory.getCurrentSession().get(Product.class, Id);

		return product;
	}
	
	
@Transactional
	public Product deleteProduct(int productId) 
	{
		Product ProductToDelete = new Product();
		ProductToDelete.setProductId(productId);
			sessionFactory.getCurrentSession().delete(ProductToDelete);
			return ProductToDelete;
		
	}
	

	
	
}