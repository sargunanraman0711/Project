package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CartItemDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.UserDAO;
import com.niit.model.CartItem;
import com.niit.model.Product;

@Controller
public class CartController {
	
	@Autowired
	UserDAO userDAO;
	@Autowired
	CartItemDAO cartDAO;
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/addToCart/{productId}")
	public String addCartItem(@PathVariable("productId")int productId,@RequestParam("quantity")int quantity,HttpSession session, Model m)
		{
			CartItem cartItem=new CartItem();
			Product product=productDAO.getProduct(productId);
			
			String username=(String)session.getAttribute("username");
			cartItem.setProductId(productId);
			cartItem.setQuantity(quantity);
			cartItem.getCartItemId();
		    cartItem.setCartId(1);
			cartItem.setUsername(username);
			cartItem.setPaymentStatus("NP");
			cartItem.setSubTotal(quantity*product.getPrice());
		
			cartDAO.addCartItem(cartItem);
			
			m.addAttribute("cartList",cartDAO.getCartItems(username));
			
			return "cart";
			
	}
	
	@RequestMapping("/updateCartItem/{cartItemId}")
	public String updateCartItem(@PathVariable("cartItemId") int cartItemId, @RequestParam("qty")int quantity,HttpSession session,Model m)
	{
		 CartItem cartItem=cartDAO.getCartItem(cartItemId);
		 Product product=productDAO.getProduct(cartItem.getProductId());
	     
	     cartItem.setQuantity(quantity);
	     cartItem.setSubTotal(quantity*product.getPrice());
	     cartDAO.updateCartItem(cartItem);
	     String username= (String)session.getAttribute("username");
		 List<CartItem> listCartItems= cartDAO.getCartItems(username);
	     m.addAttribute("cartList",listCartItems);
	     m.addAttribute("grandTotal",this.grandTotal(listCartItems));
	     return "cart";
		
    }
	
	@RequestMapping("/deleteCartItem/{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId") int cartItemId, HttpSession session,Model m)
	{
	     CartItem cartItem=cartDAO.getCartItem(cartItemId);
	     
	     
	     cartDAO.deleteCartItem(cartItem);
	     
	     String username=(String)session.getAttribute("username");
	     List<CartItem> listCartItems= cartDAO.getCartItems(username);
	     m.addAttribute("cartList",listCartItems);
	     m.addAttribute("grandTotal",this.grandTotal(listCartItems));
	     
		 return "cart";
		
    }
	
	public int grandTotal(List<CartItem> listCartItems)
	{
		int grandTotal=0;
		for(CartItem cartItem: listCartItems)
		{
			grandTotal=grandTotal+cartItem.getQuantity()*(productDAO.getProduct(cartItem.getProductId()).getPrice());
			
		}
		return grandTotal;
	}

}
