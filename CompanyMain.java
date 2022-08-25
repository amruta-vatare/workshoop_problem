import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Group-3 -> Create multiple Companies ->
Create Employees with details(name, age, phoneNumber,city,state, department) ->
Add multiple employees in each Company ->
Also Maintain a dictionary of Company through a Map(key->companyName , value->Company-Object)  ->
 Create 3 classes - Company , Employee and CompanyMain
* */
public class CompanyMain {
    public static Scanner sc ;
    static Map<String, ArrayList<Employee>> companyMap = new HashMap<>();
    public static void main(String[] args) {
        addCompany();
        for(Map.Entry<String,ArrayList<Employee>> set : companyMap.entrySet()){
            System.out.println("Company : "+set.getKey());
            for(Employee employee : set.getValue()){
                System.out.println("Employee_Id : "+employee.getE_Id()+"\t Name : "+employee.getName()+"\t age : "+employee.getAge()+"\t phone_no : "+employee.getPhone_no()+"\t City : "+employee.getCity()+"\t state : "+employee.getState()+"\t department : "+employee.getDepartment());
            }
        }
    }

    private static ArrayList<Employee> addEmployee() {
        sc = new Scanner(System.in);
        System.out.println("Enter how many employee you want to create?");
        int N_employee = sc.nextInt();
        ArrayList<Employee> employees = new ArrayList<>(N_employee);
        for(int i = 0;i<N_employee;i++){
            Employee emp = createEmp(i);
            employees.add(emp);
        }
        return employees;
    }

    private static Employee createEmp(int i) {
        sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the phone-No");
        BigInteger phone_no = sc.nextBigInteger();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the department");
        String department = sc.next();
        Employee emp = new Employee(i,name,age,phone_no,city,state,department);
        return emp;
    }

    private static void addCompany() {
        ArrayList<Employee> employees = new ArrayList<>();
        sc = new Scanner(System.in);
        String name= null;
        System.out.println("Enter how many company you want to create");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.println("Enter the name of company");
            name = sc.next();
            Company c = new Company(i,name);
            employees = addEmployee();
            companyMap.put(c.getName(),employees);
        }
    }
}
