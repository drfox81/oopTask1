public class Flower {
    private String flower;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flower, String country, double cost, int lifeSpan, String flowerColor) {
        if (flower == null || flower.isEmpty() || flower.isBlank()) {
            this.flower = "гвоздика";
        } else {
            this.flower = flower;
        }

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            double q = cost * 100;
            q = Math.round(q);
            this.cost = q / 100;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
        }
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public Flower() {
    }

    @Override
    public String toString() {
        return flower + '\n' +
                "Цвет - " + flowerColor + ", " +
                "страна происхождения - " + country + ", " +
                " цена за шт. - " + cost +
                ", срок стояния - " + lifeSpan +
                " дня/дней.";
    }

    public static double sumFlower(Flower flower, int number) {
        double q = flower.getCost() * 100 * number;
        q = Math.round(q);
        return q / 100;
    }

    //r-roze h-hrizantem p-pion g-gipcofila
    //метод выдает стоимость букета
    public static double sumBouquet(Flower r, int numberR, Flower h, int numberH, Flower p, int numberP, Flower g, int numberG) {
        numberH = Math.abs(numberH);
        numberG = Math.abs(numberG);
        numberR = Math.abs(numberR);
        numberP = Math.abs(numberP);
        int lifeSpanBouquet;
        if (numberP != 0) {
            lifeSpanBouquet = p.lifeSpan;
        } else if (numberH != 0) {
            lifeSpanBouquet = r.lifeSpan;
        } else if (numberG != 0) {
            lifeSpanBouquet = h.lifeSpan;
        } else {
            lifeSpanBouquet = g.lifeSpan;
        }

        double q = r.getCost() * 100 * numberR + h.getCost() * 100 * numberH +
                p.getCost() * 100 * numberP + g.getCost() * 100 * numberG;
        q = Math.round(q);
        q /= 100;
        System.out.printf("Срок стояния букета %s день(/я). Стоимость Вашего букета (%s шт %s, %s шт %s, %s шт %s, %s шт %s) составляет - ",
                lifeSpanBouquet,
                numberR, r.getFlower(), numberH, h.getFlower(),
                numberP, p.getFlower(), numberG, g.getFlower());
        return q;
    }


}
