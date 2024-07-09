package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Insurance;
import com.neoteric.javatdd.model.InsuranceTemplate;
import com.neoteric.javatdd.service.InsurancService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsuranceForm {
    @Test
    public void test(){
        InsuranceTemplate reethi=new InsuranceTemplate();
        Address address=new Address();
        address.platNo="1-33";
        address.area="kodad";
        reethi.name="Dhara Reethi";
        reethi.age=60;
        reethi.healthCondition="Not gud";
        reethi.address=address;
        reethi.payment=50000;
        InsurancService ins=new InsurancService();
        Insurance insur=ins.getInsurance(reethi);
        Assertions.assertNotNull(insur.policyNo);

    }
}
