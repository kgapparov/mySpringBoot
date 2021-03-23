package springIntroduction.PureCodeBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSirname());
        System.out.println(person.getAge());
        context.close();
    }
}
