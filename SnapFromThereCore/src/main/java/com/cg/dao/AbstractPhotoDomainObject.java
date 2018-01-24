package com.cg.dao;

import java.util.Date;

public abstract class AbstractPhotoDomainObject {
    private String userId;
    private java.util.Date createdAt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
