package com.seatrend.xj.electricbicyclesalesystem.entity;

/**
 * Created by seatrend on 2018/8/21.
 */

public class BaseEntity {
    private boolean status;
    private int code;
    private String message;

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
