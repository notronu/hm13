public class Hogwarts {

    private final String name;
    private int power;
    private int distanceOfTransgression;


    public Hogwarts(String name, int power, int distanceOfTransgression) {
        this.name = name;
        this.power = power;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public static void points(Hogwarts[] hogwarts1) {
        int sum = hogwarts1[3].getPower() + hogwarts1[3].getDistanceOfTransgression();
        int sum1 = hogwarts1[2].getPower() + hogwarts1[2].getDistanceOfTransgression();
        if (sum < sum1) {
            System.out.println(hogwarts1[2].getName() + " обладает большой мощностью магии, чем " + hogwarts1[3]);
        } else {
            System.out.println(hogwarts1[3].getName() + " обладает большой мощностью магии, чем " + hogwarts1[2]);
        }
    }

    @Override
    public String toString() {
        return name;


    }
}






