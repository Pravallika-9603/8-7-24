package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.BankTemplate;
import com.neoteric.javatdd.model.AccountCreation;
import com.neoteric.javatdd.service.BankService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankForm {
    @Test
    public void test(){
        Address address =new Address();
        address.platNo="1-33";
        address.area="kodad";
        BankTemplate kalyani=new BankTemplate();
        kalyani.name="Gandu Kalyani";
        kalyani.address=address;
        kalyani.age=20;
        kalyani.amount=8000;
        kalyani.married="Married and having twins";
        BankService service=new BankService();
        AccountCreation acc=service.accountCreation(kalyani);
        int balance=service.depositAmount(kalyani,acc);
        System.out.println("balance"+balance);
        Assertions.assertNotNull(acc.acNo);
        Assertions.assertNotNull(acc);
    }

}
