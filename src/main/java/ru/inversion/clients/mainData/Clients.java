package ru.inversion.clients.mainData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Clients {
    private long cusinfo_cusnum;            // Ид клиента
    private String cusinfo_lastname;        // Фамилия
    private String cusinfo_firstName;       // Имя
    private String cusinfo_middleName;      // Отчество
    private LocalDate cusinfo_birthday;     // Дата рождения
    private String cusinfo_resident;        // Резидент или нет
    private String cusinfo_doc_inn;         // ИНН
    private String cusinfo_citizenship;     // Гражданство
    private String cusinfo_magicWord;       // Кодовое слово
    private String cusinfo_filial;          // Филиал
    private String cusinfo_dopen;           // Дата заведения клиента
    private String cusinfo_doc_type;        // Тип документа
    private String cusinfo_doc_ser;         // Серия документа
    private String cusinfo_doc_num;         // Номер документа
    private LocalDate cusinfo_doc_date;     // Дата выдачи документа
    private String cusinfo_doc_agency;      // Кем выдан
    private String cusinfo_doc_subdiv;      // Код подразделения

    public Clients() {
    }

    public long getCusinfo_cusnum() {
        return cusinfo_cusnum;
    }

    public void setCusinfo_cusnum(long cusinfo_cusnum) {
        this.cusinfo_cusnum = cusinfo_cusnum;
    }

    public String getCusinfo_lastname() {
        return cusinfo_lastname;
    }

    public void setCusinfo_lastname(String cusinfo_lastname) {
        this.cusinfo_lastname = cusinfo_lastname;
    }

    public String getCusinfo_firstName() {
        return cusinfo_firstName;
    }

    public void setCusinfo_firstName(String cusinfo_firstName) {
        this.cusinfo_firstName = cusinfo_firstName;
    }

    public String getCusinfo_middleName() {
        return cusinfo_middleName;
    }

    public void setCusinfo_middleName(String cusinfo_middleName) {
        this.cusinfo_middleName = cusinfo_middleName;
    }

    public LocalDate getCusinfo_birthday() {
        return cusinfo_birthday;
    }

    public void setCusinfo_birthday(LocalDate cusinfo_birthday) {
        this.cusinfo_birthday = cusinfo_birthday;
    }

    public String getCusinfo_resident() {
        return cusinfo_resident;
    }

    public void setCusinfo_resident(String cusinfo_resident) {
        this.cusinfo_resident = cusinfo_resident;
    }

    public String getCusinfo_doc_inn() {
        return cusinfo_doc_inn;
    }

    public void setCusinfo_doc_inn(String cusinfo_doc_inn) {
        this.cusinfo_doc_inn = cusinfo_doc_inn;
    }

    public String getCusinfo_citizenship() {
        return cusinfo_citizenship;
    }

    public void setCusinfo_citizenship(String cusinfo_citizenship) {
        this.cusinfo_citizenship = cusinfo_citizenship;
    }

    public String getCusinfo_magicWord() {
        return cusinfo_magicWord;
    }

    public void setCusinfo_magicWord(String cusinfo_magicWord) {
        this.cusinfo_magicWord = cusinfo_magicWord;
    }

    public String getCusinfo_filial() {
        return cusinfo_filial;
    }

    public void setCusinfo_filial(String cusinfo_filial) {
        this.cusinfo_filial = cusinfo_filial;
    }

    public String getCusinfo_dopen() {
        return cusinfo_dopen;
    }

    public void setCusinfo_dopen(String cusinfo_dopen) {
        this.cusinfo_dopen = cusinfo_dopen;
    }

    public String getCusinfo_doc_type() {
        return cusinfo_doc_type;
    }

    public void setCusinfo_doc_type(String cusinfo_doc_type) {
        this.cusinfo_doc_type = cusinfo_doc_type;
    }

    public String getCusinfo_doc_ser() {
        return cusinfo_doc_ser;
    }

    public void setCusinfo_doc_ser(String cusinfo_doc_ser) {
        this.cusinfo_doc_ser = cusinfo_doc_ser;
    }

    public String getCusinfo_doc_num() {
        return cusinfo_doc_num;
    }

    public void setCusinfo_doc_num(String cusinfo_doc_num) {
        this.cusinfo_doc_num = cusinfo_doc_num;
    }

    public LocalDate getCusinfo_doc_date() {
        return cusinfo_doc_date;
    }

    public void setCusinfo_doc_date(LocalDate cusinfo_doc_date) {
        this.cusinfo_doc_date = cusinfo_doc_date;
    }

    public String getCusinfo_doc_agency() {
        return cusinfo_doc_agency;
    }

    public void setCusinfo_doc_agency(String cusinfo_doc_agency) {
        this.cusinfo_doc_agency = cusinfo_doc_agency;
    }

    public String getCusinfo_doc_subdiv() {
        return cusinfo_doc_subdiv;
    }

    public void setCusinfo_doc_subdiv(String cusinfo_doc_subdiv) {
        this.cusinfo_doc_subdiv = cusinfo_doc_subdiv;
    }
}
