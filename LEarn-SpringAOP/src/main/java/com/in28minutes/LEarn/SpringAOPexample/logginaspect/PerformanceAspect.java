package com.in28minutes.LEarn.SpringAOPexample.logginaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
@Configuration
@Aspect
public class PerformanceAspect {
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@Around("com.in28minutes.LEarn.SpringAOPexample.logginaspect.CommonPointCut.trackTimeAnnotation()")
//	@Around("execution(* com.in28minutes.LEarn.SpringAOPexample.*.*.*(..))")
	public Object executionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startMillisecs=System.currentTimeMillis();
		Object result=proceedingJoinPoint.proceed();
		long stopmillisecs=System.currentTimeMillis();
		long durationMillisecs=startMillisecs-stopmillisecs;
		
		logger.info("Around Aspect{} Method called is ----Execution Time{}",proceedingJoinPoint,durationMillisecs);
		return result;
	}
}
