package ru.inversion.clients;

import ru.inversion.clients.mainData.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Cusinfo {
    private long cusnum;            // Ид клиента
    private String lastname;        // Фамилия
    private String firstName;       // Имя
    private String middleName;      // Отчество
    private LocalDate birthday;     // Дата рождения
    private String resident;        // Резидент или нет
    private String inn;             // ИНН
    private String citizenship;     // Гражданство
    private String magic_word;      // Кодовое слово
    private String filial;          // Филиал
    private String cus_qty;         // Категория качества
    private LocalDate dopen;        // Дата заведения клиента
    private String birthplace;      // Место рождения
    private String sex;             // Пол
    private Doc doc;
    // Дополнительная информация по клиенту
    private List<Addr> addrList;          // Список адресов
    private List<Accounts> accountsList;  // Список счетов клиента
    private List<Card> cardsList;         // Список карточек клиентов
    private List<Vn_cred_hist> histsList; // Клиентская история
    private List<Deposit> depositsList;   // Список депозитов
    private List<ClientsDop> dopsList;    // Список дополнительной информации

    public Cusinfo() {
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    public String getCus_qty() {
        return cus_qty;
    }

    public void setCus_qty(String cus_qty) {
        this.cus_qty = cus_qty;
    }

    public long getCusnum() {
        return cusnum;
    }

    public void setCusnum(long cusnum) {
        this.cusnum = cusnum;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getMagic_word() {
        return magic_word;
    }

    public void setMagic_word(String magic_word) {
        this.magic_word = magic_word;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public LocalDate getDopen() {
        return dopen;
    }

    public void setDopen(LocalDate dopen) {
        this.dopen = dopen;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Accounts> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(List<Accounts> accountsList) {
        this.accountsList = accountsList;
    }

    public List<Card> getCardsList() {
        return cardsList;
    }

    public void setCardsList(List<Card> cardsList) {
        this.cardsList = cardsList;
    }

    public List<Vn_cred_hist> getHistsList() {
        return histsList;
    }

    public void setHistsList(List<Vn_cred_hist> histsList) {
        this.histsList = histsList;
    }

    public List<Deposit> getDepositsList() {
        return depositsList;
    }

    public void setDepositsList(List<Deposit> depositsList) {
        this.depositsList = depositsList;
    }

    public List<ClientsDop> getDopsList() {
        return dopsList;
    }

    public void setDopsList(List<ClientsDop> dopsList) {
        this.dopsList = dopsList;
    }
}
