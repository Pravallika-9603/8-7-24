package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import com.neoteric.javatdd.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentFormTest {
    @Test
    public void test(){
        Address address=new Address();
        address.area="hyd";
        address.pincode="54564";
        address.platNo="1-33";
        Student s=new Student();
        s.age=6;
        s.name="churi";
        s.address=address;
        s.standard="I";
        StudentService service=new StudentService();
        Admission admission=service.getAdmission(s);
        Assertions.assertEquals(1000,admission.fee);
        Assertions.assertNotNull(admission.rollNo);

    }
}
