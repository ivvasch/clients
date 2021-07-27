package ru.inversion.clients.xmlData;

public class AccountXML {
    private String caccAcc;     // номер счета
    private String caccCur;     // валюта
    private String caccName;    // название
    private String caccprizn;   // статус О - открыт, З - закрыт, А - арестован, Б - блокирован
    private String ismrfil;     // филиал (принадлежность)
    private String ostvr;       // Остаток валютный, реальный
    private String ostrr;       // Остаток в эквиваленте, реальный
    private String ostvp;       // Остаток валютный, плановый
    private String debdark;     // Дебетовый плановый оборот
    private String creddark;    // Кредитовый плановый оборот


    public AccountXML() {
    }

    public String getCaccAcc() {
        return caccAcc;
    }

    public void setCaccAcc(String caccAcc) {
        this.caccAcc = caccAcc;
    }

    public String getCaccCur() {
        return caccCur;
    }

    public void setCaccCur(String caccCur) {
        this.caccCur = caccCur;
    }

    public String getCaccName() {
        return caccName;
    }

    public void setCaccName(String caccName) {
        this.caccName = caccName;
    }

    public String getCaccprizn() {
        return caccprizn;
    }

    public void setCaccprizn(String caccprizn) {
        this.caccprizn = caccprizn;
    }

    public String getIsmrfil() {
        return ismrfil;
    }

    public void setIsmrfil(String ismrfil) {
        this.ismrfil = ismrfil;
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
