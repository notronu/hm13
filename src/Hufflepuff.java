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

    @Override
    public String toString() {
        return getName() + " power= " + getPower() +
                ", distanceOfTransgression " + getDistanceOfTransgression() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void compare(Hufflepuff second) {
        int sum1 = this.getHonesty() + this.getLoyalty() + this.getIndustriousness();
        int sum2 = second.getHonesty() + second.getLoyalty() + second.getIndustriousness();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + second.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(second.getName() + " лучший Пуффендуец, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " имеют равное количество очков навыков");
        }

        }

    }

