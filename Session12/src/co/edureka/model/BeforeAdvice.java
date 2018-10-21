package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{
	
	// which will be executed before business method gets executed
	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
	
		System.out.println("=======PreProcessing=======");
		
		if(method.getName().equals("processProductPurchase")){
			
			System.out.println("Mehod inputs:");
			for(Object o : inputs){
				System.out.println(o);
			}
			
			Product product = (Product)beanRef;
			
			if(Util.productStock !=0){
				product.isProductAvailable = true;
			}
			System.out.println("--Stock Checked--");
			
			if(Util.paymentMode != 3){
				product.isAutoPaymentEnabled = true;
			}
			System.out.println("--Payment Mode Checked--");
			
		}
		
		System.out.println("===========================");
		
	}
	
}
