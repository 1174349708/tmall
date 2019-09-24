package Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.Category;
import com.entor.service.CategoryService;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 CategoryService service =(CategoryService)context.getBean("categoryService");
//		 int totals=service.getTotals(Category.class);
//		 System.out.println(totals);
		 
		 
		 List<Category> list=service.queryByPage(Category.class, 1, 10);
		 for(Category cg:list) {
			 System.out.println(cg);
		 }
//		 
//		 Category c=new Category();
//		 c.setName("空调");
//		 service.add(c);
//		 System.out.println(c.getId());
		 
//		 service.deleteById(Category.class,95 );
//		 
		  
		  
		 
		 
	}

}
