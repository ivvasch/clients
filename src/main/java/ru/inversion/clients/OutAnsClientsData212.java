package ru.inversion.clients;

import ru.inversion.clients.mainData.Clients;
import ru.inversion.gateclasses.classes.Result;

import java.util.List;

public class OutAnsClientsData212 extends Result {
    private List<Clients> clientsList = null;

    public OutAnsClientsData212() {
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Clients> clientsList) {
        this.clientsList = clientsList;
    }
}
