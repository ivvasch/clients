package ru.inversion.clients.mainData;

public class ClientsAcc {
    private Long icusnum;               // Идентификатор клиента
    private String cusInfo_caccacc;             // номер счета
    private String cusInfo_cur;                 // валюта
    private String cusInfo_accname;             // название счета
    private String cusInfo_status;              // статус О - открыт, З - закрыт, А - арестован, Б - блокирован
    private String cusInfo_branch;              // филиал

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
}
