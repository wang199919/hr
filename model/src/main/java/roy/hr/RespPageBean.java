package roy.hr;

import java.util.List;

/**
 * @author: roy
 * @date: 2023/7/20 19:11
 * @description:
 */
public class RespPageBean {
    private Long total;
    private List<?> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
