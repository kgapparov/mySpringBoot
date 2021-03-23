package springIntroduction.FullAnnotationWithoutXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${person.sirname}")
    private String sirname;
    @Value("35")
    private int age;
    @Autowired
    @Qualifier("dog")
    private Pet pet;

    public void callYourPet(){
        System.out.println("Hello my lovely pet!!!!");
        pet.say();
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
