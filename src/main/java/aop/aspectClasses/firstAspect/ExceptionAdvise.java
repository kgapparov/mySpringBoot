package aop.aspectClasses.firstAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionAdvise {
    @Before("aop.aspectClasses.firstAspect.MyPointCat.allAddMethods()")
    public void beforeAllGetExceptionAdvie(){
        System.out.println("beforeAllGetExceptionAdvise: writing Exception about getting book/magazine ");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
