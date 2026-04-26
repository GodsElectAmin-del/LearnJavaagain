package Java_Enum;

public class EnumExample {
    enum grade {
        LOW,
        MEDIUM,
        HIGH,
    }

    public static void main(String[] args) {
        grade myGrade = grade.LOW;

        switch (myGrade) {
            case LOW:
                System.out.println("You have bad grades");
                break;
            case MEDIUM:
                System.out.println("Your Grades are Ok");
            case HIGH:
                System.out.println("Your Grades are realy great");
            default:
                break;
        }
    }

}
