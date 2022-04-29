package main.java.service;

import main.java.pojo.Animal;
import main.java.pojo.Cat;
import main.java.pojo.Dog;
import main.java.pojo.Echo;

import java.util.Scanner;

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
        cat();
        echoTestDrive();
        codeMagnet();
        poolPuzzleTwo();
        //reverseString();
        printInt();
        System.out.println("");
        //christmasTree();
        puzzle4();
        simpleStartGame();
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
        System.out.println("head.first.service.Hello World ^ ^");
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
        // Creates an object from the head.first.pojo.Animal class
        Animal animal = new Dog();
        animal.type = "head.first.pojo.Dog";
        animal.name = "Kali";
        animal.age = 5;

        animal.speak();
        System.out.println("Im a " + animal.type + " called " + animal.name + " and I'm " + animal.age + " years old");
    }

    public static void cat() {
        // Creates an object from the head.first.pojo.Animal class
        Cat animal2 = new Cat();
        animal2.type = "head.first.pojo.Cat";
        animal2.name = "Gooby";
        animal2.age = 9;

        animal2.speak();
        System.out.println("I'm " + animal2.name + " the " + animal2.type);

        animal2.speak(5);
    }

    public static void echoTestDrive() {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while ( x < 4 ) {
            e1.hello();
            e1.count = e1.count + 1;
            if ( x == 3 ) {
                e2.count = e2.count + 1;
            }
            if ( x > 0 ) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }

    public static void codeMagnet() {
        String[] islands = new String[4];
        islands[0] = "Ireland";
        islands[1] = "Bermuda";
        islands[2] = "Fiji";
        islands[3] = "Hawaii";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("Island = ");
            System.out.println(islands[ref]);
            y++;
        }
    }

    public static void poolPuzzleTwo() {
        Triangle[] ta = new Triangle[4];
        int x = 0;

        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();

            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }

        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    // Write a simple program that using the Scanner utility reads
    // three Strings and prints the output in the reverse order,
    // each string on a new line.
    public static void reverseString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your top 3 bands from least favourite to most");
        String third = input.nextLine();
        String second = input.nextLine();
        String first = input.nextLine();

        System.out.println("No. 1: " + first);
        System.out.println("No. 2: " + second);
        System.out.println("No. 3: " + third);
    }

    // Write a program that prints numbers from 0 to 9,
    // but in the backward order. All numbers must be in
    // the same line. Separate them by a space.
    public static void printInt() {
        int x = 9;
        while (x >= 0) {
            System.out.print(x + " ");
            x--;
        }

    }

    public static void christmasTree() {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall would you like your christmas tree?");
        int height = input.nextInt();

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height - x; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (2 * x + 1); z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void puzzle4() {
        Value[] values = new Value[6];
        int number = 1;
        int i = 0;
        while (i < 6) {
            values[i] = new Value();
            values[i].intValue = number;
            number = number * 10;
            i++;
        }

        int result = 0;
        i = 6;
        while (i > 0) {
            i--;
            result = result + values[i].doStuff(i);
        }
        System.out.println("result " + result);
    }

    public static void simpleStartGame() {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStart theStart = new SimpleStart();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStart.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("Enter a number");
            String result = theStart.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}