package com.hugo;

import com.hugo.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void AverageTest() {
        Student student = new Student("Hugo", 60, 90);
        Assertions.assertEquals(75,student.Average());
    }
    public  void HighScoreTest(){
        Student student = new Student("Hugo", 60, 90);
        Assertions.assertEquals(70,student.HighScore());
    }
}
