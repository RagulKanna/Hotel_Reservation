package HotelReservation;

import java.util.Comparator;

import static HotelReservation.FindCheapestHotel.type;


public class FindCheapestHotelwithbestRated extends HotelReservationMain {
    public int[] index = new int[3];
    public FindCheapestHotel function = new FindCheapestHotel();

    public void cheapandbestratedhotel() throws Exception {
        function.get_type();
        check_type();

    }

    public void check_type() {
        if (type.toLowerCase().equals("regular")) {
            function.check_hotel_rate_regular();
            display_best_hotel();
        } else if (type.toLowerCase().equals("reward")) {
            function.check_hotel_rate_reward();
            display_best_hotel();
        } else
            System.out.println("\nYou entered wrong type....");
    }

    private void display_best_hotel() {
        Integer min_rate = rate.stream().min(Comparator.comparing(n -> n.intValue())).get();
        int check = 0, count = 0;
        System.out.println(rate.size());
        while (check < rate.size()) {
            if (rate.get(check).equals(min_rate)) {
                index[count] = check;
                count++;
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

}
