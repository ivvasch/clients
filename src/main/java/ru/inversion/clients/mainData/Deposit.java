package ru.inversion.clients.mainData;

import java.time.LocalDate;

public class Deposit {
    private String idvne;              // внешний номер договора
    private String idvny;              // внутренний номер договора
    private String cur;                // валюта
    private String start_sum;          // первоначальная сумма вклада
    private String ost_sum;
    private LocalDate odate;           // дата открытия
    private LocalDate cdate;           // дата окончания
    private String caccacc;            // номер счета
    private String status;             // статус
    private String status_num;         // статус цифрами
    private String prod_num;           // Продукт цифрами
    private String prod;               //  Продукт

    public Deposit() {
    }

    public String getOst_sum() {
        return ost_sum;
    }

    public void setOst_sum(String ost_sum) {
        this.ost_sum = ost_sum;
    }

    public String getIdvne() {
        return idvne;
    }

    public void setIdvne(String idvne) {
        this.idvne = idvne;
    }

    public String getIdvny() {
        return idvny;
    }

    public void setIdvny(String idvny) {
        this.idvny = idvny;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getStart_sum() {
        return start_sum;
    }

    public void setStart_sum(String start_sum) {
        this.start_sum = start_sum;
    }

    public LocalDate getOdate() {
        return odate;
    }

    public void setOdate(LocalDate odate) {
        this.odate = odate;
    }

    public LocalDate getCdate() {
        return cdate;
    }

    public void setCdate(LocalDate cdate) {
        this.cdate = cdate;
    }

    public String getCaccacc() {
        return caccacc;
    }

    public void setCaccacc(String caccacc) {
        this.caccacc = caccacc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_num() {
        return status_num;
    }

    public void setStatus_num(String status_num) {
        this.status_num = status_num;
    }

    public String getProd_num() {
        return prod_num;
    }

    public void setProd_num(String prod_num) {
        this.prod_num = prod_num;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

}
