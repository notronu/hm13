public class PrintService {

    public void print (Gryffindor[] gryffindors) {
        System.out.println("Число учеников Гриффидора: " + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName()
                    + "; Дистанция трансгрессии " + gryffindor.getDistanceOfTransgression()
                    + "; Сила магии " + gryffindor.getPower()
                    + "; благородство " + gryffindor.getNobility()
                    + "; честь " + gryffindor.getHonor()
                    + "; храбрость " + gryffindor.getBravery());
        }
    }
    public void print (Hufflepuff[] hufflepuffs) {
        System.out.println("Число учеников Пуффендуя: " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя " + hufflepuff.getName()
                    + "; Дистанция трансгрессии " + hufflepuff.getDistanceOfTransgression()
                    + "; Сила магии " + hufflepuff.getPower()
                    + "; трудолюбие " + hufflepuff.getIndustriousness()
                    + "; верность " + hufflepuff.getLoyalty()
                    + "; честность " + hufflepuff.getHonesty());
        }
    }
    public void print (Ravenclaw[] ravenclaws) {
        System.out.println("Число учеников Когтеврана: " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя " + ravenclaw.getName()
                    + "; Дистанция трансгрессии " + ravenclaw.getDistanceOfTransgression()
                    + "; Сила магии " + ravenclaw.getPower()
                    + "; Ум " + ravenclaw.getIntellect()
                    + "; Мудрость " + ravenclaw.getWisdom()
                    + "; Творчество " + ravenclaw.getCreativity());
        }
    }
    public void print (Slytherin[] slytherins) {
        System.out.println("Число учеников Слизерина: " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName()
                    + "; Дистанция трансгрессии " + slytherin.getDistanceOfTransgression()
                    + "; Сила магии " + slytherin.getPower()
                    + "; хитрость " + slytherin.getTricky()
                    + "; решительность " + slytherin.getDetermination()
                    + "; амбициозность " + slytherin.getAmbition()
                    + "; находчивость " + slytherin.getResourcefulness()
                    + "; жажда власти " + slytherin.getAuthoritativeness());

        }
    }

    }

