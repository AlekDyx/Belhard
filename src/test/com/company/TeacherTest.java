package test.com.company;

import com.company.model.Address;
import com.company.model.Teacher;
import org.junit.*;

import static org.junit.Assert.*;


public class TeacherTest {

    Teacher teacher;

    @Before
    public void setUp() throws Exception {
        Address address3 = new Address("Минск", "Машерова", 11, 30);
        teacher = new Teacher("Учитель", "Первый", 198, address3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void displayPay() {
        int amount = 10;
        int hour = 140;

        int salary = amount * hour;
        int realSalary = teacher.displayPay();

        assertEquals(salary, realSalary);
        assertTrue(salary == realSalary);
    }

    @Test
    public void setAgeWithZero() {
        int age = 0;

        teacher.setAge(age);

        assertTrue(teacher.getAge() == 198);

    }
}