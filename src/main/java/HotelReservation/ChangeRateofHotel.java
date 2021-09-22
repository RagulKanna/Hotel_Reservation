package HotelReservation;





public class ChangeRateofHotel extends HotelReservationMain{


    public static void change_rate(int lackwood_weekday_rate,int lackwood_weekend_rate,int bridgewood_weekday_rate,int bridgewood_weekend_rate,int ridgewood_weekday_rate,int ridgewood_weekend_rate) {


        System.out.println("\nThe weekday and weekend rate for Lackwood hotel");
        System.out.print("\n weekday rate : $110");
        System.out.print("\n weekend rate : $90");

        MiamiHotelDetails hotel1 = new MiamiHotelDetails("Lackwood", 3, lackwood_weekday_rate, lackwood_weekday_rate, lackwood_weekend_rate, lackwood_weekend_rate);
        details.add(hotel1);

        System.out.println("\nThe weekday and weekend rate for Bridgewood hotel");
        System.out.print("\n weekday rate : $150");
        System.out.print("\n weekend rate : $50");

        MiamiHotelDetails hotel2 = new MiamiHotelDetails("Bridgewood", 4, bridgewood_weekday_rate, bridgewood_weekday_rate, bridgewood_weekend_rate, bridgewood_weekend_rate);
        details.add(hotel2);

        System.out.println("\nThe weekday and weekend rate for Ridgewood hotel");
        System.out.print("\n weekday rate : $220");
        System.out.print("\n weekend rate : $150");

        MiamiHotelDetails hotel3 = new MiamiHotelDetails("Ridgewood", 5, ridgewood_weekday_rate, ridgewood_weekday_rate, ridgewood_weekend_rate, ridgewood_weekend_rate);
        details.add(hotel3);

        weekday_rating_map();
        System.out.println("\nChanged_Weekday_Rate: " + hotelmap);
        weekend_rating_map();
        System.out.println("\nChanged_Weekend_Rate: " + hotelmap);

    }

    private static void weekend_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getRegular_customer_weekend_rate());
        }
    }

    private static void weekday_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getRegular_customer_weekday_rate());
        }
    }
}
