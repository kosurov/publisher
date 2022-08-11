package com.github.kosurov.publisher.models;

public class Message {

    private int msisdn;
    private String action;
    private long timestamp;

    public Message() {

    }

    public Message(int msisdn, String action, long timestamp) {
        this.msisdn = msisdn;
        this.action = action;
        this.timestamp = timestamp;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{" +
                "\"msisdn\":" + msisdn +
                ",\"action\":\"" + action + '\"' +
                ",\"timestamp\":" + timestamp +
                '}';
    }
}
