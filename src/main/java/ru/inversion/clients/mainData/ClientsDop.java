package ru.inversion.clients.mainData;

public class ClientsDop {
    private Long icusnum;               // Идентификатор клиента
    private String cusinfo_phType;      // Тип: (0-телефон, 1-факс и т.п.)
    private String ph_cnt;              // Телефонный код страны
    private String ph_city;             // Код города
    private String ph_num;              // Номер телефона
    private String ph_ext_num;          // Добавочный номер телефона
    private String ph_sms;              // Признак(Y), что телефон может использоваться для SMS информирования
    private String em_type;             // Тип адреса
    private String em_email;            // Электронный адрес

    public ClientsDop() {
    }

    public String getCusinfo_phType() {
        return cusinfo_phType;
    }

    public void setCusinfo_phType(String cusinfo_phType) {
        this.cusinfo_phType = cusinfo_phType;
    }

    public String getPh_cnt() {
        return ph_cnt;
    }

    public void setPh_cnt(String ph_cnt) {
        this.ph_cnt = ph_cnt;
    }

    public String getPh_city() {
        return ph_city;
    }

    public void setPh_city(String ph_city) {
        this.ph_city = ph_city;
    }

    public String getPh_num() {
        return ph_num;
    }

    public void setPh_num(String ph_num) {
        this.ph_num = ph_num;
    }

    public String getPh_ext_num() {
        return ph_ext_num;
    }

    public void setPh_ext_num(String ph_ext_num) {
        this.ph_ext_num = ph_ext_num;
    }

    public String getPh_sms() {
        return ph_sms;
    }

    public void setPh_sms(String ph_sms) {
        this.ph_sms = ph_sms;
    }

    public String getEm_type() {
        return em_type;
    }

    public void setEm_type(String em_type) {
        this.em_type = em_type;
    }

    public String getEm_email() {
        return em_email;
    }

    public void setEm_email(String em_email) {
        this.em_email = em_email;
    }
}
