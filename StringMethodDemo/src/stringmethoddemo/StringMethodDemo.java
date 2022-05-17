package stringmethoddemo;

import java.util.Scanner;

public class StringMethodDemo {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = computerKeyboardInput.nextLine();
        while (name.isEmpty()) {
            System.out.print("Invalid entry. You must enter your name: ");
            name = computerKeyboardInput.nextLine();
        }
        System.out.println("Hello, " + name + "!");
    }
}
