package roy.hr;

import java.util.Date;

/**
 * @author: roy
 * @date: 2023/7/19 22:32
 * @description:
 */
public class MailSendLog {
    private String msgid;

    private Integer empid;

    /**
    * 0发送中，1发送成功，2发送失败
    */
    private Integer status;

    private String routekey;

    private String exchange;

    /**
    * 重试次数
    */
    private Integer count;

    /**
    * 第一次重试时间
    */
    private Date trytime;

    private Date createtime;

    private Date updatetime;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoutekey() {
        return routekey;
    }

    public void setRoutekey(String routekey) {
        this.routekey = routekey;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getTrytime() {
        return trytime;
    }

    public void setTrytime(Date trytime) {
        this.trytime = trytime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}