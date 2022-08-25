package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Product;
import com.zensar.spring.service.ProductService;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        
        ProductService service=context.getBean("service",ProductService.class);
        
        Product product=new Product(8,"tv",120000);
        
       // service.updateProduct(product);
         System.out.println(service.getAllProduct(product));
        
       
        //service.insertProduct(product);
       // service.deleteProduct(product);
    // System.out.println("updated successfully");
        ///System.out.println("deleted successfully");
        
        //System.out.println("Product inserted successfullyyyyy !!!");
        
    }
}
