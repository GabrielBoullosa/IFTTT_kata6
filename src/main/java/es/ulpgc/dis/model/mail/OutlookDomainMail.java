package es.ulpgc.dis.model.mail;

public class OutlookDomainMail implements Mail {
    private String name;
    private String extension;

    public OutlookDomainMail(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public String mail() {
        return name + "@outlook" + extension;
    }
}
