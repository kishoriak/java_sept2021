package com.demo.service;

import java.util.List;

import com.demo.beans.Category;
import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.google.gson.Gson;


public class ProductServiceImpl implements ProductService{
	ProductDao pdao;

	public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	}

	  
	@Override
	public List<Category> getAllCategory() {
		return pdao.findCategory();
	}


	@Override
	public String getProductsByCategory(int cid) {
		List<Product> plist=pdao.findProductsByCategory(cid);
		Gson gson=new Gson();
		String jsonprodlist=gson.toJson(plist);
		System.out.println(jsonprodlist);
		return jsonprodlist;
		
	}
	

}
