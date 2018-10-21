package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{
	
	// which will be executed after business method gets executed
	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
	
		System.out.println("=======PostProcessing=======");
		
		if(method.getName().equals("processProductPurchase")){
			
			System.out.println("Mehod inputs:");
			for(Object o : inputs){
				System.out.println(o);
			}
			
			Product product = (Product)beanRef;
			
			if(product.isProductAvailable){
				if(product.isAutoPaymentEnabled){
					System.out.println("Payments Processed !!");
					System.out.println("Product "+product.name+" shall be delivered to "+inputs[1]);
				}else{
					System.out.println("Payments Not Processed, has to be Cash on Delivery !!");
					System.out.println("Product "+product.name+" shall be delivered to "+inputs[1]);
				}
			}else{
				System.out.println("==Product Out of Stock==");
			}
		}

		System.out.println("===========================");
		
	}
}
