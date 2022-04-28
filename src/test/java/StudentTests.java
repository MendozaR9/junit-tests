import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StudentTests {
    private Student student;

    @Before
    public void setup(){
        student = new Student(1, "joe");
        student.addGrades(95);
        student.addGrades(100);
        student.addGrades(90);
    }
    @Test
    public void getId(){
        assertEquals(1,student.getId());
    }

    @Test
    public void getName(){
        assertEquals("joe", student.getName());
    }

    @Test
    public void getGrades(){
        ArrayList<Integer> gradeTest =new ArrayList<>();
        gradeTest.add(95);
        gradeTest.add(100);
        gradeTest.add(90);
        assertEquals(gradeTest, student.getGrades());
    }

    @Test
    public void getGradeAverage(){
        assertEquals(95.0,student.getGradeAverage(),0);
    }
}
