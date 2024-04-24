public class ImplementDogCat implements DogInterface,CatInterface {
    public void eat(){
        System.out.println("Animal is eating!");
    }
    public void sleep(){
        System.out.println("Animal is sleeping!");
    }
    public void bark(){
        System.out.println("Dog is barking!");
    }
    public void meow(){
        System.out.println("Cat is meowing!");
    }
}