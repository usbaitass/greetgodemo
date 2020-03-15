package com.usbaitass.greetgo.demotest.service;

import com.usbaitass.greetgo.demotest.dao.DataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    DataDao dataDao;

    @Override
    public String findById(long id) {
        return dataDao.findById(id).getValue();
    }
}
