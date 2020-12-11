package es.ulpgc.dis.model;

import es.ulpgc.dis.mail.Mail;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final Integer ID;
    private final String name;
    private final String password;
    private final Mail mail;

    private List<Rule> rules = new ArrayList<Rule>();

    public Account(Integer ID, String name, String password, Mail mail) {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.mail = mail;
    }
}
