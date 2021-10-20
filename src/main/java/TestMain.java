
public class TestMain {
   static RestaurantService restaurantService = new RestaurantService();
    public static void main(String[] args) {
        try {
            restaurantService.findRestaurantByName("Taj");
        } catch (restaurantNotFoundException e) {
            e.printStackTrace();
        }
    }
}
