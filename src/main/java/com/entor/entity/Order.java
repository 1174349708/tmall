package com.entor.entity;

import java.sql.Timestamp;

import com.alibaba.fastjson.annotation.JSONField;

public class Order {
	private int id;
	private long orderCode;
	private String address;
	private int post;
	private String receiver;
	private String mobile;
	private String userMessage;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp createDate;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp payDate;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp deliveryDate;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Timestamp confirmDate;
	private int uid;
	private String status;
	public Order() {
		super();
	}
	public Order(int id, long orderCode, String address, int post, String receiver, String mobile, String userMessage,
			Timestamp createDate, Timestamp payDate, Timestamp deliveryDate, Timestamp confirmDate, int uid,
			String status) {
		super();
		this.id = id;
		this.orderCode = orderCode;
		this.address = address;
		this.post = post;
		this.receiver = receiver;
		this.mobile = mobile;
		this.userMessage = userMessage;
		this.createDate = createDate;
		this.payDate = payDate;
		this.deliveryDate = deliveryDate;
		this.confirmDate = confirmDate;
		this.uid = uid;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(long orderCode) {
		this.orderCode = orderCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPost() {
		return post;
	}
	public void setPost(int post) {
		this.post = post;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getPayDate() {
		return payDate;
	}
	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}
	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Timestamp getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(Timestamp confirmDate) {
		this.confirmDate = confirmDate;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderCode=" + orderCode + ", address=" + address + ", post=" + post
				+ ", receiver=" + receiver + ", mobile=" + mobile + ", userMessage=" + userMessage + ", createDate="
				+ createDate + ", payDate=" + payDate + ", deliveryDate=" + deliveryDate + ", confirmDate="
				+ confirmDate + ", uid=" + uid + ", status=" + status + "]";
	}
	
	
	
	
	

}
