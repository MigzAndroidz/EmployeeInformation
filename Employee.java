import java.util.Scanner;
public class Main{

    
    
    public static void main(String[] args) {
        Main main = new Main ();
            main.start();
    }
      public void start(){
            Scanner scanner = new Scanner(System.in);
            
            int counter = 0;
            Employee[] employees = new Employee[6];
            while(counter < 6){
               System.out.print("Enter Employee Name #" + (counter + 1) + ": " );
            String name = scanner.nextLine();
            System.out.print("Enter Employee Age #" + (counter + 1) + ": " );
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee Position #" + (counter + 1) + ": " );
            String position = scanner.nextLine();
            System.out.print("Enter Employee Salary #" + (counter + 1) + ": " );
            double salary = scanner.nextDouble();
            scanner.nextLine();
            
            Employee employee = new Employee(name, age, position, salary);
            employees[counter] = employee;
            counter++;
            }
            
            counter = 0;
        while(counter < 6){
            employees[counter].getEmployee();
            System.out.println("");
            counter++;
        }
      }
      
      public class Employee {
          private String name;
        private int age;
        private String position;
        private double salary;
        
        public Employee(String name, int age, String position, double salary){
                this.name = name;
            this.age = age;
            this.position = position;
            this.salary = salary;
        }
        
        public double salaryComputation(double salary){
            return salary * .12;
        }
          public void getEmployee(){
              System.out.print("Employee Information: " + "\nName: " + name + "\nAge:" + age + "\nPosition: " + position + "\nSalary" + salaryComputation(salary));
                
          }
      }
}

