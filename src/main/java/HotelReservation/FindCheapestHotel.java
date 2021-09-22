package HotelReservation;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;


public class FindCheapestHotel extends HotelReservationMain {
    public static int check, count;
    public static int[] index = new int[3];
    public static String type;

    public void find_cheapest_hotel() throws Exception {
        get_type();
        check_type();

    }

    public void get_type() throws Exception {
        ChangeRateofHotel.change_rate(110, 90, 150, 50, 220, 150);
        System.out.print("\nEnter the type of customer (Regular or Reward): ");
        type = scan.next();
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
    }

    public void check_type() {
        if (type.toLowerCase().equals("regular")) {
            check_hotel_rate_regular();
            display();
        } else if (type.toLowerCase().equals("reward")) {
            check_hotel_rate_reward();
            display();
        } else
            System.out.println("\nYou entered wrong type....");
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

    public static void check_hotel_rate_regular() {
        int i = 0;
        while (i < details.size()) {
            int weekday_rate = details.get(i).getRegular_customer_weekday_rate() * Weekday_count;
            int weekend_rate = details.get(i).getRegular_customer_weekend_rate() * Weekend_count;
            rate.add(i, weekday_rate + weekend_rate);
            i++;
        }
    }

    private String day(String userdate) throws ParseException {
        DateFormat originalFormat = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        DateFormat targetFormat = new SimpleDateFormat("EEEE");
        Date date = originalFormat.parse(userdate);
        String Day = targetFormat.format(date);
        return Day;
    }

    private void display() {
        Integer min_rate = rate.stream().min(Comparator.comparing(n -> n.intValue())).get();
        check = 0;
        count = 0;
        while (check < rate.size()) {
            if (min_rate.equals(rate.get(check))) {
                index[check] = check;
                count++;
            }
            check++;
        }
        String hotel;
        System.out.print("\nThe cheapest hotel ");

        for (int j = 0; j < count; j++) {
            hotel = details.get(index[j]).getHotel_name();
            if (j == 0) {
                System.out.print(hotel + " ");
            } else {
                System.out.print(" and " + hotel);
            }
        }
        System.out.print("with cost of " + min_rate + "$ per day....");
    }
}
