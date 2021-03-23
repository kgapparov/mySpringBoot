package aop.aspectClasses.firstAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAdvise {
    @Before("aop.aspectClasses.firstAspect.MyPointCat.allAddMethods()")
    public void beforeAllGetSecurityAdvise(){
        System.out.println("beforeAllGetSecurityAdvise: checking aceess to library for getting book/magazine ");
        System.out.println("----------------------------------------------------------------------------------");
    }

}
