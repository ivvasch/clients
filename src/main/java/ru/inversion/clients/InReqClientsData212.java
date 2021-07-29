package ru.inversion.clients;

import ru.inversion.gateclasses.classes.Context;

public class InReqClientsData212 extends Context {
    private long id;
    private long pr_cusinf;             // Признак (1/0): возвращать основную информацию по клиенту
    private long pr_cusinf_dop;         // Признак (1/0): возвращать дополнительную информацию по клиенту
    private long pr_cus_dep;            // Признак (1/0): возвращать информацию  о банковских вкладах клиента
    private long pr_cus_card;           // Признак (1/0): возвращать информацию  о банковских картах  клиента
    private long pr_cus_acc;            // Признак (1/0): возвращать информацию  о счетах клиента
    private long pr_cr_hist;            // Признак (1/0): возвращать внутреннюю кредитную историю  клиента
    private long pr_arrears;            // Признак (1/0): возвращать расшифровку  просрочек клиента

    public InReqClientsData212() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPr_cusinf() {
        return pr_cusinf;
    }

    public void setPr_cusinf(long pr_cusinf) {
        this.pr_cusinf = pr_cusinf;
    }

    public long getPr_cusinf_dop() {
        return pr_cusinf_dop;
    }

    public void setPr_cusinf_dop(long pr_cusinf_dop) {
        this.pr_cusinf_dop = pr_cusinf_dop;
    }

    public long getPr_cus_dep() {
        return pr_cus_dep;
    }

    public void setPr_cus_dep(long pr_cus_dep) {
        this.pr_cus_dep = pr_cus_dep;
    }

    public long getPr_cus_card() {
        return pr_cus_card;
    }

    public void setPr_cus_card(long pr_cus_card) {
        this.pr_cus_card = pr_cus_card;
    }

    public long getPr_cus_acc() {
        return pr_cus_acc;
    }

    public void setPr_cus_acc(long pr_cus_acc) {
        this.pr_cus_acc = pr_cus_acc;
    }

    public long getPr_cr_hist() {
        return pr_cr_hist;
    }

    public void setPr_cr_hist(long pr_cr_hist) {
        this.pr_cr_hist = pr_cr_hist;
    }

    public long getPr_arrears() {
        return pr_arrears;
    }

    public void setPr_arrears(long pr_arrears) {
        this.pr_arrears = pr_arrears;
    }
}
