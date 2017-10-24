/*package com.niit.test;


import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.Model.Product;

public class ProductTest {

	private static ProductDao productDAO;
		@BeforeClass
		public static void initialize()
		{
			AnnotationConfigApplicationContext ConfigAppLnContext=new AnnotationConfigApplicationContext();
			ConfigAppLnContext.scan("com.");
			ConfigAppLnContext.refresh();
			//SessionFactory sessionFactory=(Conf.getBean(requiredType, args))
			productDAO=(ProductDao)ConfigAppLnContext.getBean("productDAO");

		}
		@Transactional
		@Test
		public void addProductTest()
		{
			 Product product= new Product();
			 product.setProductId(1001);
			 product.setProductName("sa");
			 product.setProductDesc("this");
			 product.setPrice(2000);
			 product.setStock(25);
			 product.setCatId(1001);
			 product.setSupplierId(1001);
			 assertTrue("problem in insertion",productDAO.addProduct(product));
		}
}*/
