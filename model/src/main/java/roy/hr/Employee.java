package roy.hr;

import java.util.Date;

/**
 * @author: roy
 * @date: 2023/7/19 23:00
 * @description:
 */
public class Employee {
    /**
     * 员工编号
     */
    private Integer id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 婚姻状况
     */
    private Object wedlock;

    /**
     * 民族
     */
    private Integer nationid;

    /**
     * 籍贯
     */
    private String nativeplace;

    /**
     * 政治面貌
     */
    private Integer politicid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 所属部门
     */
    private Integer departmentid;

    /**
     * 职称ID
     */
    private Integer joblevelid;

    /**
     * 职位ID
     */
    private Integer posid;

    /**
     * 聘用形式
     */
    private String engageform;

    /**
     * 最高学历
     */
    private Object tiptopdegree;

    /**
     * 所属专业
     */
    private String specialty;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 入职日期
     */
    private Date begindate;

    /**
     * 在职状态
     */
    private Object workstate;

    /**
     * 工号
     */
    private String workid;

    /**
     * 合同期限
     */
    private Double contractterm;

    /**
     * 转正日期
     */
    private Date conversiontime;

    /**
     * 离职日期
     */
    private Date notworkdate;

    /**
     * 合同起始日期
     */
    private Date begincontract;

    /**
     * 合同终止日期
     */
    private Date endcontract;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", idcard='" + idcard + '\'' +
                ", wedlock=" + wedlock +
                ", nationid=" + nationid +
                ", nativeplace='" + nativeplace + '\'' +
                ", politicid=" + politicid +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", departmentid=" + departmentid +
                ", joblevelid=" + joblevelid +
                ", posid=" + posid +
                ", engageform='" + engageform + '\'' +
                ", tiptopdegree=" + tiptopdegree +
                ", specialty='" + specialty + '\'' +
                ", school='" + school + '\'' +
                ", begindate=" + begindate +
                ", workstate=" + workstate +
                ", workid='" + workid + '\'' +
                ", contractterm=" + contractterm +
                ", conversiontime=" + conversiontime +
                ", notworkdate=" + notworkdate +
                ", begincontract=" + begincontract +
                ", endcontract=" + endcontract +
                ", workage=" + workage +
                ", workAge=" + workAge +
                ", nation=" + nation +
                ", politicsstatus=" + politicsstatus +
                ", department=" + department +
                ", jobLevel=" + jobLevel +
                ", position=" + position +
                '}';
    }

    /**
     * 工龄
     */
    private Integer workage;

    private Integer workAge;
    private Nation nation;
    private Politicsstatus politicsstatus;
    private Department department;
    private Joblevel jobLevel;
    private Position position;
    private Salary salary;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Object getWedlock() {
        return wedlock;
    }

    public void setWedlock(Object wedlock) {
        this.wedlock = wedlock;
    }

    public Integer getNationid() {
        return nationid;
    }

    public void setNationid(Integer nationid) {
        this.nationid = nationid;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public Integer getPoliticid() {
        return politicid;
    }

    public void setPoliticid(Integer politicid) {
        this.politicid = politicid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getJoblevelid() {
        return joblevelid;
    }

    public void setJoblevelid(Integer joblevelid) {
        this.joblevelid = joblevelid;
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public String getEngageform() {
        return engageform;
    }

    public void setEngageform(String engageform) {
        this.engageform = engageform;
    }

    public Object getTiptopdegree() {
        return tiptopdegree;
    }

    public void setTiptopdegree(Object tiptopdegree) {
        this.tiptopdegree = tiptopdegree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Object getWorkstate() {
        return workstate;
    }

    public void setWorkstate(Object workstate) {
        this.workstate = workstate;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public Double getContractterm() {
        return contractterm;
    }

    public void setContractterm(Double contractterm) {
        this.contractterm = contractterm;
    }

    public Date getConversiontime() {
        return conversiontime;
    }

    public void setConversiontime(Date conversiontime) {
        this.conversiontime = conversiontime;
    }

    public Date getNotworkdate() {
        return notworkdate;
    }

    public void setNotworkdate(Date notworkdate) {
        this.notworkdate = notworkdate;
    }

    public Date getBegincontract() {
        return begincontract;
    }

    public void setBegincontract(Date begincontract) {
        this.begincontract = begincontract;
    }

    public Date getEndcontract() {
        return endcontract;
    }

    public void setEndcontract(Date endcontract) {
        this.endcontract = endcontract;
    }

    public Integer getWorkage() {
        return workage;
    }

    public void setWorkage(Integer workage) {
        this.workage = workage;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Politicsstatus getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(Politicsstatus politicsstatus) {
        this.politicsstatus = politicsstatus;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Joblevel getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(Joblevel jobLevel) {
        this.jobLevel = jobLevel;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}