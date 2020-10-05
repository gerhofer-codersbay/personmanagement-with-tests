import java.time.LocalDate;

public class Person {

    public String firstName;
    public String lastName;
    public LocalDate birthday;
    public Gender gender;

    public Person(String firstName, String lastName, LocalDate birthday, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
    }
}
