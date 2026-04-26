package Java_Enum;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EnumExample {
    enum grade {
        Jit,
        YN,
        BRO,
        UNC,
        OG,
        OLDHEAD,
    }

    public static void main(String[] args) {
        // initiaising the Enum
        grade youIS = grade.Jit;

        // The UserInput part
        LocalDate TimeNow = LocalDate.now();
        Scanner UserAgeInput = new Scanner(System.in);
        System.out.println("What Year were you burn only the Year please?");
        int UserAgePlatzhalter = UserAgeInput.nextInt();
        UserAgeInput.close();
        LocalDate TimeBirthday = LocalDate.of(UserAgePlatzhalter, 1, 1);
        int UserAge = Period.between(TimeBirthday, TimeNow).getYears();

        // Choosing an Enum based on the users Age
        for (int i = 0; i < 1; i++) {
            if (UserAge > 44) {
                youIS = grade.OLDHEAD;
                break;
            } else if (UserAge > 35) {
                youIS = grade.OG;
                break;
            } else if (UserAge > 25) {
                youIS = grade.UNC;
                break;
            } else if (UserAge > 21) {
                youIS = grade.BRO;
                break;
            } else if (UserAge > 17) {
                youIS = grade.YN;
                break;
            } else if (UserAge > 13) {
                youIS = grade.Jit;
                break;
            }
        }
        // choosing output based on the choosen Enum
        switch (youIS) {
            case Jit:
                System.out.println("You are a Jit, delete Tiktok and take school serious");
                break;
            case YN:
                System.out.println(
                        "You is a YN, if your phone sceen time is longer than 2 hors you have a Problem, delete all your Apps and luck the fuck in, also hit the Gym");
                break;
            case BRO:
                System.out.println("Elect is that you, luck the Fuck in");
                break;
            case UNC:
                System.out.println(
                        "You have hit UNC Status, i just assume your screen time is lower than two hours, you spend atleast 30 hours of your week somewhat roductivly and you have been hitting the Gym");
                break;
            case OG:
                System.out.println(
                        "You are not old you are an OG, be proud you are not a Child no more grown as N***** now, already have kids or soon to have some");
                break;
            case OLDHEAD:
                System.out.println("Tuff, who cares you are old deal with it lol");
                break;
            default:
                break;
        }
    }

}
