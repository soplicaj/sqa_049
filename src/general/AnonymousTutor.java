package general;

public class AnonymousTutor {
    public static void main(String[] args) {
        Employee e1 = new Employee(1000,2);
        Employee e2 = new Employee(2000,7);
        Employee ceo = new Employee(2000,1){
            @Override
            public double calculateSalary(){ return 5000; }
        };

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
        System.out.println(ceo.calculateSalary());
    }
}
