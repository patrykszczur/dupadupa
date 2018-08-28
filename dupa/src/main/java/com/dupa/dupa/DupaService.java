package com.dupa.dupa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DupaService {

    public List generateTargetJSON() {
        String x = "121343";

        List testList = new ArrayList();
        testList.add(x);
        return testList;
    }

    public List generateTargetJSON1() {
        String x = "0000000";

        List testList = new ArrayList();
        testList.add(x);
        return testList;
    }

    public Dao createJSON() {
        Dao dao = new Dao();
        Targeting targeting = new Targeting();

        dao.setTargeting(targeting);
        dao.getTargeting().setList1(generateTargetJSON());
        dao.getTargeting().setList2(generateTargetJSON1());
        return dao;
    }
}
