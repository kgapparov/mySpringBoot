package aop.BusinessLogic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyFirstAopConfig.class);
        SchoolLibrary library1 = context.getBean("schoolLibrary", SchoolLibrary.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        uniLibrary.getBook();
//        System.out.println();
//        uniLibrary.getBook("Heros of Ages");
//        uniLibrary.getBook(book);
//        System.out.println();
//        library1.getBook();
//        library1.getBook("Avangers");
//        library1.getBook(book);
//        library1.getMagazine();
//        uniLibrary.getBook();
//        uniLibrary.returnBook();
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();
//        uniLibrary.addMagazine();
        uniLibrary.addBook("Khassangali", book);
        uniLibrary.getBook();
        uniLibrary.returnBook();
        context.close();
    }
}
