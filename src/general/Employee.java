package general;

public class Employee {
    double salary;
    int experience;

    public Employee(double salary, int experience) {
        this.salary = salary;
        this.experience = experience;
    }

    public double calculateSalary(){
        if(this.experience < 3){
            return this.salary;
        }else{
            return this.salary + 500;
        }
    }
}