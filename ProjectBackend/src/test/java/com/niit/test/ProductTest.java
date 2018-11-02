package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;



public class ProductTest {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("Samsung");
		product.setCategoryId(1);
		product.setSupplierId(1);
		product.setPrice(30);
		product.setStock(500);
		product.setProducDesc("easy");
		
		
		product.setProductId(2);
		product.setProductName("Samsung");
		product.setCategoryId(2);
		product.setSupplierId(2);
		product.setPrice(30);
		product.setStock(500);
		product.setProducDesc("easy");
		productDAO.addProduct(product);
	}

}
