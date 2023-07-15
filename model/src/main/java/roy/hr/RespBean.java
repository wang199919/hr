package roy.hr;

/**
 * @author: roy
 * @date: 2023/7/15 22:33
 * @description:
 */
public class RespBean {
    private  int status;
    private  String msg;
    private  Object object;

    private RespBean(int status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public  static  RespBean success(int status ,String msg){
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
}
