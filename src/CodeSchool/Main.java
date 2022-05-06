package CodeSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Social social = new Social();
        User user;

        int option;

        do {

            System.out.print("\nCreate Email: ");
            String email = sc.next();

            System.out.print("Create Username: ");
            String username = sc.next();


            System.out.print("Create Gender(true-Male,false-Female): ");
            boolean gender = sc.nextBoolean();

            sc = new Scanner(System.in);
            System.out.print("Create Age: ");
            int age = sc.nextInt();

            sc = new Scanner(System.in);
            System.out.print("\nWe want to register again 1-Yes, 2-Creat Chat: ");
            option = sc.nextInt();


            user = new User(email, username, age, gender);

        } while (social.register(user) && option != 2);

        social.printUsers();


        int option1 = 2;

        while (option1 == 2 || option1 == 1) {

            social.creatChat();
            social.printUsers();

            System.out.println("\n1-Chat History\n2-Creat Chat\n0-End");
            option1 = sc.nextInt();
            if (option1 == 1) {
                social.chatHistory();
            } else if (option1 > 2 || option1 < 1) {
                System.out.println("End Program");
            }

        }

    }
}
