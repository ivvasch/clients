package ru.inversion.clients;

import ru.inversion.gateclasses.classes.Result;

import java.util.List;

public class OutAnsClientsData212 extends Result {

    // Скорее всего для решения возврата различных коллекций, в зависимости от запроса, необходимо использовать WildCard
    // или делать проверку на принадлежность возвращаемому классу.
    private List<?> listData = null;

    public OutAnsClientsData212() {
    }

    public List<?> getListData() {
        return listData;
    }

    public void setListData(List<?> listData) {
        this.listData = listData;
    }
}
