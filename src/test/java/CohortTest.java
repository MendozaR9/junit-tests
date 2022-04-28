import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class CohortTest {
    Cohort test = new Cohort();
    @Before
    public void setup(){
        Student student1 = new Student(1, "joe");
        student1.addGrade(90);
        student1.addGrade(90);
        student1.addGrade(80);
        Student student2 = new Student(2, "will");
        student2.addGrade(87);
        student2.addGrade(77);
        student2.addGrade(97);
        test.addStudent(student1);
        test.addStudent(student2);
    }
    @Test
    public void addToListOfStudents(){
        Cohort fortan = new Cohort();
        Student student1 = new Student(1,"ryan");
        fortan.addStudent(student1);
        assertEquals("ryan", fortan.getStudents().get(0).getName());
    }

    @Test
    public void getList(){
        System.out.println(test.getStudents().get(0).getName());
}

@Test
    public void getCohortAverage(){
        assertEquals(86.6, test.getStudents().get(0).getGradeAverage(),0.1);
    assertEquals(87.0, test.getStudents().get(1).getGradeAverage(),0.1);
    assertEquals(86.8, test.getCohortAverage(), 0.5);
}
}

