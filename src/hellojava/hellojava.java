package hellojava;

import java.util.Scanner;

class hellojava {

    public static void main(String[] args) {
        System.out.println("Hello user! ");
        while (true) {

            Scanner var = new Scanner(System.in);
            System.out.println("Type anything: ");
            String s = var.next();
            System.out.println("Your input was: " + s + "\n");
            System.out.println("(\"q\", \"quite\", \"exit\" or \"выход\" to stop this helloworld)\n");
            System.out.println("============================");
            if (s.equals("q") || s.equals("quite") || s.equals("exit") || s.equals("выход")) {
                System.out.println("Learn Java and may the force be with you \n\nBye!");
                return;
            }

        }

    }

}