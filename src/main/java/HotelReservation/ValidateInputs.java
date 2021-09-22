package HotelReservation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInputs {

    public static boolean Date_Range(String input) {
        String regex = "^[2]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean check_Date_Range(String input) throws MyException {
        try {
            if (!Date_Range(input)) {
                throw new MyException("\nInvalid Data_Range");
            } else {
                System.out.println("\nyou entered valid Data_Range");
            }
            return Date_Range(input);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return Date_Range(input);
    }


    public static boolean date(String input) {
        String regex = "^[0-3]{1}[0-9]{1}[a-zA-Z]{3}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean check_date(String input) {
        try {
            if (!date(input)) {
                throw new MyException("\nInvalid Date");
            } else {
                System.out.println("\nyou entered valid Date");
            }
            return date(input);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return date(input);
    }
}
