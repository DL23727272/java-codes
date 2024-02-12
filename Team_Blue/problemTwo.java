import java.util.Scanner;

class Dog {
    private String color;
    private String gender;
    public Dog(String color, char genderOne) {
        this.color = setColor(color);
        this.gender = setGender(genderOne);
    }

    public String setColor(String color) {
        if (color.equalsIgnoreCase("brown") || color.equalsIgnoreCase("gold")) {
            return color;
        } else {
            return "gold";
        }
    }

    public String setGender(char genderOne) {
        if (genderOne == 'M') {
            return "male";
        } else if (genderOne == 'F') {
            return "female";
        } else {
            return "Invalid";
        }
    }

    public String getBreed() {
        return "Golden Retriever";
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    } 
    public void bark(int woof) {
        for (int i = 0; i < woof; i++) {
            System.out.println("Woof");
        }
    }
}
  
public class problemTwo {
    public static void main(String[] args) {

        char genderOne;
        String color;

        Scanner DL = new Scanner(System.in);

        System.out.print("Enter the Golden Retriever's gender: ");
        genderOne = Character.toUpperCase(DL.next().charAt(0));

        System.out.print("Enter the Golden Retriever's color: ");
        DL.nextLine();
        color = DL.nextLine();

        Dog dog = new Dog(color, genderOne);

        System.out.println("My " + dog.getGender() + ", " + dog.getColor() + " " + dog.getBreed());

        System.out.print("Enter the size of the bark: ");
        int woof = DL.nextInt();
        dog.bark(woof);
    }
}
