package com.productapp.controller;

import java.math.BigDecimal;
import java.util.*;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {
	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		System.out.println(productService.getAll());
		System.out.println(productService.getById(3));
		System.out.println(productService.addProduct(new Product(4, "Bulb", new BigDecimal(240), true)));
		System.out.println(productService.getAll());
		System.out.println(productService.deleteProduct(4));
		System.out.println(productService.getAll());
	}

}
