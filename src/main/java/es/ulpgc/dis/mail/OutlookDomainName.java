package es.ulpgc.dis.mail;

public class OutlookDomainName implements Mail {
    private String name;
    private String extension;

    public OutlookDomainName(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public String mail() {
        return name + "@outlook" + extension;
    }
}
