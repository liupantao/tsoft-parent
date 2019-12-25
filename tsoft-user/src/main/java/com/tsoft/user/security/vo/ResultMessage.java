package com.tsoft.user.security.vo;



import com.tsoft.user.security.emum.ResultStatusCode;


/**
 * @ClassName ResultMessage
 * @Description: 移动端api接口返回的数据模型
 * @Author liupantao
 * @Date 2019/12/24
 * @Version V1.0
 **/
public class ResultMessage {
    private int code;		//返回的代码，0表示成功，其他表示失败
    private String msg;		//成功或失败时返回的错误信息
    private Object data;	//成功时返回的数据信息
    public ResultMessage(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultMessage(ResultStatusCode resultStatusCode, Object data){
        this(resultStatusCode.getCode(), resultStatusCode.getMsg(), data);
    }

    public ResultMessage(int code, String msg){
        this(code, msg, null);
    }

    public ResultMessage(ResultStatusCode resultStatusCode){
        this(resultStatusCode, null);
    }


    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }


}
