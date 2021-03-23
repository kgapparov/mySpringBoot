package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstructLibrary{
    @Override
    public void getBook(){
        System.out.println("Trying to get book from UniLibrary!");
    }

    public String returnBook(){
        System.out.println("Returning book to UniLibrary!");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("Trying to get Magazine from UniLibrary!");
    }
}
