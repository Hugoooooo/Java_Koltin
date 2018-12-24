package com.hugo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public  void BMITest(){
        Person person  = new Person(79,1.83f);
        Assertions.assertEquals(23.589834f,person.BMI());
    }
}
