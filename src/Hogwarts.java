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
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < hogwarts1.length; i++) {
            Hogwarts hogwarts = hogwarts1[i];
            sum1 = hogwarts.getDistanceOfTransgression() + hogwarts.getPower();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(hogwarts1[number].getName() + " самый сильный");
    }



}


