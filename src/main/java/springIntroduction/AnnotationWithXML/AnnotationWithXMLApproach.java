package springIntroduction.AnnotationWithXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationWithXMLApproach {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.printf("My name is: %s\nAge: %d\n", person.getSirname(), person.getAge());
        context.close();
    }
}
