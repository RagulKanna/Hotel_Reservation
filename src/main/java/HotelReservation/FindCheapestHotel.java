package HotelReservation;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

import static HotelReservation.HotelReservationMain.*;

public class FindCheapestHotel {
    public void find_cheapest_hotel() throws Exception {

        System.out.print("\nEnter the type of customer (Regular or Reward): ");
        String type = scan.next();
        System.out.print("\nEnter the date range (ie.howmanydays): ");
        int range = scan.nextInt();
        for (int i = 0; i < range; i++) {
            int d = i + 1;
            System.out.print("\n Date " + d + " : ");
            String dates = scan.next();
            if (day(dates).equals("Monday") || day(dates).equals("Tuesday") || day(dates).equals("Wednesday") || day(dates).equals("Thursday") || day(dates).equals("Friday")) {
                Weekday_count = Weekday_count + 1;
            } else if (day(dates).equals("Saturday") || day(dates).equals("Sunday")) {
                Weekend_count = Weekend_count + 1;
            }
        }
        if (type.toLowerCase().equals("regular")) {
            check_hotel_rate_regular();
        } else if (type.toLowerCase().equals("reward")) {
            check_hotel_rate_reward();
        } else
            System.out.println("\nYou entered wrong type....");
    }

    private void check_hotel_rate_reward() {
        int i = 0;
        while (i < details.size()) {
            int weekday_rate = details.get(i).getReward_customer_weekday_rate() * Weekday_count;
            int weekend_rate = details.get(i).getReward_customer_weekend_rate() * Weekend_count;
            rate.add(i, weekday_rate + weekend_rate);
            i++;
        }

        Integer min_rate = rate.stream().min(Comparator.comparing(n -> n.intValue())).get();
        Integer index = rate.indexOf(min_rate);
        String hotel = details.get(index).getHotel_name();
        System.out.println("\ncheapest hotel is " + hotel + " for rate " + min_rate + "$");
    }

    private void check_hotel_rate_regular() {
        int i = 0;
        while (i < details.size()) {
            int weekday_rate = details.get(i).getRegular_customer_weekday_rate() * Weekday_count;
            int weekend_rate = details.get(i).getRegular_customer_weekend_rate() * Weekend_count;
            rate.add(i, weekday_rate + weekend_rate);
            i++;
        }

        Integer min_rate = rate.stream().min(Comparator.comparing(n -> n.intValue())).get();
        Integer index = rate.indexOf(min_rate);
        String hotel = details.get(index).getHotel_name();
        System.out.println("\ncheapest hotel is " + hotel + " for rate " + min_rate + "$");
    }

    private String day(String userdate) throws ParseException {
        DateFormat originalFormat = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        DateFormat targetFormat = new SimpleDateFormat("EEEE");
        Date date = originalFormat.parse(userdate);
        String Day = targetFormat.format(date);
        return Day;
    }
}
