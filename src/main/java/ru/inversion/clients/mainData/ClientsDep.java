package ru.inversion.clients.mainData;

import java.time.LocalDate;

public class ClientsDep {
    private String cusInfo_idvne;              // внешний номер договора
    private String cusInfo_idvny;              // внутренний номер договора
    private String cusInfo_cur;                // валюта
    private String cusInfo_start_sum;          // первоначальная сумма вклада
    private LocalDate cusInfo_odate;           // дата открытия
    private LocalDate cusInfo_cdate;           // дата окончания
    private String cusInfo_caccacc;            // номер счета
    private String cusInfo_status;             // статус
    private String cusInfo_status_num;         // статус цифрами
    private String cusInfo_prod_num;           // Продукт цифрами
    private String cusInfo_prod;               //  Продукт
    private String cusInfo_branch;             // филиал
    // Ниже находятся переменные возвращаемые из базы в формате XML
    private String ost_sum;
    //    private String idvne;
    //    private String idvny;
    //    private String cur;
    //    private String start_sum;
    //    private LocalDate odate;
    //    private LocalDate cdate;
    //    private String caccacc;
    //    private String status;
    //    private String status_num;
    //    private String prod_num;
    //    private String prod;

    public ClientsDep() {
    }

    public String getOst_sum() {
        return ost_sum;
    }

    public void setOst_sum(String ost_sum) {
        this.ost_sum = ost_sum;
    }

    public String getCusInfo_idvne() {
        return cusInfo_idvne;
    }

    public void setCusInfo_idvne(String cusInfo_idvne) {
        this.cusInfo_idvne = cusInfo_idvne;
    }

    public String getCusInfo_idvny() {
        return cusInfo_idvny;
    }

    public void setCusInfo_idvny(String cusInfo_idvny) {
        this.cusInfo_idvny = cusInfo_idvny;
    }

    public String getCusInfo_cur() {
        return cusInfo_cur;
    }

    public void setCusInfo_cur(String cusInfo_cur) {
        this.cusInfo_cur = cusInfo_cur;
    }

    public String getCusInfo_start_sum() {
        return cusInfo_start_sum;
    }

    public void setCusInfo_start_sum(String cusInfo_start_sum) {
        this.cusInfo_start_sum = cusInfo_start_sum;
    }

    public LocalDate getCusInfo_odate() {
        return cusInfo_odate;
    }

    public void setCusInfo_odate(LocalDate cusInfo_odate) {
        this.cusInfo_odate = cusInfo_odate;
    }

    public LocalDate getCusInfo_cdate() {
        return cusInfo_cdate;
    }

    public void setCusInfo_cdate(LocalDate cusInfo_cdate) {
        this.cusInfo_cdate = cusInfo_cdate;
    }

    public String getCusInfo_caccacc() {
        return cusInfo_caccacc;
    }

    public void setCusInfo_caccacc(String cusInfo_caccacc) {
        this.cusInfo_caccacc = cusInfo_caccacc;
    }

    public String getCusInfo_status() {
        return cusInfo_status;
    }

    public void setCusInfo_status(String cusInfo_status) {
        this.cusInfo_status = cusInfo_status;
    }

    public String getCusInfo_status_num() {
        return cusInfo_status_num;
    }

    public void setCusInfo_status_num(String cusInfo_status_num) {
        this.cusInfo_status_num = cusInfo_status_num;
    }

    public String getCusInfo_prod_num() {
        return cusInfo_prod_num;
    }

    public void setCusInfo_prod_num(String cusInfo_prod_num) {
        this.cusInfo_prod_num = cusInfo_prod_num;
    }

    public String getCusInfo_prod() {
        return cusInfo_prod;
    }

    public void setCusInfo_prod(String cusInfo_prod) {
        this.cusInfo_prod = cusInfo_prod;
    }

    public String getCusInfo_branch() {
        return cusInfo_branch;
    }

    public void setCusInfo_branch(String cusInfo_branch) {
        this.cusInfo_branch = cusInfo_branch;
    }
}
