import java.util.Calendar;

public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    public String getTown(){
        return town;
    }

    public void setTown(String town){
        if (town==null || town.isBlank() || town.isEmpty()){
            this.town="Информация не указана";
        }
        this.town=town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth<=0) { this.yearOfBirth=0;}
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name == "") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth <= 0) {
            this.yearOfBirth = year;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

}