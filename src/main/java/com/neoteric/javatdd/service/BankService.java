package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.BankTemplate;
import com.neoteric.javatdd.model.AccountCreation;
import com.neoteric.javatdd.model.Deposite;

import java.util.UUID;

public class BankService {
    public AccountCreation accountCreation(BankTemplate person){
        AccountCreation acc=null;
        if(person.age>18){
            acc=new AccountCreation();
            acc.acNo= UUID.randomUUID().toString();
            acc.amount=0;
            System.out.println("acNo="+acc.acNo);
        }
        return acc;
    }
    public int depositAmount(BankTemplate person,AccountCreation accNo){
        Deposite deposite;
        if(person.amount>=5000) {
            deposite=new Deposite();
            accNo.amount+= person.amount;
            deposite.balance=accNo.amount;
            deposite.transactionID=UUID.randomUUID().toString();
        }
            return accNo.amount;
        }
    }
