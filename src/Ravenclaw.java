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
        int sum = ravenclaws[0].getWisdom() + ravenclaws[0].getCreativity() + ravenclaws[0].getIntellect();
        int sum1 = ravenclaws[1].getCreativity()+ ravenclaws[1].getWisdom() + ravenclaws[1].getIntellect();
        if(sum < sum1) {
            System.out.println(ravenclaws[1].getName() + " лучший пуффендуец");
        } else {
            System.out.println(ravenclaws[0].getName() + " лучший пуффендуец");

        }
    }



}
