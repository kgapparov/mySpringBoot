package aop.aspectClasses.firstAspect;

import aop.BusinessLogic.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

// ------------------1st Approach learning ------------------------------
/*
    @Before("execution(public void getBook())")
    public void beforeGettingBook(){
        System.out.println("beforeGettingBook: Attempt to get book");
    }
    @Before("execution(public void get*())")
    public void beforAnyGet(){
        System.out.println("beforeAnyGet:  Attempt to get Something!! ");
    }

    @Before("execution(public void getBook(*, ..))")
    public void beforeGettingBookWithName(){
        System.out.println("beforeGettingBook: Attempt to get book");
    }
    @Before("execution(public void getBook(aop.BusinessLogic.Book))")
    public void beforeGettingBookWithBookObject(){
        System.out.println("beforeGettingBook: Attempt to get book with Object Book");
    }
 */
//-----------------------Advanced approach ---------------------------
/*    @Pointcut("execution(public void get*(*,..))")
    public void allGetMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLogginAdvise(){
        System.out.println("beforeGetLogginAdvise: Attemt getting book!");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvise(){
        System.out.println("beforeGetSecurityAdvise: Checking for access to Library!");
    }

}

 */
//-----------------------Combined PointCut Approaches ----------------------------
/*
    @Pointcut("execution( * aop.BusinessLogic.UniLibrary.get*())")
    public void allGetMethods(){};

    @Pointcut("execution(* aop.BusinessLogic.UniLibrary.return*())")
    public void allReturnMethods(){};

    @Pointcut("allGetMethods() || allReturnMethods()")
    public void allGetAndReturnMethods(){};

    @Before("allGetMethods()")
    public void beforeAllGetLoggingAdvise(){
        System.out.println("beforeAllGetLoggingAdvise: writing logg #1");
    }
    @Before("allReturnMethods()")
    public void beforeAllReturnLoggingAdvise(){
        System.out.println("beforeAllGetLoggingAdvise: writing logg #2");
    }
    @Before("allGetAndReturnMethods()")
    public void beforeAllGetAndReturnLoggingAdvise(){
        System.out.println("beforeAllGetAndReternLoggingAdvise: writing logg #3");
    }
 */
    @Before("aop.aspectClasses.firstAspect.MyPointCat.allAddMethods()")
    public void beforeAllAddLoggingAdvie(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.printf("Method : %s \nMethod Name : %s\nMethod Return type: %s\nMethod Signature : %s\n",
                methodSignature.getMethod(), methodSignature.getName(), methodSignature.getReturnType(), methodSignature);

        if (methodSignature.getName().equals("addBook")) {
            for (Object obj:joinPoint.getArgs()){
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.printf("Adding book with this details:\nAuthor: %s\nName: %s\nPublishedDay: %s\n",
                            myBook.getAuthor(), myBook.getName(), myBook.getYearOfPublication());
                    continue;
                }
                if (obj instanceof String) {
                    System.out.println("Book added by "+ obj);
                }
            }
        }
        System.out.println("beforeAllGetLogginAdvise: writing logging about getting book/magazine ");
        System.out.println("----------------------------------------------------------------------------------");
    }
}


