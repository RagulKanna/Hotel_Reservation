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
        FindCheapestHotel findcheap = new FindCheapestHotel();
        FindCheapestHotelwithbestRated besthotel = new FindCheapestHotelwithbestRated();
        AddRating rating = new AddRating();
        defaultvalue();
        System.out.println("\nEnter the option to do operation");
        System.out.println("\nOperations: \n    1-Ability to change the rates of hotel\n    2-Ability to check cheapesthotel\n    3-Ability to change rating of hotel\n    4-Ability to check cheapest with best rating");
        System.out.print("\nEnter the option as numbers : ");
        int option = scan.nextInt();

        switch (option) {

            case 1: {
                changerate.change_rate();
            }
            break;

            case 2: {
                findcheap.find_cheapest_hotel();
            }
            break;

            case 3: {
                rating.add_rating();
            }
            break;

            case 4: {
                besthotel.bestratedhotel();
            }
            break;
        }
    }


    private static void defaultvalue() {
        MiamiHotelDetails hotel1 = new MiamiHotelDetails("Lackwood", 3, 110, 110, 90, 90);
        details.add(hotel1);
        MiamiHotelDetails hotel2 = new MiamiHotelDetails("Bridgewood", 4, 150, 150, 50, 50);
        details.add(hotel2);
        MiamiHotelDetails hotel3 = new MiamiHotelDetails("Ridgewood", 5, 220, 220, 150, 150);
        details.add(hotel3);
    }


}
