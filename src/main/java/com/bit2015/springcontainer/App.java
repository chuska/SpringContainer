package com.bit2015.springcontainer;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	//beanFactoryTest();
    	applicationContextTest();
    }
    
    public static void beanFactoryTest() {
    	BeanFactory beanFactory = 
    		new XmlBeanFactory( new FileSystemResource( "config/applicationContext.xml" ) );
    	
    	User user1 = (User) beanFactory.getBean( "user" );
    	System.out.println( user1.getName() );
    	User user2 = (User) beanFactory.getBean( "user" );
    	System.out.println( user2.getName() );
    	
    	System.out.println( user1 );
    	System.out.println( user2 );
    }
    
    public static void applicationContextTest() {
    	ApplicationContext applicationContext =
    			new ClassPathXmlApplicationContext( "config/applicationContext.xml" );
    	
    	User user = (User) applicationContext.getBean( "user" );
    	System.out.println( user );
    	
    	User user2 = (User) applicationContext.getBean( "user2" );
    	System.out.println( user2 );
    	
    	User user3 = (User) applicationContext.getBean( "user3" );
    	System.out.println( user3.getFriend() );
    	List<String> friends = user3.getFirends();
    	for( String friend : friends ) {
    		System.out.println( friend );
    	}
    	
  	
    }
}
