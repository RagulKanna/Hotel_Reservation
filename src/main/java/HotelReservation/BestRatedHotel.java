package HotelReservation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static HotelReservation.FindCheapestHotel.type;


public class BestRatedHotel extends HotelReservationMain{
    public int[] index = new int[3];
    public FindCheapestHotel function = new FindCheapestHotel();

    public void bestratedhotel() throws Exception {
        AddRating.add_rating(3,4,5);
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
        List<Integer> rating = new ArrayList<Integer>();
        int i = 0;
        while (i < details.size()) {
            rating.add(details.get(i).hotel_rating);
            i++;
        }
        Integer best_rate = rating.stream().max(Comparator.comparing(n -> n.intValue())).get();
        int index = rating.indexOf(best_rate);
        String hotel = details.get(index).getHotel_name();
        int rate = HotelReservationMain.rate.get(index);
        System.out.println("\nThe hotel " + hotel + " with rating of " + best_rate + " and with cost of " + rate + "$ per day....");
    }
}
