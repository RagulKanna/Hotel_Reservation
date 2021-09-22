package HotelReservation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class HotelforReward extends HotelReservationMain {

    public static int[] index = new int[3];

    public static void find_hotel_for_rewards() throws Exception {
        get_type();
        check_hotel_rate_reward();
        display_best_hotel();
    }

    public static void get_type() throws Exception {
        SpecialRewardRates.change_reward_rate(80, 80, 110, 50, 100, 40);
        System.out.print("\nEnter the date range (ie.howmanydays): ");
        String daterange = scan.next();
        ValidateInputs.check_Date_Range(daterange);
        int range = Integer.parseInt(daterange);
        for (int i = 0; i < range; i++) {
            int d = i + 1;
            System.out.print("\n Date " + d + " : ");
            String dates = scan.next();
            ValidateInputs.check_date(dates);
            if (day(dates).equals("Monday") || day(dates).equals("Tuesday") || day(dates).equals("Wednesday") || day(dates).equals("Thursday") || day(dates).equals("Friday")) {
                Weekday_count = Weekday_count + 1;
            } else if (day(dates).equals("Saturday") || day(dates).equals("Sunday")) {
                Weekend_count = Weekend_count + 1;
            }
        }
    }

    public static void check_hotel_rate_reward() {
        int i = 0;
        while (i < details.size()) {
            int weekday_rate = details.get(i).getReward_customer_weekday_rate() * Weekday_count;
            int weekend_rate = details.get(i).getReward_customer_weekend_rate() * Weekend_count;
            rate.add(i, weekday_rate + weekend_rate);
            i++;
        }
    }

    private static void display_best_hotel() {
        Integer min_rate = rate.stream().min(Comparator.comparing(n -> n.intValue())).get();
        int check = 0;
        while (check < rate.size()) {
            if (min_rate.equals(rate.get(check))) {
                index[check] = check;
            }
            check++;
        }

        String hotel = null;

        int best_rate = 0;
        for (int ind : index) {
            if (best_rate < details.get(ind).getHotel_rating()) {
                best_rate = details.get(ind).getHotel_rating();
                hotel = details.get(ind).getHotel_name();
            }
        }
        System.out.println("\nThe cheapest hotel " + hotel + "with rating of " + best_rate + " and with cost of " + min_rate + "$ per day....");
    }

    private static String day(String userdate) throws ParseException {
        DateFormat originalFormat = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        DateFormat targetFormat = new SimpleDateFormat("EEEE");
        Date date = originalFormat.parse(userdate);
        String Day = targetFormat.format(date);
        return Day;
    }
}

