package ru.inversion.clients.xmlData;

import java.time.LocalDate;

public class DepositXML {
    private String idvne;
    private String idvny;
    private String cur;
    private String start_sum;
    private String ost_sum;
    private LocalDate odate;
    private LocalDate cdate;
    private String caccacc;
    private String status;
    private String status_num;
    private String prod_num;
    private String prod;

    public DepositXML() {
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

    public String getOst_sum() {
        return ost_sum;
    }

    public void setOst_sum(String ost_sum) {
        this.ost_sum = ost_sum;
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
