package me.tianle.login.resp;

public enum RespCode {

    SUCCESS(0, "请求成功"),
    ERROR(-1,"请求失败"),
    WARN(-2, "网络异常，请稍后重试");

    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
