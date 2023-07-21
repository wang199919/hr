package roy.hr;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: roy
 * @date: 2023/7/15 22:33
 * @description:
 */
@NoArgsConstructor
public class RespBean {
    private  int status;
    private  String msg;
    private  Object object;

    private RespBean(int status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public RespBean setObj(Object obj) {
        this.object = obj;
        return this;
    }

    public  static  RespBean success(int status , String msg){
        return  new RespBean(status,msg,null);
    }
    public  static  RespBean success(int status, String msg,Object data){
        return  new RespBean(status,msg,data);
    }
    public  static  RespBean failure(int status ,String msg){
        return  new RespBean(status,msg,null);
    }
    public static  RespBean failure(int status,String msg,Object data){
        return  new RespBean(status,msg,data);
    }

    public static RespBean build() {
        return new RespBean();
    }
}
