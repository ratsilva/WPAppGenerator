package br.com.wpappgenerator.objects;

import java.util.Date;

public class ClientWP {

    private boolean isWPHost;
    private String name;
    private String email;
    private int account;
    private Date expireDate;

    public boolean isWPHost() {
        return isWPHost;
    }

    public void setWPHost(boolean WPHost) {
        isWPHost = WPHost;
    }
}
