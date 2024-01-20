public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int power, int distanceOfTransgression, int industriousness, int loyalty, int honesty) {
        super(name, power, distanceOfTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void points(Hufflepuff[] hufflepuffs) {
        int sum = hufflepuffs[0].getHonesty() + hufflepuffs[0].getIndustriousness() + hufflepuffs[0].getLoyalty();
        int sum1 = hufflepuffs[1].getHonesty()+ hufflepuffs[1].getIndustriousness() + hufflepuffs[1].getLoyalty();
        if(sum < sum1) {
            System.out.println(hufflepuffs[1].getName() + " лучший пуффендуец");
        } else {
            System.out.println(hufflepuffs[0].getName() + " лучший пуффендуец");

        }
    }
}
