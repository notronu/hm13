// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 89, 50, 73, 64, 88),
                new Gryffindor("Hermione Granger", 85, 40, 62, 60, 50),
                new Gryffindor("Ron Weasley", 70, 35, 55, 49, 65),

        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah Smith", 54, 20, 43, 65, 33),
                new Hufflepuff("Cedric Diggory", 34, 55, 22, 66, 75),
                new Hufflepuff("Justin Finch-Fletchley", 47, 64, 72, 91, 23),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang", 37, 37, 48, 55, 5),
                new Ravenclaw("Padma Patil", 20, 15, 30, 27, 65),
                new Ravenclaw("Marcus Belby", 31, 32, 33, 34, 14),
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 22, 33, 44, 55, 66, 77, 88),
                new Slytherin("Graham Montague", 12, 23, 34, 45, 56, 67, 78),
                new Slytherin("Gregory Goyle", 21, 32, 43, 54, 65, 76, 65),


        };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        System.out.println();
        printService.print(ravenclaws);
        System.out.println();
        printService.print(hufflepuffs);
        System.out.println();
        printService.print(slytherins);
        Ravenclaw.points(ravenclaws);



    }
}
