package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println("==postProcessBeforeInitialization=="+beanId);
		// Some Validation in the Object -> Are fields having correct data !!
		return beanRef;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println("==postProcessAfterInitialization=="+beanId);
		return beanRef;
	}
	
}
