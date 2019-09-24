package com.entor.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.entor.entity.Category;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.util.Constant;

@Controller
public class CategoryController {
	@Resource
	private CategoryService categoryService;
	
	
	@RequestMapping("/addcategory")
	public String addcategory(String name,MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException {
		String path = request.getServletContext().getRealPath(Constant.category_path);
		if(file!=null) {
			Category category=new Category();
			category.setName(name);
			categoryService.add(category);
			//返回自增的id
			int id=category.getId();
			//文件类型
			String contentType = file.getContentType();
			//文件名称
			String fileName = file.getOriginalFilename();
			//文件大小
			long size = file.getSize();
			System.out.println("文件类型："+contentType);
			System.out.println("文件名称："+fileName);
			System.out.println("文件大小："+size);
			//上传文件后缀
			String regx = fileName.substring(fileName.lastIndexOf("."));
			
			String newFileName = id+regx;
			//上传文件的路径地址
			//上传文件
			file.transferTo(new File(path,newFileName));
			System.out.println("上传成功");
		}
		
		return "listcategory";
	}
	
	
	@RequestMapping("/list/{currentPage}")
	public String list(@PathVariable String currentPage,Map<String,Object> map) {
		int sp = 1;
		int pageSize = 5;
		int totals = categoryService.getTotals(Category.class);
		int pageCounts = totals/pageSize;
		if(totals%pageSize!=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		}catch(Exception e) {
			sp = 1;
		}
		if(sp>pageCounts) {
			sp = pageCounts;
		}
		if(sp<1) {
			sp = 1;
		}
		List<Category> list = categoryService.queryByPage(Category.class, sp, pageSize);
		map.put("totals", totals);
		map.put("sp", sp);
		map.put("pageCounts", pageCounts);
		map.put("list", list);
		return "listCategory";
	}
	
	

}
