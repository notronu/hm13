public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int power, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, power, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }



    @Override
    public String toString() {
        return getName() + " power= " + getPower() +
                ", distanceOfTransgression " + getDistanceOfTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void compare(Gryffindor second) {
        int sum1 = this.getNobility() + this.getHonor() + this.getBravery();
        int sum2 = second.getNobility() + second.getHonor() + second.getBravery();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + second.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(second.getName() + " лучший Гриффиндорец, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " имеют равное количество очков навыков");
        }

    }

    }




