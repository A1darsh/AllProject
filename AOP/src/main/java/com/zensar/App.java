package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    
    ApplicationContext context=new ClassPathXmlApplicationContext("com/zensar/config.xml");
    PaymentService paymentService = context.getBean("payment" ,PaymentService.class);
   
    // 
    paymentService.makepayment(); 
    
    }
}
