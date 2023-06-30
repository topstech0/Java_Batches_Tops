package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
        Employee e1 =  (Employee) a.getBean("e1");
        
        e1.setId(1);
        e1.setFname("Rakesh");
        e1.setLname("Kharva");
        e1.setEmail("rakesh@gmail.com");
        
        System.out.println("Id : "+e1.getId());
        System.out.println("Fname : "+e1.getFname());
        System.out.println("Lname : "+e1.getLname());
        System.out.println("Email : "+e1.getEmail());
        
        Employee e2 = (Employee)a.getBean("e1");
        
        System.out.println("Id : "+e2.getId());
        System.out.println("Fname : "+e2.getFname());
        System.out.println("Lname : "+e2.getLname());
        System.out.println("Email : "+e2.getEmail());
        
        
    }
}
