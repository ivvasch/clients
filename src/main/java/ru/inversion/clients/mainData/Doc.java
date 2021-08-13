package ru.inversion.clients.mainData;

import java.time.LocalDate;

public class Doc {
    private String type;        // Тип документа
    private String ser;         // Серия документа
    private String num;         // Номер документа
    private LocalDate date;     // Дата выдачи документа
    private String agency;      // Кем выдан
    private String subdiv;      // Код подразделения

    public Doc() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getSubdiv() {
        return subdiv;
    }

    public void setSubdiv(String subdiv) {
        this.subdiv = subdiv;
    }
}
