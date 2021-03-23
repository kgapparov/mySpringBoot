package springIntroduction.FullXmlBeanApproach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FullXMLBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        context.close();
    }
}
