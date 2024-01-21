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


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }
    public void compareAnyStudents(Hogwarts second) {
        if (this.getPower() > second.getPower()) {
            System.out.println(this.getName() + " обладает большей силой магии,чем " + second.getName());
        } else if (this.getPower() < second.getPower()) {
            System.out.println(second.getName() + " обладает большей силой магии,чем " + this.getName());
        } else {
            System.out.println(second.getName() + " и " + this.getName() + " равны по силе");
        }

        if (this.getDistanceOfTransgression() > second.getDistanceOfTransgression()) {
            System.out.println(this.getName() + " обладает большим расстоянием прогрессии,чем " + second.getName());
        } else if (this.getDistanceOfTransgression() < second.getDistanceOfTransgression()) {
            System.out.println(second.getName() + " обладает большим расстоянием трансгрессии,чем " + this.getName());
        } else {
            System.out.println(second.getName() + " и " + this.getName() + " равны по расстоянию трансгрессии");
        }
    }
}








