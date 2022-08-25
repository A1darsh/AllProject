package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entity.Config;
import com.zensar.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
   // ApplicationContext con=new ClassPathXmlApplicationContext("com/zensar/entity/beans.xml");
    
    	
   ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
        
    Employee emp = con.getBean(Employee.class);
    
    System.out.println(emp);
    
    
    }
}
