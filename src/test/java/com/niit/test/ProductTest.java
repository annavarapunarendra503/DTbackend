package com.niit.test;


import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.Model.Product;

@Ignore
public class ProductTest {

	private static ProductDao productDao;
		@BeforeClass
		public static void initialize()
		{
			AnnotationConfigApplicationContext ConfigAppLnContext=new AnnotationConfigApplicationContext();
			ConfigAppLnContext.scan("com.");
			ConfigAppLnContext.refresh();
			//SessionFactory sessionFactory=(Conf.getBean(requiredType, args))
			productDao=(ProductDao)ConfigAppLnContext.getBean("productDao");

		}
		@Transactional
		@Test
		public void addProductTest()
		{
			 Product product= new Product();
			 product.setProductId(1001);
			 product.setProductName("satti");
			 product.setProductDesc("this");
			 product.setPrice(2000);
			 product.setStock(25);
			 product.setCatId(1001);
			 product.setSupId(1001);
			 assertTrue("problem in insertion",productDao.addProduct(product));
		}
}