package aop.BusinessLogic;

import org.springframework.stereotype.Component;


@Component
public class SchoolLibrary extends AbstructLibrary{
    @Override
    public void getBook() {
        System.out.println("Getting book from School Library");
    }

    public void getMagazine(){
        System.out.println("Getting magazine from School Library! ");
    }

    @Override
    public void getBook(String bookName) {
        System.out.println("Getting book from schoool library named: "+bookName);
    }

    @Override
    public void getBook(Book book) {
        System.out.println("I am getting book from school library book: "+book.getName());
    }
}
