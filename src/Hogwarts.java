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
}


