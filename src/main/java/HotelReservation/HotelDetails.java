package HotelReservation;

public class HotelDetails {
    String hotel_name;
    int regular_customer_weekday_rate;
    int regular_customer_weekend_rate;
    int reward_customer_weekday_rate;
    int reward_customer_weekend_rate;
    int hotel_rating;

    public HotelDetails(String hotel_name, int hotel_rating, int regular_customer_weekday_rate, int reward_customer_weekday_rate, int regular_customer_weekend_rate, int reward_customer_weekend_rate) {
        this.hotel_name = hotel_name;
        this.regular_customer_weekday_rate = regular_customer_weekday_rate;
        this.regular_customer_weekend_rate = regular_customer_weekend_rate;
        this.reward_customer_weekday_rate = reward_customer_weekday_rate;
        this.reward_customer_weekend_rate = reward_customer_weekend_rate;
        this.hotel_rating = hotel_rating;
    }

    public int getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(int hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public int getRegular_customer_weekday_rate() {
        return regular_customer_weekday_rate;
    }

    public void setRegular_customer_weekday_rate(int regular_customer_weekday_rate) {
        this.regular_customer_weekday_rate = regular_customer_weekday_rate;
    }

    public int getRegular_customer_weekend_rate() {
        return regular_customer_weekend_rate;
    }

    public void setRegular_customer_weekend_rate(int regular_customer_weekend_rate) {
        this.regular_customer_weekend_rate = regular_customer_weekend_rate;
    }

    public int getReward_customer_weekday_rate() {
        return reward_customer_weekday_rate;
    }

    public void setReward_customer_weekday_rate(int reward_customer_weekday_rate) {
        this.reward_customer_weekday_rate = reward_customer_weekday_rate;
    }

    public int getReward_customer_weekend_rate() {
        return reward_customer_weekend_rate;
    }

    public void setReward_customer_weekend_rate(int reward_customer_weekend_rate) {
        this.reward_customer_weekend_rate = reward_customer_weekend_rate;
    }
}
