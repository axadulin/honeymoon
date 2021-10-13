package onlyup.crud.honeymoon.model;

public class OrdersHistory {
    private String clientName;
    private String clientDate;
    private String clientTime;
    private String clientSumma;

    public OrdersHistory(String clientName, String clientDate, String clientTime, String clientSumma) {
        this.clientName = clientName;
        this.clientDate = clientDate;
        this.clientTime = clientTime;
        this.clientSumma = clientSumma;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientDate() {
        return clientDate;
    }

    public void setClientDate(String clientDate) {
        this.clientDate = clientDate;
    }

    public String getClientTime() {
        return clientTime;
    }

    public void setClientTime(String clientTime) {
        this.clientTime = clientTime;
    }

    public String getClientSumma() {
        return clientSumma;
    }

    public void setClientSumma(String clientSumma) {
        this.clientSumma = clientSumma;
    }
}
