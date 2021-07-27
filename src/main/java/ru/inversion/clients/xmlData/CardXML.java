package ru.inversion.clients.xmlData;

public class CardXML {
    private Long icusnum;           // Идентификатор клиента
    private String plcid;           // идентификатор карты
    private String plcnum;          // номер карты
    private String plcv;            // вид карты 1 - кредитная, 2 - дебетовая
    private String caccacc;         // номер карточного счета
    private String plccur;          // валюта
    private String pltsysname;      // платежная система
    private String plctype;         // тип карты (Gold, Platinum, Classic)
    private String period;          // срок дествия
    private String platype;         // идентификатор типа принадлежности карты: 1 - корпоративная, 2 - личная
    private String plcprim;         // основная 1 / дополнительная 2
    private String invstat;         // текст статуса инверсия
    private String invstatid;       // id статуса инверсии
    private String vnstat;          // текст статуса внешней системы    статус карты (новая, активная, блокирована)
    private String dclose;          // дата закрытия карты
    private String branch;          // филиал

    public CardXML() {
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

    public String getVnstat() {
        return vnstat;
    }

    public void setVnstat(String vnstat) {
        this.vnstat = vnstat;
    }

    public String getDclose() {
        return dclose;
    }

    public void setDclose(String dclose) {
        this.dclose = dclose;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
