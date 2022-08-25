package com.zensar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.zensar.entity.DemoConfig;
import com.zensar.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//BeanFactory  beanFactory=new FileSystemXmlApplicationContext("beans.xml");
    	
    	
    	
       // ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    
    	ApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
    	
    	
    	//Resource resource=new FileSystemResource("beans.xml");
    	//BeanFactory beanFactory=new XmlBeanFactory(resource);
    	
    	
        Employee employee1 =(Employee)context.getBean("e1", Employee.class);
//        System.out.println(employee1.hashCode());
//    
//        Employee employee2 =(Employee)context.getBean("e1");
//        System.out.println(employee2.hashCode());
//    
        System.out.println(employee1);
      
        ((AbstractApplicationContext)context).close();
        
    }
}
