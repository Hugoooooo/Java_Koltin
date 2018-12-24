package com.hugo.kotlin

import com.hugo.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest{
    @Test
    fun BMITest(){
        val person = Person("Hugo",78f,1.83f);
        Assertions.assertEquals(78f/(1.83f*1.83f),person.BMI())
    }


}

