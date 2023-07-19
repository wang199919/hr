package roy.hr;

import java.util.Date;

/**
 * @author: roy
 * @date: 2023/7/18 15:42
 * @description:
 */
public class Position {
    private Integer id;

    /**
    * 职位
    */
    private String name;

    private Date createdate;

    private Boolean enabled;

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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}