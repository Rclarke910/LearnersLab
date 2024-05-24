import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentsTest {
    @Test
    public void testSingleton() {
        Students students = Students.getInstance();
        assert students.count() == 3 : "Students singleton should contain 3 students";
    }

}