package ru.inversion.clients.mainData;

public class ClientsCards {
    private Long icusnum;                       // Идентификатор клиента
    private String cusInfo_plcv;                // вид карты
    private String cusInfo_caccacc;             // номер карточного счета
    private String cusInfo_plccur;              // валюта счета
    private String cusInfo_pltsysname;          // платежная система
    private String cusInfo_plctype;             // достаем тип
    private String cusInfo_period;              // срок действия
    private String cusInfo_platype;             // идентификатор типа принадлежности карты: 1 - корпоративная, 2 - личная
    private String cusInfo_plcprim;             // основная 1 / дополнительная 2
    private String cusInfo_invstat;             // текст статуса инверсия
    private String cusInfo_invstatid;           // id статуса инверсии

    public ClientsCards() {
    }

    public String getCusInfo_plcv() {
        return cusInfo_plcv;
    }

    public void setCusInfo_plcv(String cusInfo_plcv) {
        this.cusInfo_plcv = cusInfo_plcv;
    }

    public String getCusInfo_caccacc() {
        return cusInfo_caccacc;
    }

    public void setCusInfo_caccacc(String cusInfo_caccacc) {
        this.cusInfo_caccacc = cusInfo_caccacc;
    }

    public String getCusInfo_plccur() {
        return cusInfo_plccur;
    }

    public void setCusInfo_plccur(String cusInfo_plccur) {
        this.cusInfo_plccur = cusInfo_plccur;
    }

    public String getCusInfo_pltsysname() {
        return cusInfo_pltsysname;
    }

    public void setCusInfo_pltsysname(String cusInfo_pltsysname) {
        this.cusInfo_pltsysname = cusInfo_pltsysname;
    }

    public String getCusInfo_plctype() {
        return cusInfo_plctype;
    }

    public void setCusInfo_plctype(String cusInfo_plctype) {
        this.cusInfo_plctype = cusInfo_plctype;
    }

    public String getCusInfo_period() {
        return cusInfo_period;
    }

    public void setCusInfo_period(String cusInfo_period) {
        this.cusInfo_period = cusInfo_period;
    }

    public String getCusInfo_platype() {
        return cusInfo_platype;
    }

    public void setCusInfo_platype(String cusInfo_platype) {
        this.cusInfo_platype = cusInfo_platype;
    }

    public String getCusInfo_plcprim() {
        return cusInfo_plcprim;
    }

    public void setCusInfo_plcprim(String cusInfo_plcprim) {
        this.cusInfo_plcprim = cusInfo_plcprim;
    }

    public String getCusInfo_invstat() {
        return cusInfo_invstat;
    }

    public void setCusInfo_invstat(String cusInfo_invstat) {
        this.cusInfo_invstat = cusInfo_invstat;
    }

    public String getCusInfo_invstatid() {
        return cusInfo_invstatid;
    }

    public void setCusInfo_invstatid(String cusInfo_invstatid) {
        this.cusInfo_invstatid = cusInfo_invstatid;
    }
}
