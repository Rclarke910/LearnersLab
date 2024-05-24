import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    //public Person person1;

//    @BeforeEach
//    public void setUp(){
//        person1 = new Person(2, "Bob");
//    }

   @Test
   @DisplayName("NameTest")
   public void testNameConstructor(){
        Person  person1 = new Person(2, "Bob");
      assertEquals("Bob",person1.getName());
    }

    @Test
    public void testIdConstructor(){
        Person  person1 = new Person(2, "Bob");
        assertEquals(2,person1.getId());
    }

    @Test
    public void testSetName(){
        Person  person1 = new Person(2, "Bob");
        person1.setName("Rashawn");
        assertEquals("Rashawn",person1.getName());
    }


}