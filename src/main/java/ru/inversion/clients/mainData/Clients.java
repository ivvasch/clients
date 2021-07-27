package ru.inversion.clients.mainData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

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

    public Clients() {
    }

    public long getcusInfo_cusnum() {
        return cusInfo_cusnum;
    }

    public void setcusInfo_cusnum(long cusInfo_cusnum) {
        this.cusInfo_cusnum = cusInfo_cusnum;
    }

    public String getcusInfo_lastname() {
        return cusInfo_lastname;
    }

    public void setcusInfo_lastname(String cusInfo_lastname) {
        this.cusInfo_lastname = cusInfo_lastname;
    }

    public String getcusInfo_firstName() {
        return cusInfo_firstName;
    }

    public void setcusInfo_firstName(String cusInfo_firstName) {
        this.cusInfo_firstName = cusInfo_firstName;
    }

    public String getcusInfo_middleName() {
        return cusInfo_middleName;
    }

    public void setcusInfo_middleName(String cusInfo_middleName) {
        this.cusInfo_middleName = cusInfo_middleName;
    }

    public LocalDate getcusInfo_birthday() {
        return cusInfo_birthday;
    }

    public void setcusInfo_birthday(LocalDate cusInfo_birthday) {
        this.cusInfo_birthday = cusInfo_birthday;
    }

    public String getcusInfo_resident() {
        return cusInfo_resident;
    }

    public void setcusInfo_resident(String cusInfo_resident) {
        this.cusInfo_resident = cusInfo_resident;
    }

    public String getcusInfo_doc_inn() {
        return cusInfo_doc_inn;
    }

    public void setcusInfo_doc_inn(String cusInfo_doc_inn) {
        this.cusInfo_doc_inn = cusInfo_doc_inn;
    }

    public String getcusInfo_citizenship() {
        return cusInfo_citizenship;
    }

    public void setcusInfo_citizenship(String cusInfo_citizenship) {
        this.cusInfo_citizenship = cusInfo_citizenship;
    }

    public String getcusInfo_magicWord() {
        return cusInfo_magicWord;
    }

    public void setcusInfo_magicWord(String cusInfo_magicWord) {
        this.cusInfo_magicWord = cusInfo_magicWord;
    }

    public String getcusInfo_filial() {
        return cusInfo_filial;
    }

    public void setcusInfo_filial(String cusInfo_filial) {
        this.cusInfo_filial = cusInfo_filial;
    }

    public String getcusInfo_dopen() {
        return cusInfo_dopen;
    }

    public void setcusInfo_dopen(String cusInfo_dopen) {
        this.cusInfo_dopen = cusInfo_dopen;
    }

    public String getcusInfo_doc_type() {
        return cusInfo_doc_type;
    }

    public void setcusInfo_doc_type(String cusInfo_doc_type) {
        this.cusInfo_doc_type = cusInfo_doc_type;
    }

    public String getcusInfo_doc_ser() {
        return cusInfo_doc_ser;
    }

    public void setcusInfo_doc_ser(String cusInfo_doc_ser) {
        this.cusInfo_doc_ser = cusInfo_doc_ser;
    }

    public String getcusInfo_doc_num() {
        return cusInfo_doc_num;
    }

    public void setcusInfo_doc_num(String cusInfo_doc_num) {
        this.cusInfo_doc_num = cusInfo_doc_num;
    }

    public LocalDate getcusInfo_doc_date() {
        return cusInfo_doc_date;
    }

    public void setcusInfo_doc_date(LocalDate cusInfo_doc_date) {
        this.cusInfo_doc_date = cusInfo_doc_date;
    }

    public String getcusInfo_doc_agency() {
        return cusInfo_doc_agency;
    }

    public void setcusInfo_doc_agency(String cusInfo_doc_agency) {
        this.cusInfo_doc_agency = cusInfo_doc_agency;
    }

    public String getcusInfo_doc_subdiv() {
        return cusInfo_doc_subdiv;
    }

    public void setcusInfo_doc_subdiv(String cusInfo_doc_subdiv) {
        this.cusInfo_doc_subdiv = cusInfo_doc_subdiv;
    }
}
