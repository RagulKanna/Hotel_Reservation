package HotelReservation;


public class SpecialRewardRates extends HotelReservationMain {


    public static void change_reward_rate(int lackwood_reward_weekday_rate, int lackwood_reward_weekend_rate, int bridgewood_reward_weekday_rate, int bridgewood_reward_weekend_rate, int ridgewood_reward_weekday_rate, int ridgewood_reward_weekend_rate) {

        System.out.println("\nThe weekday and weekend rate for Lackwood hotel");
        System.out.print("\n weekday rate : $80");
        System.out.print("\n weekend rate : $80");
        MiamiHotelDetails hotel1 = new MiamiHotelDetails("Lackwood", 3, 110, lackwood_reward_weekday_rate, 110, lackwood_reward_weekend_rate);
        details.add(hotel1);

        System.out.println("\nThe weekday and weekend rate for Bridgewood hotel");
        System.out.print("\n weekday rate : $110");
        System.out.print("\n weekend rate : $50");
        MiamiHotelDetails hotel2 = new MiamiHotelDetails("Bridgewood", 4, 150, bridgewood_reward_weekday_rate, 150, bridgewood_reward_weekend_rate);
        details.add(hotel2);

        System.out.println("\nThe weekday and weekend rate for Ridgewood hotel");
        System.out.print("\n weekday rate : $100");
        System.out.print("\n weekend rate : $40");
        MiamiHotelDetails hotel3 = new MiamiHotelDetails("Ridgewood", 5, 220, ridgewood_reward_weekday_rate, 220, ridgewood_reward_weekend_rate);
        details.add(hotel3);

        weekday_rating_map();
        System.out.println("\nChanged_Weekday_Rate: " + hotelmap);
        weekend_rating_map();
        System.out.println("\nChanged_Weekend_Rate: " + hotelmap);

    }

    private static void weekend_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getReward_customer_weekend_rate());
        }
    }

    private static void weekday_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getReward_customer_weekday_rate());
        }
    }
}

