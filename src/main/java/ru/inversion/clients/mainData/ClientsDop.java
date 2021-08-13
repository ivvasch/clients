package ru.inversion.clients.mainData;

import java.util.List;

public class ClientsDop {
    private List<Ph> phoneList;
    private List<Em> emList;

    public ClientsDop() {
    }

    public List<Ph> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Ph> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Em> getEmList() {
        return emList;
    }

    public void setEmList(List<Em> emList) {
        this.emList = emList;
    }
}
