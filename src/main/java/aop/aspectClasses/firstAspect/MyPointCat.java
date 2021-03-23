package aop.aspectClasses.firstAspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCat {

    @Pointcut("execution(* aop.BusinessLogic.UniLibrary.get*(*,..))")
    public void allGetMethods(){};

    @Pointcut("execution(* aop.BusinessLogic.UniLibrary.return*(*, ..))")
    public void allReturnMethods(){};

    @Pointcut("execution(* aop.BusinessLogic.UniLibrary.add*(*,..))")
    public void allAddMethods(){};

}