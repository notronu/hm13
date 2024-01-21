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

    @Override
    public String toString() {
        return getName() + " power= " + getPower() +
                ", distanceOfTransgression " + getDistanceOfTransgression() +
                ", tricky=" + tricky +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness +
                '}';
    }

    public void compare(Slytherin second) {
        int sum1 = this.getAmbition() + this.getDetermination() + this.getTricky() + this.getResourcefulness() + this.getAuthoritativeness();
        int sum2 = second.getAmbition() + second.getDetermination() + second.getTricky() + second.getResourcefulness() + second.getAuthoritativeness();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + second.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(second.getName() + " лучший Слизеринец, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " имеют равное количество очков навыков");
        }


    }
}
