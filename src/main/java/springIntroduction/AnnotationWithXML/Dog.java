package springIntroduction.AnnotationWithXML;

import org.springframework.stereotype.Component;
import springIntroduction.AnnotationWithXML.Pet;

@Component
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Gaf-Gaf");
    }
}
