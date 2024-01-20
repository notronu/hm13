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
    public void compareAllStudents(Slytherin[] slytherins){
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for(int i = 0; i < slytherins.length; i++){
            Slytherin slytherin = slytherins[i];
            sum1 = slytherin.getTricky() + slytherin.getDetermination() + slytherin.getAmbition()
                    + slytherin.getResourcefulness() + slytherin.getAuthoritativeness();
            if(sum < sum1){
                sum = sum1;
                number = i;
            }
        }
        System.out.println(slytherins[number].getName() + " is the best Slytherin");

    }
}
