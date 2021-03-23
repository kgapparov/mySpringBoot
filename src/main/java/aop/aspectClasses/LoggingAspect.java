package aop.aspectClasses;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*())")
    public void beforeGettingBookAdvise(){
        System.out.println("Iformation: Attempt to get book");
    }
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvise(){
        System.out.println("Iformation: Attempt to return book! ");
    }
}
