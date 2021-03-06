package HashMapExample;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

/*
 * Example of adding User defined Object.
 */
public class EmployeeHashMapExample
{
    public static void main(String[] args)
    {

        HashMap<Integer, Employee> hashMap = new HashMap<Integer, Employee>();

        /*
         * Key is EmpId - Value is Employee Object
         */

        Employee john = new Employee("John", 32, 40000);
        Employee david = new Employee("David", 42, 80000);
        Employee peter = new Employee("Peter", 52, 150000);

        hashMap.put(20, john);
        hashMap.put(10, david);
        hashMap.put(40, peter);

        System.out.println("hashMap : " + hashMap + "\n");

        Set<Map.Entry<Integer, Employee>> set = hashMap.entrySet();

        System.out.println("set : " + set + "\n");

        System.out.println("-----------------------");
        System.out.println("Key" + " | " + "value");
        System.out.println("-----------------------");

        for (Map.Entry<Integer, Employee> entry : set)
        {
            int empId = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(empId + "   | " + employee);
        }

    }
}