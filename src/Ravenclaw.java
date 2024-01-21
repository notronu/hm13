import javax.script.ScriptEngine;
import java.awt.desktop.PreferencesEvent;
import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int creativity;

    public Ravenclaw(String name, int power, int distanceOfTransgression, int intellect, int wisdom, int creativity) {
        super(name, power, distanceOfTransgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.creativity = creativity;

    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + "power= " + getPower() +
                ", distanceOfTransgression " + getDistanceOfTransgression() +
                ", intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                '}';
    }

    public void compare(Ravenclaw second) {
        int sum1 = this.getCreativity() + this.getWisdom() + this.getIntellect();
        int sum2 = second.getCreativity() + second.getWisdom() + second.getIntellect();

        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + second.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(second.getName() + " лучший Когтевранец, чем " + this.getName() + ".");
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " имеют равное количество очков навыков");
        }

    }



}
