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

    public static void points(Gryffindor[] gryffindors) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            sum1 = gryffindor.getDistanceOfTransgression() + gryffindor.getPower();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(gryffindors[number].getName() + " лучший гриффиндорец");
    }



}
