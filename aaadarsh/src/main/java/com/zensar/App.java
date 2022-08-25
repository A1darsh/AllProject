package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entity.DemoConfig;
import com.zensar.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
    
      Employee emp1= (Employee)context.getBean("emp1",Employee.class);
    
      System.out.println(emp1);
    
    
    }
}
