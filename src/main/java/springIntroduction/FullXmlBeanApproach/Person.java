package springIntroduction.FullXmlBeanApproach;

public class Person {
    private String sirname;
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
