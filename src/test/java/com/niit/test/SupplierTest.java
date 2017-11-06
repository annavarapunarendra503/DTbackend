package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.DBConfig;
import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.Model.Supplier;

@Ignore
public class SupplierTest {

	static SupplierDao supplierDao;
		     
		    @BeforeClass
		    public static void initialize()
		    {
		        @SuppressWarnings("resource")
				AnnotationConfigApplicationContext configApplnContext=new AnnotationConfigApplicationContext();
		        configApplnContext.scan("com.niit");
		        configApplnContext.register(DBConfig.class);
		        configApplnContext.refresh();
		         
		        //SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
		         
		        supplierDao=(SupplierDao)configApplnContext.getBean("supplierDao");
		    }
		     
		    
		    @Test
		    public void addSupplierTest()
		    {
		        Supplier supplier=new Supplier();
		        supplier.setSupId(1002);
		        supplier.setSupName("football");
		        supplier.setSupDesc("John Miller");
		         
		        assertTrue(supplierDao.addSupplier(supplier));
		    }
		     
		    @Ignore
		    @Test
		    public void updateSupplierTest()
		    {
		        Supplier supplier=new Supplier();
		        supplier.setSupId(1002);
		        supplier.setSupName("JMShirt");
		        supplier.setSupDesc("John Miller Shirt with Best Price");
		         
		        assertTrue(supplierDao.updateSupplier(supplier));
		    }
		    @Ignore
		    @Test
		    public void deleteSupplierTest()
		    {
		        Supplier supplier=new Supplier();
		        supplier.setSupId(1002);
		        assertTrue(supplierDao.deleteSupplier(supplier));
		    }
		     
		    @Test
		    public void retrieveSupplierTest()
		    {
		        List<Supplier> listSupplier=supplierDao.retrieveSupplier();
		        assertNotNull("Problem in Retriving ",listSupplier);
		        this.show(listSupplier);
		    }
		    @Ignore
		    public void show(List<Supplier> listSupplier)
		    {
		        for(Supplier supplier:listSupplier)
		        {
		            System.out.println("Supplier ID:"+supplier.getSupId());
		            System.out.println("Supplier Name:"+supplier.getSupName());
		        }
		    }
		     
		    @Ignore
		    @Test
		    public void getSupplierTest()
		    {
		        Supplier supplier=supplierDao.getSupplier(1003);
		        assertNotNull("Problem in Getting:",supplier);
		        System.out.println("Supplier ID:"+supplier.getSupId());
		        System.out.println("Supplier Name:"+supplier.getSupName());
		    }
}
