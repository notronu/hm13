public class Slytherin extends Hogwarts{
    private int tricky;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;

    public Slytherin(String name, int power, int distanceOfTransgression, int tricky, int determination, int ambition, int resourcefulness, int authoritativeness) {
        super(name, power, distanceOfTransgression);
        this.tricky = tricky;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public void setAuthoritativeness(int authoritativeness) {
        this.authoritativeness = authoritativeness;
    }
    public static void points(Slytherin[] slytherins){
        int sum = slytherins[0].getAmbition() + slytherins[0].getAuthoritativeness() + slytherins[0].getResourcefulness() + slytherins[0].getDetermination() + slytherins[0].getTricky();
        int sum1 = slytherins[1].getAmbition()+ slytherins[1].getAuthoritativeness() + slytherins[1].getResourcefulness() + + slytherins[1].getDetermination() + slytherins[1].getTricky();
        if(sum < sum1) {
            System.out.println(slytherins[1].getName() + " лучший слизеринец");
        } else {
            System.out.println(slytherins[0].getName() + " лучший слизеринец");

        }

    }
}
