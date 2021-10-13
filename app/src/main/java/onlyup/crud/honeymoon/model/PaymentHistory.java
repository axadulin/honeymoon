package onlyup.crud.honeymoon.model;

import java.util.Date;

public class PaymentHistory {
    private String clientName;
    private String clientDate;
    private String clientSumma;

    public PaymentHistory(String clientName, String clientDate, String clientSumma) {
        this.clientName = clientName;
        this.clientDate = clientDate;
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

    public String getClientSumma() {
        return clientSumma;
    }

    public void setClientSumma(String clientSumma) {
        this.clientSumma = clientSumma;
    }
}
