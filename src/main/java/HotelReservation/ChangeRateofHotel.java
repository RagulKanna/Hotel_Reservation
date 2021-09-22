package HotelReservation;

import java.util.Map;

import static HotelReservation.HotelReservationMain.*;


public class ChangeRateofHotel {

    public static int lackwood_weekday_rate, lackwood_weekend_rate, bridgewood_weekday_rate, bridgewood_weekend_rate, ridgewood_weekday_rate, ridgewood_weekend_rate;


    public void change_rate() {


        System.out.println("\nEnter the weekday and weekend rate for each hotels...");
        System.out.println("\nEnter the weekday and weekend rate for Lackwood hotel");
        System.out.print("\n weekday rate : ");
        lackwood_weekday_rate = scan.nextInt();
        System.out.print("\n weekend rate : ");
        lackwood_weekend_rate = scan.nextInt();
        MiamiHotelDetails hotel1 = new MiamiHotelDetails("Lackwood", 3, lackwood_weekday_rate, lackwood_weekday_rate, lackwood_weekend_rate, lackwood_weekend_rate);
        details.add(hotel1);

        System.out.println("\nEnter the weekday and weekend rate for Bridgewood hotel");
        System.out.print("\n weekday rate : ");
        bridgewood_weekday_rate = scan.nextInt();
        System.out.print("\n weekend rate : ");
        bridgewood_weekend_rate = scan.nextInt();
        MiamiHotelDetails hotel2 = new MiamiHotelDetails("Bridgewood", 4, bridgewood_weekday_rate, bridgewood_weekday_rate, bridgewood_weekend_rate, bridgewood_weekend_rate);
        details.add(hotel2);

        System.out.println("\nEnter the weekday and weekend rate for Ridgewood hotel");
        System.out.print("\n weekday rate : ");
        ridgewood_weekday_rate = scan.nextInt();
        System.out.print("\n weekend rate : ");
        ridgewood_weekend_rate = scan.nextInt();
        MiamiHotelDetails hotel3 = new MiamiHotelDetails("Ridgewood", 5, ridgewood_weekday_rate, ridgewood_weekday_rate, ridgewood_weekend_rate, ridgewood_weekend_rate);
        details.add(hotel3);

        weekday_rating_map();
        System.out.println("\nChanged_Weekday_Rate: " + hotelmap);
        weekend_rating_map();
        System.out.println("\nChanged_Weekend_Rate: " + hotelmap);

    }

    private void weekend_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getRegular_customer_weekend_rate());
        }
    }

    private void weekday_rating_map() {
        for (int i = 0; i < details.size(); i++) {
            hotelmap.put(details.get(i).getHotel_name(), details.get(i).getRegular_customer_weekday_rate());
        }
    }
}
