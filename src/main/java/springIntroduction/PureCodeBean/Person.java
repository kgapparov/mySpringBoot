package springIntroduction.PureCodeBean;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("${person.sirname}")
    private String sirname;
    @Value("${person.age}")
    private int age;
    private Pet pet;

    public Person(Pet pet){
        this.pet = pet;
    }
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
