package practice;

import java.util.*;

public class EmailList {
    public String regular = "^([A-Za-z0-9][\\.]?[\\-]?)+@([A-Za-z0-9][\\.]?[\\-]?)+\\.[A-Za-z]{2,6}$";
    public List<String> mail = new ArrayList<>();

    public void add(String email) {
        if (email.matches(regular) && !mail.contains(email.toLowerCase())) {
            mail.add(email);
        }
    }

    public List<String> getSortedEmails() {
        Collections.sort(mail);
        return mail;
    }
}