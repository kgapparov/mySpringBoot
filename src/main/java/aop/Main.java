package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        library.getBook();
        library.returnBook();
        library.getMagazine();
        schoolLibrary.getBook();
        context.close();
    }
}
