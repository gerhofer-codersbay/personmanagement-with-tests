import java.time.LocalDate;
import java.util.ArrayList;

public class PersonManagement {

    public ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(String firstName,
                          String lastName,
                          LocalDate birthday,
                          Gender gender) {
        persons.add(new Person(
                firstName,
                lastName,
                birthday,
                gender
        ));
    }


}
