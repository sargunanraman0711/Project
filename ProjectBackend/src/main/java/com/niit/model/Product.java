package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
@Entity
@Table
public class Product {
	@Id
	@GeneratedValue
 private int ProductId;
 private String ProductName;
 private int CategoryId;
 private  int SupplierId;
 private int price;
 private int stock;
 private String ProducDesc;
 @Transient
 private MultipartFile pimage;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getCategoryId() {
	return CategoryId;
}
public void setCategoryId(int categoryId) {
	CategoryId = categoryId;
}
public int getSupplierId() {
	return SupplierId;
}
public void setSupplierId(int supplierId) {
	SupplierId = supplierId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getProducDesc() {
	return ProducDesc;
}
public void setProducDesc(String producDesc) {
	ProducDesc = producDesc;
}
public MultipartFile getPimage() {
	return pimage;
}
public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}
 
 
}
