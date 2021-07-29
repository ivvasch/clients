package ru.inversion.clients;

import ru.inversion.clients.mainData.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Clients {
    private long cusInfo_cusnum;            // Ид клиента
    private String cusInfo_lastname;        // Фамилия
    private String cusInfo_firstName;       // Имя
    private String cusInfo_middleName;      // Отчество
    private LocalDate cusInfo_birthday;     // Дата рождения
    private String cusInfo_resident;        // Резидент или нет
    private String cusInfo_doc_inn;         // ИНН
    private String cusInfo_citizenship;     // Гражданство
    private String cusInfo_magicWord;       // Кодовое слово
    private String cusInfo_filial;          // Филиал
    private String cusInfo_dopen;           // Дата заведения клиента
    private String cusInfo_doc_type;        // Тип документа
    private String cusInfo_doc_ser;         // Серия документа
    private String cusInfo_doc_num;         // Номер документа
    private LocalDate cusInfo_doc_date;     // Дата выдачи документа
    private String cusInfo_doc_agency;      // Кем выдан
    private String cusInfo_doc_subdiv;      // Код подразделения
    // Дополнительная информация по клиенту
    private List<ClientsAcc> accountsList;
    private List<ClientsCards> cardsList;
    private List<ClientsHist> histsList;
    private List<ClientsDep> depositsList;
    private List<ClientsDop> dopsList;

    public Clients() {
    }

    public long getCusInfo_cusnum() {
        return cusInfo_cusnum;
    }

    public void setCusInfo_cusnum(long cusInfo_cusnum) {
        this.cusInfo_cusnum = cusInfo_cusnum;
    }

    public String getCusInfo_lastname() {
        return cusInfo_lastname;
    }

    public void setCusInfo_lastname(String cusInfo_lastname) {
        this.cusInfo_lastname = cusInfo_lastname;
    }

    public String getCusInfo_firstName() {
        return cusInfo_firstName;
    }

    public void setCusInfo_firstName(String cusInfo_firstName) {
        this.cusInfo_firstName = cusInfo_firstName;
    }

    public String getCusInfo_middleName() {
        return cusInfo_middleName;
    }

    public void setCusInfo_middleName(String cusInfo_middleName) {
        this.cusInfo_middleName = cusInfo_middleName;
    }

    public LocalDate getCusInfo_birthday() {
        return cusInfo_birthday;
    }

    public void setCusInfo_birthday(LocalDate cusInfo_birthday) {
        this.cusInfo_birthday = cusInfo_birthday;
    }

    public String getCusInfo_resident() {
        return cusInfo_resident;
    }

    public void setCusInfo_resident(String cusInfo_resident) {
        this.cusInfo_resident = cusInfo_resident;
    }

    public String getCusInfo_doc_inn() {
        return cusInfo_doc_inn;
    }

    public void setCusInfo_doc_inn(String cusInfo_doc_inn) {
        this.cusInfo_doc_inn = cusInfo_doc_inn;
    }

    public String getCusInfo_citizenship() {
        return cusInfo_citizenship;
    }

    public void setCusInfo_citizenship(String cusInfo_citizenship) {
        this.cusInfo_citizenship = cusInfo_citizenship;
    }

    public String getCusInfo_magicWord() {
        return cusInfo_magicWord;
    }

    public void setCusInfo_magicWord(String cusInfo_magicWord) {
        this.cusInfo_magicWord = cusInfo_magicWord;
    }

    public String getCusInfo_filial() {
        return cusInfo_filial;
    }

    public void setCusInfo_filial(String cusInfo_filial) {
        this.cusInfo_filial = cusInfo_filial;
    }

    public String getCusInfo_dopen() {
        return cusInfo_dopen;
    }

    public void setCusInfo_dopen(String cusInfo_dopen) {
        this.cusInfo_dopen = cusInfo_dopen;
    }

    public String getCusInfo_doc_type() {
        return cusInfo_doc_type;
    }

    public void setCusInfo_doc_type(String cusInfo_doc_type) {
        this.cusInfo_doc_type = cusInfo_doc_type;
    }

    public String getCusInfo_doc_ser() {
        return cusInfo_doc_ser;
    }

    public void setCusInfo_doc_ser(String cusInfo_doc_ser) {
        this.cusInfo_doc_ser = cusInfo_doc_ser;
    }

    public String getCusInfo_doc_num() {
        return cusInfo_doc_num;
    }

    public void setCusInfo_doc_num(String cusInfo_doc_num) {
        this.cusInfo_doc_num = cusInfo_doc_num;
    }

    public LocalDate getCusInfo_doc_date() {
        return cusInfo_doc_date;
    }

    public void setCusInfo_doc_date(LocalDate cusInfo_doc_date) {
        this.cusInfo_doc_date = cusInfo_doc_date;
    }

    public String getCusInfo_doc_agency() {
        return cusInfo_doc_agency;
    }

    public void setCusInfo_doc_agency(String cusInfo_doc_agency) {
        this.cusInfo_doc_agency = cusInfo_doc_agency;
    }

    public String getCusInfo_doc_subdiv() {
        return cusInfo_doc_subdiv;
    }

    public void setCusInfo_doc_subdiv(String cusInfo_doc_subdiv) {
        this.cusInfo_doc_subdiv = cusInfo_doc_subdiv;
    }

    public List<ClientsAcc> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(List<ClientsAcc> accountsList) {
        this.accountsList = accountsList;
    }

    public List<ClientsCards> getCardsList() {
        return cardsList;
    }

    public void setCardsList(List<ClientsCards> cardsList) {
        this.cardsList = cardsList;
    }

    public List<ClientsHist> getHistsList() {
        return histsList;
    }

    public void setHistsList(List<ClientsHist> histsList) {
        this.histsList = histsList;
    }

    public List<ClientsDep> getDepositsList() {
        return depositsList;
    }

    public void setDepositsList(List<ClientsDep> depositsList) {
        this.depositsList = depositsList;
    }

    public List<ClientsDop> getDopsList() {
        return dopsList;
    }

    public void setDopsList(List<ClientsDop> dopsList) {
        this.dopsList = dopsList;
    }
}
