package com.entor.entity;



import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class Product {
	private int id;
	private String name;
	private String subTitle;
	private Double orignalPrice;
	private Double promoteprice;
	private int stock;
	private int cid;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp creaDate;
	public Product() {
		super();
	}
	public Product(int id, String name, String subTitle, Double orignalPrice, Double promoteprice, int stock, int cid,
			Timestamp creaDate) {
		super();
		this.id = id;
		this.name = name;
		this.subTitle = subTitle;
		this.orignalPrice = orignalPrice;
		this.promoteprice = promoteprice;
		this.stock = stock;
		this.cid = cid;
		this.creaDate = creaDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public Double getOrignalPrice() {
		return orignalPrice;
	}
	public void setOrignalPrice(Double orignalPrice) {
		this.orignalPrice = orignalPrice;
	}
	public Double getPromoteprice() {
		return promoteprice;
	}
	public void setPromoteprice(Double promoteprice) {
		this.promoteprice = promoteprice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Timestamp getCreaDate() {
		return creaDate;
	}
	public void setCreaDate(Timestamp creaDate) {
		this.creaDate = creaDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", subTitle=" + subTitle + ", orignalPrice=" + orignalPrice
				+ ", promoteprice=" + promoteprice + ", stock=" + stock + ", cid=" + cid + ", creaDate=" + creaDate
				+ "]";
	}
	
	
	
	
	
	
	

}
