package springIntroduction.FullAnnotationWithoutXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.printf("My sirname is: %s\nAge is: %d", person.getSirname(), person.getAge());
        context.close();
    }
}
