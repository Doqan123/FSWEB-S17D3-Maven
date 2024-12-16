package com.workintech.zoo.exceptions;


import lombok.NoArgsConstructor;

import java.util.Objects;
@NoArgsConstructor
public class ZooErrorResponse {
    private Integer status;
    private String message;
    private Long timestamp;

    public ZooErrorResponse(Integer status, String message, Long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ZooErrorResponse that = (ZooErrorResponse) o;
        return Objects.equals(status, that.status) && Objects.equals(message, that.message) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, timestamp);
    }
}
