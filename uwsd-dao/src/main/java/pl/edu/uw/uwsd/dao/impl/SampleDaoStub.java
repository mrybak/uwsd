package pl.edu.uw.uwsd.dao.impl;

import pl.edu.uw.uwsd.bean.SampleEntity;
import pl.edu.uw.uwsd.dao.SampleDao;

public class SampleDaoStub implements SampleDao {

    @Override
    public SampleEntity getSampleEntity() {
        SampleEntity entity = new SampleEntity();
        entity.setSomeString("this object is fake, beware!");

        return entity;
    }
}
