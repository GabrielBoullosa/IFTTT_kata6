package es.ulpgc.dis.mail;

public class GmailDomainMail implements Mail {
    private final String name;
    private final String extension;

    public GmailDomainMail(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public String mail() {
        return name + "@gmail" + extension;
    }
}
