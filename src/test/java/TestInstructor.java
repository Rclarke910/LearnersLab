import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(2,"Bob");
        assertInstanceOf(Teacher.class, instructor);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(2,"Bob");
        assertInstanceOf(Person.class, instructor);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(2,"Bob");
        Student student = new Student(1, "Shawn");

        instructor.teach(student,5.0);

        double result = student.getTotalStudyTime();

        assertEquals(5.0,result);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(2,"Bob");
        Student student = new Student(1, "Shawn");

        Student[] students = {student};

        instructor.lecture(students,5.0);

        double result = 0;
        for(Student stu : students){
             result += stu.getTotalStudyTime();
        }

        assertEquals(5.0,result);
    }

}