package junit_programs;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
Object[] expectedEmps = new Employee[3];

    @Before
    public void setUP() throws Exception{
        expectedEmps[0] = new Employee(1, "Naman", "456");
        expectedEmps[1] = new Employee(2, "Kartik", "123");
        expectedEmps[2] = new Employee(3, "mayank", "866");

    }

    @Test
    public void test()
    {
        Object[] testOutput = Employee.getEmployeeList().toArray();
        assertArrayEquals(expectedEmps, testOutput);
    }
    
}
