package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstructLibrary{
    @Override
    public void getBook() {
        System.out.println("Trying to get book from SchoolLibrary");
    }
}
