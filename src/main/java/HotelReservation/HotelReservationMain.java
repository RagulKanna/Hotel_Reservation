package HotelReservation;

import java.util.*;

public class HotelReservationMain {
    public static int Weekday_count = 0, Weekend_count = 0;
    public static ArrayList<MiamiHotelDetails> details = new ArrayList<MiamiHotelDetails>();
    public static ArrayList<Integer> rate = new ArrayList<Integer>();
    public static Map<String, Integer> hotelmap = new HashMap<String, Integer>();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


        ChangeRateofHotel changerate = new ChangeRateofHotel();

        System.out.println("\nEnter the option to do operation");
        System.out.println("\nOperations 1-Ability to change the rates of hotel");
        System.out.print("\nEnter the option as numbers : ");
        int option = scan.nextInt();

        switch (option) {

            case 1: {
                changerate.change_rate();
            }

        }

    }


}
