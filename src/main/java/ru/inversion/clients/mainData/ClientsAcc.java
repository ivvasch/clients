package ru.inversion.clients.mainData;

public class ClientsAcc {
    private String cusInfo_caccacc;             // номер счета
    private String cusInfo_cur;                 // валюта
    private String cusInfo_accname;             // название счета
    private String cusInfo_status;              // статус О - открыт, З - закрыт, А - арестован, Б - блокирован
    private String cusInfo_branch;              // филиал
    // ниже возвращающиеся переменные из АБС возвращаются в формате XML
    private String ostvr;       // Остаток валютный, реальный
    private String ostrr;       // Остаток в эквиваленте, реальный
    private String ostvp;       // Остаток валютный, плановый
    private String debdark;     // Дебетовый плановый оборот
    private String creddark;    // Кредитовый плановый оборот
    //    private String caccAcc;     // номер счета
    //    private String caccCur;     // валюта
    //    private String caccName;    // название
    //    private String caccprizn;   // статус О - открыт, З - закрыт, А - арестован, Б - блокирован
    //    private String ismrfil;     // филиал (принадлежность)
    public ClientsAcc() {
    }

    public String getCusInfo_caccacc() {
        return cusInfo_caccacc;
    }

    public void setCusInfo_caccacc(String cusInfo_caccacc) {
        this.cusInfo_caccacc = cusInfo_caccacc;
    }

    public String getCusInfo_cur() {
        return cusInfo_cur;
    }

    public void setCusInfo_cur(String cusInfo_cur) {
        this.cusInfo_cur = cusInfo_cur;
    }

    public String getCusInfo_accname() {
        return cusInfo_accname;
    }

    public void setCusInfo_accname(String cusInfo_accname) {
        this.cusInfo_accname = cusInfo_accname;
    }

    public String getCusInfo_status() {
        return cusInfo_status;
    }

    public void setCusInfo_status(String cusInfo_status) {
        this.cusInfo_status = cusInfo_status;
    }

    public String getCusInfo_branch() {
        return cusInfo_branch;
    }

    public void setCusInfo_branch(String cusInfo_branch) {
        this.cusInfo_branch = cusInfo_branch;
    }

    // Геттеры и сеттеры XML переменных

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
