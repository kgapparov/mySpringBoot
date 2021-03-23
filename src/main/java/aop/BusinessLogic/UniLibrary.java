package aop.BusinessLogic;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstructLibrary{
    @Override
    public void getBook() {
        System.out.println("Getting book from UniLibrary");
        System.out.println("----------------------------------------------------------------------------------");
    }

    @Override
    public void getBook(String bookName) {
        System.out.println("Getting book from Unilibrary named: "+bookName);
    }

    @Override
    public void getBook(Book book) {
        System.out.println("I am getting book from uni Library named ad: "+ book.getName());
        System.out.println("----------------------------------------------------------------------------------");
    }
    public void returnBook(){
        System.out.println("Returning book to UniLibrary! ");
        System.out.println("----------------------------------------------------------------------------------");
    }


    public void getMagazine(){
        System.out.println("Getting magazine from uniLibrary! ");
        System.out.println("----------------------------------------------------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("Returning magazine to UniLibrary! ");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void addBook(){
        System.out.println("Adding book to uni Library! ");
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void addBook(String name, Book book){
        System.out.println("Adding book to uni Library! "+book.getName()+" by student "+name);
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Adding magazine to UniLibrary! ");
        System.out.println("----------------------------------------------------------------------------------");
    }
}
