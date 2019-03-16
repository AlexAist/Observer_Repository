package com.epam.first.query;

import com.epam.first.entity.AbstractEntity;
import com.epam.first.exception.BasicException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SearchID implements Specification {

    private long entityID;
    private static final Logger LOG = LogManager.getLogger();

    public SearchID() {
    }

    public SearchID(long entityID) {
        this.entityID = entityID;
    }

    public long getEntityID() {
        return entityID;
    }

    public void setEntityID(long entityID) {
        if (entityID > 0) {
            this.entityID = entityID;
        } else {
            LOG.log(Level.ERROR, "Invalid ID");
        }
    }

    @Override
    public boolean search(AbstractEntity entity) throws BasicException {
        if (entity == null) {
            throw new BasicException("Object is null!");
        }
        return entity.getEntityId() == entityID;
    }
}
