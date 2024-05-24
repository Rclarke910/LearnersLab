import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(1L,"Rashawn");
        assertInstanceOf(Learner.class, student);
    }

    @Test
    public void testInheratence(){
        Student student = new Student(1L,"Rashawn");
        assertInstanceOf(Person.class, student);
    }

    @Test

    public void testLearn(){
        Student student = new Student(1L,"Rashawn");
        student.learn(3.0);

        double result = student.getTotalStudyTime();

        assertEquals(3.0,result);
    }

}