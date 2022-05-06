package CodeSchool;

import java.util.Scanner;

public class Social {

    private User[] users = new User[10];
    private String[][] chats = new String[10][10];//-------> Bolor user-neri chateri zangvac

    public boolean register(User user) {

        if (isRegisterEnable() && checkUsername(user)) {
            users[availablePosition()] = user;
            return true;
        }
        return false;

    }

    //Stuguma users-um azat tex ka te che
    private boolean isRegisterEnable() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return true;
            }
        }
        return false;
    }

    //Stugum ev veradardznuma azat texi indexy
    private int availablePosition() {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return i;
            }
        }
        return -1;
    }

    //Stuguma vor nuyn username-ov user chlini
    private boolean checkUsername(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && user.getUsername().equals(users[i].getUsername())) {
                System.out.println("");
                return false;
            }
        }
        return true;
    }

    //Tpuma bolor register exac user-nerin
    public void printUsers() {
        System.out.println();
        for (int j = 0; j < users.length; j++) {
            if (users[j] != null) {
                System.out.println(j + ". " + users[j].toString());
            }
        }
    }

    //2 user-i hamar chata bacum
    public void creatChat() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose 2 user for chat:");

        System.out.print("index1: ");
        int index1 = sc.nextInt();

        System.out.print("index2: ");
        int index2 = sc.nextInt();

        for (int i = 0; i < chats[0].length; i++) {
            if (chats[i][index1] == null) {
                System.out.println("Username: " + users[index1].getUsername());
                sc = new Scanner(System.in);
                chats[i][index1] = sc.next() + " (Wrote to " + index2 + ". " + users[index2].getUsername() + ")";
            }

            if (chats[i][index2] == null) {
                System.out.println("Username: " + users[index2].getUsername());
                sc = new Scanner(System.in);
                chats[i][index2] = sc.next() + " (Wrote to " + index1 + ". " + users[index1].getUsername() + ")";
            }

            if (chats[i][index1].equals("end" + " (Wrote to " + index2 + ". " + users[index2].getUsername() + ")") || chats[i][index2].equals("end" + " (Wrote to " + index1 + ". " + users[index1].getUsername() + ")")) {
                break;
            }
        }
    }

    //cuyca talis user-i namaknery ev vor user-ine grel
    public void chatHistory() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhich Messege do you want to see?");
        System.out.print("Creat index: ");
        int index = sc.nextInt();

        System.out.println("\nUsername: " + users[index].getUsername());
        for (int i = 0; i < chats[0].length; i++) {
            if (chats[i][index] == null) {
                break;
            }
            System.out.println(chats[i][index]);
        }
    }

}
