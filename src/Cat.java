public class Cat extends Animal {
    void speak() {
        System.out.println("Meoww");
    }
    // overloaded method
    void speak(int i) {
        String meow = "";
        for(int iterator = 0; iterator < i; iterator++){

            meow = meow.concat("meooww ");

        }
        System.out.println(meow);
    }
}
