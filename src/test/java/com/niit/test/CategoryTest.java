package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;
 
//import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.junit.gen5.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.niit.Config.DBConfig;

//import com.niit.Config.DBConfig;

//import com.niit.Config.DBConfig;

import com.niit.Dao.CategoryDao;
import com.niit.Model.Category;

@Ignore
public class CategoryTest {
         @Autowired
	    static CategoryDao categoryDao;
	     
	    @BeforeClass
	    public static void initialize()
	    {
	        AnnotationConfigApplicationContext configApplnContext=new AnnotationConfigApplicationContext();
	        configApplnContext.scan("com.niit");
	        configApplnContext.register(DBConfig.class);
	        configApplnContext.refresh();
	         
	        //SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
	         
	        categoryDao=(CategoryDao)configApplnContext.getBean("categoryDao");
	    }
	     
	    
	    @Test
	    public void addCategoryTest()
	    {
	        Category category=new Category();
	        category.setCatId(1001);
	        category.setCatName("Kabaddi");
	        category.setCatDesc("This is an Indian Sport:");
	         
	        assertTrue(categoryDao.addCategory(category));
	    }
	     
	    @Ignore
	    @Test
	    public void updateCategoryTest()
	    {
	        Category category=new Category();
	        category.setCatId(1002);
	        category.setCatName("FootBall");
	        category.setCatDesc("This is an Indian Sport");
	         
	        assertTrue(categoryDao.updateCategory(category));
	    }
	    @Ignore
	    @Test
	    public void deleteCategoryTest()
	    {
	        Category category=new Category();
	        category.setCatId(1002);
	        assertTrue(categoryDao.deleteCategory(category));
	    }
	    @Ignore
	    @Test
	    public void retrieveCategoryTest()
	    {
	        List<Category> listCategory=categoryDao.retrieveCategory();
	        assertNotNull("Problem in Retriving ",listCategory);
	        this.show(listCategory);
	    }
	     @Ignore
	    
	    public void show(List<Category> listCategory)
	    {
	        for(Category category:listCategory)
	        {
	            System.out.println("Category ID:"+category.getCatId());
	            System.out.println("Category Name:"+category.getCatName());
	        }
	    }
	     
	     @Ignore
	    @Test
	    public void getCategoryTest()
	    {
	        Category category=categoryDao.getCategory(1003);
	        assertNotNull("Problem in Getting:",category);
	        System.out.println("Category ID:"+category.getCatId());
	        System.out.println("Category Name:"+category.getCatName());
	    }
	 
}
