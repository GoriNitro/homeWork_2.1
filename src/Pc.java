public class Pc extends Device {

private Firm firm;

    public Pc(int power, int price, int cps, Firm firm) {
        super(power, price, firm);
    }

    public Firm getFirm() {
        return firm;
    }
    public void turnOn() {
        System.out.println("Pc is on");
    }

    public final void turnOn(String on) {
        System.out.println(on);
    }

    public String getInfo() {
        return "\nPower: " + getPower() +
                "\nPrice: " + getPrice();
    }
}

