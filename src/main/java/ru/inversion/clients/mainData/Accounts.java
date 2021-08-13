package ru.inversion.clients.mainData;

public class Accounts {
    private String caccacc;             // номер счета **
    private String cur;                 // валюта **
    private String accname;             // название счета **
    private String status;              // статус О - открыт, З - закрыт, А - арестован, Б - блокирован
    private String branch;              // филиал
    private String ostvr;               // Остаток валютный, реальный
    private String ostrr;               // Остаток в эквиваленте, реальный
    private String ostvp;               // Остаток валютный, плановый
    private String debdark;             // Дебетовый плановый оборот
    private String creddark;            // Кредитовый плановый оборот

    public Accounts() {
    }

    public String getCaccacc() {
        return caccacc;
    }

    public void setCaccacc(String caccacc) {
        this.caccacc = caccacc;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getOstvr() {
        return ostvr;
    }

    public void setOstvr(String ostvr) {
        this.ostvr = ostvr;
    }

    public String getOstrr() {
        return ostrr;
    }

    public void setOstrr(String ostrr) {
        this.ostrr = ostrr;
    }

    public String getOstvp() {
        return ostvp;
    }

    public void setOstvp(String ostvp) {
        this.ostvp = ostvp;
    }

    public String getDebdark() {
        return debdark;
    }

    public void setDebdark(String debdark) {
        this.debdark = debdark;
    }

    public String getCreddark() {
        return creddark;
    }

    public void setCreddark(String creddark) {
        this.creddark = creddark;
    }
}
