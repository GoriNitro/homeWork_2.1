public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc(45, 75000, 17, Firm.ASUS);
        CPU cpu = new CPU(15, 25000, Firm.AMD, 6);
        CPU cpu1 = new CPU(13, 23000, Firm.INTEL, 4);
        System.out.println("Info: ");
        System.out.println(pc.getInfo());
        System.out.println(cpu1.getInfo());
        System.out.println(cpu.getInfo());
        System.out.println("----------");
        pc.turnOn();
        pc.turnOn("Pc is off");
    }
}