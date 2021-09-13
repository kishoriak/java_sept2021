package com.demo.beans;

import java.util.Date;

public class Product {
	private int pid;
	private String pname;
	private int qty;
	private double price;
	private String type;
	private Date mfg;
	private int cid;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, double price, String type, Date mfg, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.type = type;
		this.mfg = mfg;
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getMfg() {
		return mfg;
	}
	public void setMfg(Date mfg) {
		this.mfg = mfg;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", type=" + type
				+ ", mfg=" + mfg + ", cid=" + cid + "]";
	}
	

}
