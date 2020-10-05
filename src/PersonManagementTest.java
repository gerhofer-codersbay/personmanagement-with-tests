import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonManagementTest {

    @Test
    public void testEmptyPersonManagement() {
        PersonManagement myPersons = new PersonManagement();
        assertTrue(myPersons.persons.isEmpty());
    }

    @Test
    public void testAddingPersons() {
        PersonManagement myPersons = new PersonManagement();
        myPersons.addPerson("Pia", "Gerhofer", LocalDate.of(1993, 7, 13), Gender.FEMALE);
        assertFalse(myPersons.persons.isEmpty());
        assertEquals(1, myPersons.persons.size());

        myPersons.addPerson("Stephanie", "Gerhofer", LocalDate.of(1997, 8, 15), Gender.FEMALE);
        assertEquals(2, myPersons.persons.size());
        assertEquals("Stephanie", myPersons.persons.get(1).firstName);
        assertEquals("Pia", myPersons.persons.get(0).firstName);

        myPersons.addPerson(null, null, null, null);
    }
}
