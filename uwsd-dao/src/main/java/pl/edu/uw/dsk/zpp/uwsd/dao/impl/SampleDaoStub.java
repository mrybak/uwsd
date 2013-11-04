package pl.edu.uw.dsk.zpp.uwsd.dao.impl;

import pl.edu.uw.dsk.zpp.uwsd.bean.SampleEntity;
import pl.edu.uw.dsk.zpp.uwsd.dao.SampleDao;

public class SampleDaoStub implements SampleDao {

    @Override
    public SampleEntity getSampleEntity() {
        SampleEntity entity = new SampleEntity();
        entity.setSomeString("this object is fake, beware!");

        return entity;
    }
}
