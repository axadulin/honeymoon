package onlyup.crud.honeymoon.model;

public class Clients {
    private String clientName;
    private String phoneNumber;

    public Clients(String clientName, String phoneNumber) {
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
