package ru.inversion.clients.xmlData;

import java.util.ArrayList;
import java.util.List;

public class CardsXML {
    private List<CardXML> listCards;

    public CardsXML() {
    }

    public List<CardXML> getListCards() {
        if (listCards == null) {
            listCards = new ArrayList<>();
            return listCards;
        } else
        return listCards;
    }

    public void setListCards(List<CardXML> listCards) {
        this.listCards = listCards;
    }
}
