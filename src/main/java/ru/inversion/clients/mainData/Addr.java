package ru.inversion.clients.mainData;

public class Addr {

    private String type;            // Тип адреса: 0-регистрации; 1-почтовый; 2-фактический.
    private String country;         // Cтрана
    private String reg_num;         // Номер региона
    private String area;            // Район
    private String area_type;       // Тип района
    private String city;            // Город
    private String city_type;       // Тип города
    private String punkt_name;      // Нас. пункт
    private String punkt_type;      // Тип НП
    private String infr_name;       // Инфраструктура
    private String infr_type;       // Тип инфраструктуры
    private String dom;             // Дом
    private String korp;            // Корпус
    private String kv;              // Квартира
    private String post_index;      // Почтовый индекс
    private String porch;           // Подъезд
    private String oksm_code;       // Код ОКСМ территории
    private String code;            // Код адреса по КЛАДР/ФИАС
    private String stroy;           // Строение

    public Addr() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReg_num() {
        return reg_num;
    }

    public void setReg_num(String reg_num) {
        this.reg_num = reg_num;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_type() {
        return city_type;
    }

    public void setCity_type(String city_type) {
        this.city_type = city_type;
    }

    public String getPunkt_name() {
        return punkt_name;
    }

    public void setPunkt_name(String punkt_name) {
        this.punkt_name = punkt_name;
    }

    public String getPunkt_type() {
        return punkt_type;
    }

    public void setPunkt_type(String punkt_type) {
        this.punkt_type = punkt_type;
    }

    public String getInfr_name() {
        return infr_name;
    }

    public void setInfr_name(String infr_name) {
        this.infr_name = infr_name;
    }

    public String getInfr_type() {
        return infr_type;
    }

    public void setInfr_type(String infr_type) {
        this.infr_type = infr_type;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getKorp() {
        return korp;
    }

    public void setKorp(String korp) {
        this.korp = korp;
    }

    public String getKv() {
        return kv;
    }

    public void setKv(String kv) {
        this.kv = kv;
    }

    public String getPost_index() {
        return post_index;
    }

    public void setPost_index(String post_index) {
        this.post_index = post_index;
    }

    public String getPorch() {
        return porch;
    }

    public void setPorch(String porch) {
        this.porch = porch;
    }

    public String getOksm_code() {
        return oksm_code;
    }

    public void setOksm_code(String oksm_code) {
        this.oksm_code = oksm_code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStroy() {
        return stroy;
    }

    public void setStroy(String stroy) {
        this.stroy = stroy;
    }
}
