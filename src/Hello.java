
public class Hello {
    public static void main(String[] args) {
        System.out.println("And so it begins..");
        // Calls and runs the while loop method
        intro();
        dooBee();
        System.out.println("");
        greenBottles();
    }

    // Creates the intro method
    public static void intro() {
        int x = 10;
        // Uses a while loop to go through each number
        while (x > 0) {
            System.out.print(x + "..");
            // makes sure the loop doesn't run forever
            x = x - 1;
        }
        System.out.println("Hello World ^ ^");
    }

    // Creates the dooBee method
    public static void dooBee() {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.println("Do, you are my sunshine");
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
            num = num - 1;
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
}
