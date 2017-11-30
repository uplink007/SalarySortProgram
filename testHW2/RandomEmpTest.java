import org.junit.jupiter.api.Test;

import java.io.Console;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RandomEmpTest {
    RandomEmp testVar=new RandomEmp(10000);
    @Test
    void getAmount() {
        assertEquals(10000,testVar.getAmount());

    }

    @Test
    void testSalaries() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            assertTrue(temp.getSalary()<=15000&&temp.getSalary()>=3000);
        }
    }
    @Test
    void testIDs() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            String tempString = temp.getID();
            assertTrue(tempString.length() == 9);
            for (int j = 0; j < 9; j++) {
                assertTrue(tempString.charAt(j) <= '9' && tempString.charAt(j) >= '0');
            }
        }
    }
    @Test
    void testAddress() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            String tempString = temp.getAddress();
            for (int j = 0; j < tempString.length(); j++)
                assertTrue(tempString.charAt(j) <= 'Z' && tempString.charAt(j) >= 'A'
                        || tempString.charAt(j) <= 'z' && tempString.charAt(j) >= 'a'
                        || tempString.charAt(j) == '-'
                        || tempString.charAt(j) == ' ');
        }
    }
    @Test
    void testEmails() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            String tempString = temp.getEmail();
            for (int j = 0; j < tempString.length(); j++) {
                assertTrue(tempString.charAt(j) <= 'Z' && tempString.charAt(j) >= 'A'
                        || tempString.charAt(j) <= 'z' && tempString.charAt(j) >= 'a'
                        || tempString.charAt(j) == '-'
                        || tempString.charAt(j) == '@'
                        ||tempString.charAt(j) == '.');
            }
        }
    }
    @Test
    void testNames() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            String tempString = temp.getName();
            for (int j = 0; j < tempString.length(); j++) {
                assertTrue(tempString.charAt(j) <= 'Z' && tempString.charAt(j) >= 'A' && j == 0
                        || tempString.charAt(j) <= 'z' && tempString.charAt(j) >= 'a' && j > 0
                        || tempString.charAt(j) == '-' && j > 0);
            }
        }
    }
    @Test
    void testLastNames() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            String tempString = temp.getLastName();
            for (int j = 0; j < tempString.length(); j++) {
                assertTrue(tempString.charAt(j) <= 'Z' && tempString.charAt(j) >= 'A' && j == 0
                        || tempString.charAt(j) <= 'z' && tempString.charAt(j) >= 'a' && j > 0
                        || tempString.charAt(j) == '-' && j > 0);
            }
        }
    }
    @Test
    void testPhoneNumbers() {
        for (int i =0;i<testVar.getAmount();i++) {
            Employee temp = testVar.getRandomEmployees().get(i);
            String tempString = temp.getPhone();
            assertTrue(tempString.length() == 10);
            for (int j = 0; j < 9; j++) {
                assertTrue(tempString.charAt(j) <= '9' && tempString.charAt(j) >= '0');
            }
        }
    }
}