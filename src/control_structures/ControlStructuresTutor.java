package control_structures;

public class ControlStructuresTutor {
    public static void main(String[] args) {
        int currentDay = 3;
        switch (currentDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Not a weekday!");
        }

        String msg = switch(currentDay) {
            case 1,2,3,4,5 -> "a weekday";
            default -> "not a weekday!";
        };
        System.out.println(msg);


    }
}
