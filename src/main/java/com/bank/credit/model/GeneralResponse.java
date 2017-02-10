package com.bank.credit.model;

public class GeneralResponse {
    private boolean success;
    private String message;
    private Object data;
    private Long totalCount;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTotalCount() { return totalCount; }

    public void setTotalCount(Long totalCount) { this.totalCount = totalCount; }

}
