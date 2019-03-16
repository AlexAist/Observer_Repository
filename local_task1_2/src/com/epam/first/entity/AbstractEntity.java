package com.epam.first.entity;

public abstract class AbstractEntity {

    private long entityId;

    AbstractEntity() {
    }

    AbstractEntity(long entityId) {
        this.entityId = entityId;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }
}
