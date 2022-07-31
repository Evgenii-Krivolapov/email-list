package practice;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static EmailList emailList = new EmailList();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String[] splitString = input.split(" ");
            String email = "";
            if (splitString[0].equals("ADD") && splitString[1].matches(emailList.regular)) {
                email += splitString[1].toLowerCase();
                emailList.add(email);
                System.out.println(email);
            } else if (splitString[0].equals("LIST")) {
                Collections.sort(emailList.mail);
                for (String textWithMail : emailList.getSortedEmails()) {
                    System.out.println(textWithMail);
                }
            } else {
                System.out.println(WRONG_EMAIL_ANSWER);
            }
        }
    }
}