public class RestaurantReservation {
    /*
    Restaurant reservation script that checks if there is enough space
    in the restaurant and is open, using conditional operators.
    * */
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public RestaurantReservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] args) {
        RestaurantReservation Simpsons = new RestaurantReservation(6, 8,true);
        Simpsons.confirmReservation();
        Simpsons.informUser();
        RestaurantReservation BigFamily = new RestaurantReservation(12,8,true);
        BigFamily.confirmReservation();
        BigFamily.informUser();
        RestaurantReservation AnotherBigFamily = new RestaurantReservation(12,8,false);
        AnotherBigFamily.confirmReservation();
        AnotherBigFamily.informUser();

    }
}

