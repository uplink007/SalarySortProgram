import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee myEmp= new Employee(
            "123456789",
            "Sergey",
            "Shevchuk",
            "sergesh@ac.sce.ac.il",
            "0543373252",
            "Beer-Sheba",
            3000);
    @Test
    void getID() {
        assertEquals("123456789",myEmp.getID());
    }

    @Test
    void getName() {
        assertEquals("Sergey",myEmp.getName());
    }

    @Test
    void getLastName() {
        assertEquals("Shevchuk",myEmp.getLastName());
    }

    @Test
    void getEmail() {
        assertEquals("sergesh@ac.sce.ac.il",myEmp.getEmail());
    }

    @Test
    void getPhone() {
        assertEquals("0543373252",myEmp.getPhone());
    }

    @Test
    void getAddress() {
        assertEquals("Beer-Sheba",myEmp.getAddress());
    }

    @Test
    void getSalary() {
        assertEquals(3000,myEmp.getSalary());
    }

}