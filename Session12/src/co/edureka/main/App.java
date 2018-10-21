package co.edureka.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Product;

public class App {

	public static void main(String[] args) {
		
		// Spring IOC : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Product product = context.getBean("proxyProduct",Product.class);
		product.processProductPurchase("morning", "Office");
		
		//ProxyFactoryBean : API with which we will configure BeforeAdvie and AfterAdvice in beans.xml
		

	}

}
