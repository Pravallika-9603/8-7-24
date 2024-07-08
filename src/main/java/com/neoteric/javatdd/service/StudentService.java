package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;

import java.util.UUID;

public class StudentService {

    public Admission getAdmission(Student stu){
        Admission admission=null;
        if(stu.age>5){
            admission=new Admission();
            admission.rollNo="TS"+ UUID.randomUUID().toString();
            admission.fee=1000;
            admission.standard=stu.standard;
        }
        return admission;
    }
}
