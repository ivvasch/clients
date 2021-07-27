package ru.inversion.clients.xmlData;

import java.util.ArrayList;
import java.util.List;

public class DepositsXML {
    private List<DepositXML> listDeposit;

    public DepositsXML() {
    }

    public List<DepositXML> getListDeposit() {
        if (listDeposit == null) {
            listDeposit = new ArrayList<>();
            return listDeposit;
        }
        return listDeposit;
    }

    public void setListDeposit(List<DepositXML> listDeposit) {
        this.listDeposit = listDeposit;
    }
}
