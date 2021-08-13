package ru.inversion.clients.mainData;

import java.time.LocalDate;

public class Card {
    private String plcid;               // идентификатор карты
    private String plcnum;              // номер карты
    private String plcv;                // вид карты
    private String caccacc;             // номер карточного счета
    private String plccur;              // валюта счета
    private String pltsysname;          // платежная система
    private String plctype;             // тип карты (Gold, Platinum, Classic)
    private String period;              // срок действия
    private String platype;             // идентификатор типа принадлежности карты: 1 - корпоративная, 2 - личная
    private String plcprim;             // основная 1 / дополнительная 2
    private String invstat;             // текст статуса инверсия
    private String invstatid;           // id статуса инверсии
    private LocalDate dclose;           // дата закрытия карты
    private String branch;              // филиал
    private String ostvr;               // остаток валютный, реальный
    private String ostrr;               // остаток в эквиваленте, реальный
    private String ostvp;               // остаток валютный, плановый
    private String plcidosn;            // ??? че за переменная
    private String plcnumosn;           // ??? че за переменная

    public Card() {
    }

    public String getPlcid() {
        return plcid;
    }

    public void setPlcid(String plcid) {
        this.plcid = plcid;
    }

    public String getPlcnum() {
        return plcnum;
    }

    public void setPlcnum(String plcnum) {
        this.plcnum = plcnum;
    }

    public LocalDate getDclose() {
        return dclose;
    }

    public void setDclose(LocalDate dclose) {
        this.dclose = dclose;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPlcv() {
        return plcv;
    }

    public void setPlcv(String plcv) {
        this.plcv = plcv;
    }

    public String getCaccacc() {
        return caccacc;
    }

    public void setCaccacc(String caccacc) {
        this.caccacc = caccacc;
    }

    public String getPlccur() {
        return plccur;
    }

    public void setPlccur(String plccur) {
        this.plccur = plccur;
    }

    public String getPltsysname() {
        return pltsysname;
    }

    public void setPltsysname(String pltsysname) {
        this.pltsysname = pltsysname;
    }

    public String getPlctype() {
        return plctype;
    }

    public void setPlctype(String plctype) {
        this.plctype = plctype;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPlatype() {
        return platype;
    }

    public void setPlatype(String platype) {
        this.platype = platype;
    }

    public String getPlcprim() {
        return plcprim;
    }

    public void setPlcprim(String plcprim) {
        this.plcprim = plcprim;
    }

    public String getInvstat() {
        return invstat;
    }

    public void setInvstat(String invstat) {
        this.invstat = invstat;
    }

    public String getInvstatid() {
        return invstatid;
    }

    public void setInvstatid(String invstatid) {
        this.invstatid = invstatid;
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

    public String getPlcidosn() {
        return plcidosn;
    }

    public void setPlcidosn(String plcidosn) {
        this.plcidosn = plcidosn;
    }

    public String getPlcnumosn() {
        return plcnumosn;
    }

    public void setPlcnumosn(String plcnumosn) {
        this.plcnumosn = plcnumosn;
    }
}
