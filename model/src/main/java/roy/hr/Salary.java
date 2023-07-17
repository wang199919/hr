package roy.hr;

import java.util.Date;

/**
 * @author: roy
 * @date: 2023/7/17 23:48
 * @description:
 */
public class Salary {
    private Integer id;

    /**
    * 基本工资
    */
    private Integer basicsalary;

    /**
    * 奖金
    */
    private Integer bonus;

    /**
    * 午餐补助
    */
    private Integer lunchsalary;

    /**
    * 交通补助
    */
    private Integer trafficsalary;

    /**
    * 应发工资
    */
    private Integer allsalary;

    /**
    * 养老金基数
    */
    private Integer pensionbase;

    /**
    * 养老金比率
    */
    private Double pensionper;

    /**
    * 启用时间
    */
    private Date createdate;

    /**
    * 医疗基数
    */
    private Integer medicalbase;

    /**
    * 医疗保险比率
    */
    private Double medicalper;

    /**
    * 公积金基数
    */
    private Integer accumulationfundbase;

    /**
    * 公积金比率
    */
    private Double accumulationfundper;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Integer basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getLunchsalary() {
        return lunchsalary;
    }

    public void setLunchsalary(Integer lunchsalary) {
        this.lunchsalary = lunchsalary;
    }

    public Integer getTrafficsalary() {
        return trafficsalary;
    }

    public void setTrafficsalary(Integer trafficsalary) {
        this.trafficsalary = trafficsalary;
    }

    public Integer getAllsalary() {
        return allsalary;
    }

    public void setAllsalary(Integer allsalary) {
        this.allsalary = allsalary;
    }

    public Integer getPensionbase() {
        return pensionbase;
    }

    public void setPensionbase(Integer pensionbase) {
        this.pensionbase = pensionbase;
    }

    public Double getPensionper() {
        return pensionper;
    }

    public void setPensionper(Double pensionper) {
        this.pensionper = pensionper;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getMedicalbase() {
        return medicalbase;
    }

    public void setMedicalbase(Integer medicalbase) {
        this.medicalbase = medicalbase;
    }

    public Double getMedicalper() {
        return medicalper;
    }

    public void setMedicalper(Double medicalper) {
        this.medicalper = medicalper;
    }

    public Integer getAccumulationfundbase() {
        return accumulationfundbase;
    }

    public void setAccumulationfundbase(Integer accumulationfundbase) {
        this.accumulationfundbase = accumulationfundbase;
    }

    public Double getAccumulationfundper() {
        return accumulationfundper;
    }

    public void setAccumulationfundper(Double accumulationfundper) {
        this.accumulationfundper = accumulationfundper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}