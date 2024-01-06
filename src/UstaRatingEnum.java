import java.util.Arrays;

public class UstaRatingEnum {

    public static void main(String[] args) {
        UstaRating[] ratings = UstaRating.values();

        Arrays.stream(UstaRating.values()).forEach( r -> System.out.println("Rating: "+r.name()+", value: "+r.getValue()));

        System.out.println("My USTA Rating is: "+UstaRating.FOUR_POINT_FIVE.getValue());

        System.out.println("An average player's rating is: "+UstaRating.getByValue(3.5));
    }
}


enum UstaRating {
    ONE_POINT_ZERO(1.0),
    ONE_POINT_FIVE(1.5),
    TWO_POINT_ZERO(2.0),
    TWO_POINT_FIVE(2.5),
    THREE_POINT_ZERO(3.0),
    THREE_POINT_FIVE(3.5),
    FOUR_POINT_ZERO(4.0),
    FOUR_POINT_FIVE(4.5),
    FIVE_POINT_ZERO(5.0),
    FIVE_POINT_FIVE(5.5),
    SIX_POINT_ZERO(6.0),
    SIX_POINT_FIVE(6.5),
    SEVEN_POINT_ZERO(7.0);

    private final double value;

    UstaRating(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    // You can add other methods or attributes as needed

    public static UstaRating getByValue(double value) {
        for (UstaRating rating : values()) {
            if (rating.getValue() == value) {
                return rating;
            }
        }
        throw new IllegalArgumentException("No USTA rating found for value: " + value);
    }
}