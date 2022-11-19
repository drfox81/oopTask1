import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", -1988, "Минск","бренд-менеджер");
        Human anna = new Human("", 1995, "Москва","методист образовательных программ");
        Human katy = new Human("Катя", 1992, "", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "");

        System.out.println(maksim.toString());
        System.out.println(anna.toString());
        System.out.println(katy.toString());
        System.out.println(artem.toString());
        Human vladimir=new Human("Владимир", 2001,"Казань","безработный");
        System.out.println(vladimir.toString());


        Flower roza = new Flower("Роза обыкновенная", "Голландия", 35.59, 0, "");
        Flower hrizantema = new Flower("Хризантема", "", 15, 5, "");
        Flower pion = new Flower("Пион", "Англия", 69.9, 1, "");
        Flower gipsofila = new Flower("Гипсофила", "Турция", 19.5, 10, "");


        System.out.println(roza.toString());
        System.out.println(hrizantema.toString());
        System.out.println(pion.toString());
        System.out.println(gipsofila.toString());
        System.out.println("\nДополнительная часть задания");
        // статический метод sum

        System.out.println(Flower.sumBouquet(roza, 7, hrizantema, 5, pion, 3, gipsofila, 1));


    }


}
