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
        BestRatedHotel topratedhotel = new BestRatedHotel();
        AddRating rating = new AddRating();
        SpecialRewardRates rewardrate = new SpecialRewardRates();
        System.out.println("\nEnter the option to do operation");
        System.out.println("\nOperations: \n    1-Ability to change the rates of hotel" +
                "\n    2-Ability to check cheapesthotel" +
                "\n    3-Ability to change rating of hotel" +
                "\n    4-Ability to check cheapest with best rating" +
                "\n    5-Ability to check best rated hotel" +
                "\n    6-Ability to do with special rates");
        System.out.print("\nEnter the option as numbers : ");
        int option = scan.nextInt();

        switch (option) {

            case 1: {
                changerate.change_rate(110,90,150,50,220,150);
            }
            break;

            case 2: {
                findcheap.find_cheapest_hotel();
            }
            break;

            case 3: {
                rating.add_rating(3,4,5);
            }
            break;

            case 4: {
                besthotel.cheapandbestratedhotel();
            }
            break;

            case 5: {
                topratedhotel.bestratedhotel();
            }
            break;

            case 6: {
                rewardrate.change_reward_rate(80,80,110,50,100,40);
            }
            break;
        }
    }



}
