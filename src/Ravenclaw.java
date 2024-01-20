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

    public static void points(Ravenclaw[] ravenclaws) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            sum1 = ravenclaw.getWisdom() + ravenclaw.getIntellect() + ravenclaw.getCreativity();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(ravenclaws[number].getName() + " лучший когтевранец");
    }



}
