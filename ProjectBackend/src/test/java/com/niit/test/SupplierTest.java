package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;

import com.niit.model.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		Supplier supplier=new Supplier();
		
		supplier.setSupplierId(1);
		supplier.setSupplierName("Raj");
		supplier.setLocation("Chennai.");
		
		supplier.setSupplierId(2);
		supplier.setSupplierName("Rizwan");
		supplier.setLocation("Andhra Pradesh.");
		
		supplier.setSupplierId(3);
		supplier.setSupplierName("Suresh");
		supplier.setLocation("Kerala.");
		
		supplierDAO.addSupplier(supplier);

	}

}
