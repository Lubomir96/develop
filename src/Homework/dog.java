package Homework;

public class dog  extends Animals{

    public  void bark(){
        System.out.println("barking");
    }

    public static void main(String[] args) {
        dog vasko = new dog();
        vasko.bark();
        eat();
        Cat maq = new Cat();
        maq.meow();
    }



}
