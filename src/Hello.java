
public class Hello {
    public static void main(String[] args) {
        System.out.println("And so it begins..");
        // Calls and runs the while loop method
        intro();
        dooBee();
        System.out.println("");
        greenBottles();
        shuffle1();
        poolPuzzleOne();
        dog();
        cat(3);
    }

    // Creates the intro method
    public static void intro() {
        int x = 10;
        // Uses a while loop to go through each number
        while (x > 0) {
            System.out.print(x + "..");
            // makes sure the loop doesn't run forever
            x--;
        }
        System.out.println("Hello World ^ ^");
    }

    // Creates the dooBee method
    public static void dooBee() {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
    }

    // Creates the green bottles method
    public static void greenBottles() {
        int num = 5;
        String bottle = "bottles";
        while (num > 0) {
            System.out.println(num + " green " + bottle + " of beer on the wall,");
            System.out.println(num + " green " + bottle + " of beer,");
            System.out.println("Take one down and pass it around,");

            // Takes away a bottle each loop
            num--;
            // if number is 1, it changes bottles to singular
            if (num == 1) {
                bottle = "bottle";
            }

            if (num > 0) {
                System.out.println("There'll be " + num + " green " + bottle + " of beer on the wall.");
                System.out.println("");
            } else {
                System.out.println("There'll be no green bottles of beer on the wall :'(");
            }
        }
    }

    public static void shuffle1() {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x--;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.println("d");
                x--;
            }
        }
    }

    public static void poolPuzzleOne() {
        int x = 0;
        while(x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println();
            x++;
        }
    }

    public static void dog() {
        // Creates an object from the Animal class
        Animal animal = new Dog();
        animal.type = "Dog";
        animal.name = "Kali";
        animal.age = 5;

        animal.speak();
        System.out.println("Im a " + animal.type + " called " + animal.name + " and I'm " + animal.age + " years old");
    }

    public static void cat(int i) {
        String meow = "";
        // Creates an object from the Animal class
        Animal animal2 = new Cat();
        animal2.type = "Cat";
        animal2.name = "Gooby";
        animal2.age = 9;

        animal2.speak();
        System.out.println("I'm " + animal2.name + " the " + animal2.type);

        for(int iterator = 0; iterator < i; iterator++){

            meow = meow.concat("meooww ");

        }
        System.out.println(meow);
    }
}
