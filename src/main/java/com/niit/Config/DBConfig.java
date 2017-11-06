package com.niit.Config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

import com.niit.Dao.AddressDao;
import com.niit.Dao.CartDao;
import com.niit.Dao.CategoryDao;
import com.niit.Dao.ProductDao;
import com.niit.Dao.SupplierDao;
import com.niit.Dao.UserDao;
import com.niit.DaoImpl.AddressDaoImpl;
import com.niit.DaoImpl.CartDaoImpl;
import com.niit.DaoImpl.CategoryDaoImpl;
import com.niit.DaoImpl.ProductDaoImpl;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.DaoImpl.UserDaoImpl;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit")
public class DBConfig 
{
	
	
	 @Bean(name = "dataSource")
		public DataSource getDataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("org.h2.Driver");
			dataSource.setUrl("jdbc:h2:tcp://localhost/~/hello");
			dataSource.setUsername("sa");
			dataSource.setPassword("sa");
			System.out.println("Datasource");
			return dataSource;

		}

		private Properties getHibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		//	properties.put("hibernate.hbm2ddl.auto", "create");
			properties.put("hibernate.hbm2ddl.auto", "update");
			System.out.println("Hibernate Properties");
			return properties;

		}

		@Autowired
		@Bean(name = "sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource) {
			LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			sessionBuilder.addProperties(getHibernateProperties());
			sessionBuilder.scanPackages("com.niit");
			System.out.println("Session");
			
			return sessionBuilder.buildSessionFactory();
			
		}

		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			System.out.println("Transaction");
			return transactionManager;
		}
		
		@Autowired
		@Bean(name = "categoryDao")
		public CategoryDao getCateoryDao(SessionFactory sessionFactory)
		{
	        return new CategoryDaoImpl(sessionFactory);
		}
		
	@Autowired
	@Bean(name = "userDao")
	public UserDao getUserDao(SessionFactory sessionFactory)
	{

		return new UserDaoImpl(sessionFactory);
	}
	
	
	
	@Autowired
	@Bean(name = "supplierDao")
	public SupplierDao getSupplierDao(SessionFactory sessionFactory)
	{

		return new SupplierDaoImpl(sessionFactory);
	}
	
   
	@Autowired
	@Bean(name = "productDao")
	public ProductDao getProductDao(SessionFactory sessionFactory)
	{

		return new ProductDaoImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "cartDao")
	public CartDao getCartDao(SessionFactory sessionFactory)
	{

		return new CartDaoImpl(sessionFactory);
	}
	
	@Autowired
	@Bean(name = "addressDao")
	public AddressDao getAddressDao(SessionFactory sessionFactory)
	{

		return new AddressDaoImpl(sessionFactory);
	}

	

	}