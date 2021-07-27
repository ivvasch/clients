package ru.inversion.clients.xmlData;

import java.util.ArrayList;
import java.util.List;

public class AccountsXML {
    private List<AccountXML> listAccounts;

    public AccountsXML() {
    }

    public List<AccountXML> getListAccounts() {
        if (listAccounts == null) {
            listAccounts = new ArrayList<>();
            return listAccounts;
        } else
        return listAccounts;
    }

    public void setListAccounts(List<AccountXML> listAccounts) {
        this.listAccounts = listAccounts;
    }
}
