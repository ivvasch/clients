package ru.inversion.clients.xmlData;

import java.time.LocalDate;

public class ClientsHistXML {
    private Long vnedocnum;              // Внешний номер договора
    private Long vnydocnum;              // Внутренний номер договора (уникальный)
    private String type;                 // Тип (Кредит или Кредитная карта)
    private String relation;             // Отношение (заемщик, поручитель, созаемщик)
    private String sum;                  // Сумма/Лимит овердрафта
    private String cur;                  // Валюта кредита:	Следует указывать 3х-значный код: RUB, USD, EUR
    private String prodnum;              // Кредитный продукт  номер
    private String prodname;             // Кредитный продукт наименование
    private String branch;               // Филиал
    private String dlastplatod;          // Дата финального платежа по основному долгу (план)
    private String dlastplatp;           // Дата финального платежа % (план)
    private String platperod;            // Периодичность выплаты основного долга (ежемесячно , и т.п.)
    private String platperp;             // Периодичность выплат %%
    private String grnt;                 // Вид обеспечения - (ВО)
    private String catgrnt;              // Категория вида обеспечения
    // необходимо будет создать класс и заменить в этом классе переменные на список содержащий объект с этими подвидами
    private String subgrnt;              // Подвид - (П) (2 типа ниже входят в него)
     private String name;                 // 1 Наименование
     private String pletype;              // 2 Тип подвида
    // ****************************************************************************************************************
    private LocalDate docdate;           // Дата договора
    private String docstate;             // Статус договора Чеpновик/Условный/Действующий/Завершенный/Заявка (0/1/2/3/4)
    private LocalDate statdate;          // Дата статуса
    private String credint;              // Годовая % ставка по кредиту
    private String acredint;             // Процентная ставка за просроченную задолженность
    private LocalDate lastplatd;         // Дата последнего платежа
    private String platsum;              // Всего выплачено
    private String narrsum;              // Сумма непросроченной задолженности (по основным средствам)
    private String arrsumd;              // Cумма просроченной задолженности по основному долгу
    private String arrsump;              // Сумма просроченной задолженности по процентам
    private String nextplatsum;          // Сумма следующего платежа
    private String intimeplatc;          // Количество своевременных платежей
    private String ovtimeplatc;          // Количество просроченных платежей

    public ClientsHistXML() {
    }

    public Long getVnedocnum() {
        return vnedocnum;
    }

    public void setVnedocnum(Long vnedocnum) {
        this.vnedocnum = vnedocnum;
    }

    public Long getVnydocnum() {
        return vnydocnum;
    }

    public void setVnydocnum(Long vnydocnum) {
        this.vnydocnum = vnydocnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getProdnum() {
        return prodnum;
    }

    public void setProdnum(String prodnum) {
        this.prodnum = prodnum;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDlastplatod() {
        return dlastplatod;
    }

    public void setDlastplatod(String dlastplatod) {
        this.dlastplatod = dlastplatod;
    }

    public String getDlastplatp() {
        return dlastplatp;
    }

    public void setDlastplatp(String dlastplatp) {
        this.dlastplatp = dlastplatp;
    }

    public String getPlatperod() {
        return platperod;
    }

    public void setPlatperod(String platperod) {
        this.platperod = platperod;
    }

    public String getPlatperp() {
        return platperp;
    }

    public void setPlatperp(String platperp) {
        this.platperp = platperp;
    }

    public String getGrnt() {
        return grnt;
    }

    public void setGrnt(String grnt) {
        this.grnt = grnt;
    }

    public String getCatgrnt() {
        return catgrnt;
    }

    public void setCatgrnt(String catgrnt) {
        this.catgrnt = catgrnt;
    }

    public String getSubgrnt() {
        return subgrnt;
    }

    public void setSubgrnt(String subgrnt) {
        this.subgrnt = subgrnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPletype() {
        return pletype;
    }

    public void setPletype(String pletype) {
        this.pletype = pletype;
    }

    public LocalDate getDocdate() {
        return docdate;
    }

    public void setDocdate(LocalDate docdate) {
        this.docdate = docdate;
    }

    public String getDocstate() {
        return docstate;
    }

    public void setDocstate(String docstate) {
        this.docstate = docstate;
    }

    public LocalDate getStatdate() {
        return statdate;
    }

    public void setStatdate(LocalDate statdate) {
        this.statdate = statdate;
    }

    public String getCredint() {
        return credint;
    }

    public void setCredint(String credint) {
        this.credint = credint;
    }

    public String getAcredint() {
        return acredint;
    }

    public void setAcredint(String acredint) {
        this.acredint = acredint;
    }

    public LocalDate getLastplatd() {
        return lastplatd;
    }

    public void setLastplatd(LocalDate lastplatd) {
        this.lastplatd = lastplatd;
    }

    public String getPlatsum() {
        return platsum;
    }

    public void setPlatsum(String platsum) {
        this.platsum = platsum;
    }

    public String getNarrsum() {
        return narrsum;
    }

    public void setNarrsum(String narrsum) {
        this.narrsum = narrsum;
    }

    public String getArrsumd() {
        return arrsumd;
    }

    public void setArrsumd(String arrsumd) {
        this.arrsumd = arrsumd;
    }

    public String getArrsump() {
        return arrsump;
    }

    public void setArrsump(String arrsump) {
        this.arrsump = arrsump;
    }

    public String getNextplatsum() {
        return nextplatsum;
    }

    public void setNextplatsum(String nextplatsum) {
        this.nextplatsum = nextplatsum;
    }

    public String getIntimeplatc() {
        return intimeplatc;
    }

    public void setIntimeplatc(String intimeplatc) {
        this.intimeplatc = intimeplatc;
    }

    public String getOvtimeplatc() {
        return ovtimeplatc;
    }

    public void setOvtimeplatc(String ovtimeplatc) {
        this.ovtimeplatc = ovtimeplatc;
    }
}
