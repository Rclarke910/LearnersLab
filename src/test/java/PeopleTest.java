import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PeopleTest {

    @Test
    public void testAdd(){
        Person person = new Person(1,"Bob");
        People people = new People();

        people.add(person);

        assertEquals(1,people.count());
        assertTrue(people.contains(person));
    }


    @Test
    public void testRemove() {
        Person person = new Person(1L, "Bob");
        People people = new People();

        people.add(person);
        people.remove(person);

        assertFalse(people.contains(person));
    }

    @Test
    public void testFindById() {
        People people = new People();
        Person person = new Person(1L, "John Doe");
        people.add(person);
        Person foundPerson = people.findById(1L);
        assert foundPerson != null && foundPerson.getId() == 1L : "Person with ID 1 should be found";
    }



}