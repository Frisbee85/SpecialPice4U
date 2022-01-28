public class DiscountService {
    public double calculateDiscountPrice(Client client, double price) {
        double discountPrice = price;
        if (client.isPremium() && price > 1000) {
            discountPrice *= 0.85;
        } else if (price > 1000) {
            discountPrice *= 0.9;
        } else if (client.isPremium()) {
            discountPrice *= 0.95;
        }
        return discountPrice;
    }
}
