package com.in28minutes.LEarn.SpringAOPexample.logginaspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class CommonPointCut {
	@Pointcut("execution(* com.in28minutes.LEarn.SpringAOPexample.*.*.*(..))")
	public void businessDataPackageConfig() {}
	
	@Pointcut("execution(* com.in28minutes.LEarn.SpringAOPexample.bussiness.*.*(..))")
	public void businessPackageConfig() {}
	
	@Pointcut("execution(* com.in28minutes.LEarn.SpringAOPexample.DataSErvice.*.*(..))")
	public void dataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}
	
	@Pointcut("@annotation(com.in28minutes.LEarn.SpringAOPexample.annotation.TrackTime)")
	public void trackTimeAnnotation() {}
	
}
