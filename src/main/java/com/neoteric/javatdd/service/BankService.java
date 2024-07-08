package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.BankTemplate;
import com.neoteric.javatdd.model.AccountCreation;

import java.util.UUID;

public class BankService {
    public AccountCreation accountCreation(BankTemplate person){
        AccountCreation acc=null;
        acc=new AccountCreation();
        if(person.age>18){
            acc.acNo= UUID.randomUUID().toString();
        }
        return acc;
    }
}
