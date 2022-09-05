import model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void studentTestIsEqual() {
        // GIVEN
        Student person1 = new Student("Gugi", 16, 178);
        Student person2 = new Student("Sonja", 32, 168);

        // WHEN
        boolean actual = person1.equals(person2);

        // THEN
        assertEquals(false, actual);
    }
}
