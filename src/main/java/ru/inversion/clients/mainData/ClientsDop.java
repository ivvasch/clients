package ru.inversion.clients.mainData;

public class ClientsDop {
    private String cusInfo_ph_type;             // Тип: (0-телефон, 1-факс и т.п.)
    private String cusInfo_ph_cnt;              // Телефонный код страны
    private String cusInfo_ph_city;             // Код города
    private String cusInfo_ph_num;              // Номер телефона
    private String cusInfo_ph_ext_num;          // Добавочный номер телефона
    private String cusInfo_ph_sms;              // Признак(Y), что телефон может использоваться для SMS информирования
    private String cusInfo_em_type;             // Тип адреса
    private String cusInfo_em_email;            // Электронный адрес

    public ClientsDop() {
    }

    public String getCusInfo_ph_type() {
        return cusInfo_ph_type;
    }

    public void setCusInfo_ph_type(String cusInfo_ph_type) {
        this.cusInfo_ph_type = cusInfo_ph_type;
    }

    public String getCusInfo_ph_cnt() {
        return cusInfo_ph_cnt;
    }

    public void setCusInfo_ph_cnt(String cusInfo_ph_cnt) {
        this.cusInfo_ph_cnt = cusInfo_ph_cnt;
    }

    public String getCusInfo_ph_city() {
        return cusInfo_ph_city;
    }

    public void setCusInfo_ph_city(String cusInfo_ph_city) {
        this.cusInfo_ph_city = cusInfo_ph_city;
    }

    public String getCusInfo_ph_num() {
        return cusInfo_ph_num;
    }

    public void setCusInfo_ph_num(String cusInfo_ph_num) {
        this.cusInfo_ph_num = cusInfo_ph_num;
    }

    public String getCusInfo_ph_ext_num() {
        return cusInfo_ph_ext_num;
    }

    public void setCusInfo_ph_ext_num(String cusInfo_ph_ext_num) {
        this.cusInfo_ph_ext_num = cusInfo_ph_ext_num;
    }

    public String getCusInfo_ph_sms() {
        return cusInfo_ph_sms;
    }

    public void setCusInfo_ph_sms(String cusInfo_ph_sms) {
        this.cusInfo_ph_sms = cusInfo_ph_sms;
    }

    public String getCusInfo_em_type() {
        return cusInfo_em_type;
    }

    public void setCusInfo_em_type(String cusInfo_em_type) {
        this.cusInfo_em_type = cusInfo_em_type;
    }

    public String getCusInfo_em_email() {
        return cusInfo_em_email;
    }

    public void setCusInfo_em_email(String cusInfo_em_email) {
        this.cusInfo_em_email = cusInfo_em_email;
    }
}
