package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Insurance;
import com.neoteric.javatdd.model.InsuranceTemplate;

import java.util.UUID;

public class InsurancService {
    public Insurance getInsurance(InsuranceTemplate insurance)
    {
        Insurance insurance1=null;
        if (insurance.healthCondition=="Not gud" && insurance.payment>10000)
        {
            insurance1=new Insurance();
            insurance1.policyNo= UUID.randomUUID().toString();
            insurance1.policyHolder=insurance.name;
        }
        return insurance1;
    }

}
