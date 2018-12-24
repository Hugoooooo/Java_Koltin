package com.hugo.kotlin

import com.hugo.Human
import com.hugo.student.StudentKTT
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun HumanTest() {
        val human = Human("HUGO", 79f, 1.83f);
        Assertions.assertEquals(79f / (1.83f * 1.83f), human.bmi());
    }

    @Test
    fun HighScoreTest(){
        var student = StudentKTT("HUGO",99f,22f);
        Assertions.assertEquals(99f,student.HighScore());
    }

    @Test
    fun PrintTest(){
        var student = StudentKTT("HUGO",99f,22f);
        Assertions.assertEquals("C",student.Grade());
    }
}