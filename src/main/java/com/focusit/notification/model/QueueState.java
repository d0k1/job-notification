package com.focusit.notification.model;

/**
 * Created by doki on 14.10.17.
 */
public class QueueState {
    private String type="QueueState";
    private Long queueId;
//    private String name;
    private Integer buildId;
    private String buildName;
    private Long timestamp;
    private String state;
    private Integer queueLength;
    private Integer waitingLength;
    private Integer blockedLength;
    private Integer buildableLength;

    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public Integer getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(Integer queueLength) {
        this.queueLength = queueLength;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWaitingLength() {
        return waitingLength;
    }

    public void setWaitingLength(Integer waitingLength) {
        this.waitingLength = waitingLength;
    }

    public Integer getBlockedLength() {
        return blockedLength;
    }

    public void setBlockedLength(Integer blockedLength) {
        this.blockedLength = blockedLength;
    }

    public Integer getBuildableLength() {
        return buildableLength;
    }

    public void setBuildableLength(Integer buildableLength) {
        this.buildableLength = buildableLength;
    }
}
