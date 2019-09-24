package com.entor.dao;

import java.util.List;

import com.entor.entity.Category;
import com.entor.entity.Product;

public interface ProductDao {
	public void add( Product s);
	/**
	 * 分页查询数据
	 * @param currentPage	当前页码
	 * @param pageSize		每页记录数
	 * @return				每页显示的记录对象
	 */
	public List<Product> queryByPage(int currentPage,int pageSize);
	/**
	 * 获取总记录数
	 * @return
	 */
	public int getTotals();
	/**
	 * 根据主键删除
	 * @param id	主键编号
	 */
	public void deleteById(int id);
	/**
	 * 根据主键查询
	 * @param id	主键编号
	 * @return		对象
	 */
	public Product queryById(int id);
	/**
	 * 更新数据
	 * @param s		用户对象
	 */
	public void update(Product s);
	/**
	 * 批量删除记录
	 * @param ids	由主机编号拼接成的字符1串，用逗号隔开，格式是：1,2,3,4,5
	 */
	public void deleteMore(String ids);
	/**
	 * 批量用户
	 * @param list
	 */
	public void addMore(List<Product> list);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Product> queryAll();

}
