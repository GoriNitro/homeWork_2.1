public final class CPU  extends Pc{
    private Firm firm;
    private int cps;
    public Firm getFirm() {
        return firm;
    }
    public int getCps() {
        return cps;
    }
    public CPU(int power,int price, Firm firm, int cps) {
        super(power,price, cps, firm);
        this.firm = firm;
        this.cps = cps;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+"\nCPS: "+ getCps()+
                "\nFirm: "+ getFirm();
    }
}

