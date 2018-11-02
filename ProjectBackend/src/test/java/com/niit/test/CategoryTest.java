package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
public class CategoryTest 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
        
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		Category category=new Category();
		category.setCategoryId(1);
		category.setCategoryName("Fantacy");
		category.setCategoryDesc("Fantasy is a genre that uses magic and other supernatural forms as a primary element of plot, theme, and/or setting.");
		
		category.setCategoryId(2);
		category.setCategoryName("Nokia");
		category.setCategoryDesc("Fantasy is a genre that uses magic and other supernatural forms as a primary element of plot, theme, and/or setting.");
		
		
		category.setCategoryId(3);
		category.setCategoryName("Samsung");
		category.setCategoryDesc("kkmart.");
		
		categoryDAO.addCategory(category);
		
				
	}
}