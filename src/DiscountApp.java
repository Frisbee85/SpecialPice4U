public class DiscountApp {
    public static void main(String[] args) {

        Client client1 = new Client("Jan", "Kowalski", true);
        double price = 900;
        double discountPrice = price;
       DiscountService discountService = new DiscountService();
       discountService.calculateDiscountPrice(client1,price);

        System.out.println("Witaj" + client1);
        System.out.println("Kwota przed rabatem : "+ price);
        System.out.println("Kwota do zapłaty po rabacie : "+ discountPrice);
    }
}
