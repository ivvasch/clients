package ru.inversion.clients.mainData;

public class Ph {
    private String type;             // Тип: (0-телефон, 1-факс и т.п.)
    private String cnt;              // Телефонный код страны
    private String city;             // Код города
    private Long num;              // Номер телефона
    private String ext_num;          // Добавочный номер телефона
    private String sms;              // Признак(Y), что телефон может использоваться для SMS информирования

    public Ph() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getExt_num() {
        return ext_num;
    }

    public void setExt_num(String ext_num) {
        this.ext_num = ext_num;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }
}
