import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HW2SortTest {

    @Test
    void sortEmpContainsAll() {
        RandomEmp testEmp = new RandomEmp(10000);
        RandomEmp Expected=new RandomEmp(testEmp);
        testEmp.SortEmp();
        assertTrue(Expected.getRandomEmployees().containsAll(testEmp.getRandomEmployees()));
    }
    @Test
    void checkIfSortReturnValue() {
        RandomEmp testEmp = new RandomEmp(10000);
        testEmp.SortEmp();
      assertFalse(testEmp == null );

    }
    @Test
    void testIfSortedInOrder() {
        RandomEmp testEmp = new RandomEmp(10000);
        testEmp.SortEmp();
        for (int i = 1; i < testEmp.getAmount(); i++) {
            assertTrue(testEmp.getRandomEmployees().get(i).getSalary() >= testEmp.getRandomEmployees().get(i-1).getSalary());
        }
    }
}