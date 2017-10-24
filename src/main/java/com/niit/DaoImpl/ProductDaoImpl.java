package com.niit.DaoImpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Dao.ProductDao;
import com.niit.Model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	      @Autowired
		    SessionFactory sessionFactory;

           public	ProductDaoImpl(){}
	
	
			public ProductDaoImpl(SessionFactory sessionFactory) {
				
				this.sessionFactory=sessionFactory;
		}

			@Transactional
			public boolean addProduct(Product product) {
				// TODO Auto-generated method stub
				 try
			      {
			      sessionFactory.getCurrentSession().saveOrUpdate(product);
			      return true;
			      }
			      catch(Exception e)
			      {
			      return false;
			      }
			      
			}

			public List<Product> retrieveProduct() {
				// TODO Auto-generated method stub
				return null;
			}

           @Transactional
			public boolean deleteProduct(Product product) {
				// TODO Auto-generated method stub
				 try
			     {
			     sessionFactory.getCurrentSession().delete(product);
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
				// TODO Auto-generated method stub
				 Session session=sessionFactory.openSession();
				 Product product=(Product)session.get(Product.class,productId);
			     session.close();
			     return product;
				
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

            
	
}
