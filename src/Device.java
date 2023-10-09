public class Device {
    private int power;
    private int price;
    public int getPower() {
        return power;
    }
    public int getPrice() {
        return price;
    }
    public Device(int power, int price, Firm firm) {
        this.power = power;
        this.price = price;
    }
}
