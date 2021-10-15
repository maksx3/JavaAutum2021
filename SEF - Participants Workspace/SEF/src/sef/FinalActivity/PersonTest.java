package sef.FinalActivity;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {

    @Test
    public void testPersonConstructor() {
        Person person = new Person();
        assertEquals("Error in Person constructor", "Unknown", person.getFirstName());
    }

    @Test
    public void testPersonConstructor2() {
        Person person = new Person("Maxim", 21);
        assertEquals("Error in Person constructor, field Age", 21, person.getAge());
        assertEquals("Error in Person constructor, field FirstName", "Maxim", person.getFirstName());
    }

    @Test
    public void testPersonIntroduce() {
        Person person = new Person("Maxim", 21);
        String intro = "My name is Maxim and I am 21 years old";
        assertEquals("Error in Person constructor, field Introduce", intro, person.introduce());
    }
}
