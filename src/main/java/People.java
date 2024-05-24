import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    public People() {
    }

    public List<Person> getPersonList() {
        return personList;
    }

    private List<Person> personList = new ArrayList<>();
    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id) {

        Person person = null;

        for(Person per : personList){
        if(per.getId() == id){
            person = per;
        }
        }
        return person;
    }

    public boolean contains(Person person){
        return this.personList.contains(person);
    }

    public void remove(Person person){
        this.personList.remove(person);
    }

    public void removeById(long id){
        for(Person pers : personList){
            if(pers.getId() == id){
                personList.remove(pers);
            }
        }
    }

    public void removeAll(){
        this.personList.clear();
    }

    public int count(){
        return this.personList.size();
    }

    public Object[] toArray(){
        return this.personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return this.personList.iterator();
    }










}
