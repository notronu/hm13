import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 89, 50, 73, 64, 88);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 85, 40, 62, 60, 50);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 70, 35, 55, 49, 65);
        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", 54, 20, 43, 65, 33);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 34, 55, 22, 66, 75);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 47, 64, 72, 91, 23);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 37, 37, 48, 55, 5);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 20, 15, 30, 27, 65);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 31, 32, 33, 34, 14);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 22, 55, 44, 55, 66, 77, 88);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 12, 23, 34, 45, 56, 67, 78);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 21, 32, 43, 54, 65, 76, 65);

        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(cedricDiggory);
        System.out.println(padmaPatil);

        harryPotter.compare(ronWeasley);
        zachariahSmith.compare(cedricDiggory);
        padmaPatil.compare(marcusBelby);
        dracoMalfoy.compare(gregoryGoyle);

        harryPotter.compareAnyStudents(dracoMalfoy);
        hermioneGranger.compareAnyStudents(zhouChang);









    }
}
