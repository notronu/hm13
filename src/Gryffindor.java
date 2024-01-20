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
        int sum = gryffindors[0].getNobility() + gryffindors[0].getBravery() + gryffindors[0].getHonor();
        int sum1 = gryffindors[1].getNobility()+ gryffindors[1].getBravery() + gryffindors[1].getHonor();
        if(sum < sum1) {
            System.out.println(gryffindors[1].getName() + " лучший грифиндорец");
        } else {
            System.out.println(gryffindors[0].getName() + " лучший грифиндорец");

            }
        }

    }




