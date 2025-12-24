import java.util.Objects;

public class Director extends Person {
    protected int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
    //Распечатать информацию о режиссёре спектакля.
    public String printDirector (Director director) {
        return director.toString();
    }

    @Override
    public boolean equals(Object o) {
        super.equals(numberOfShows);
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfShows);
    }

    @Override
    public String toString() {
        return "Director={" +
                "name='" + name + '\'' + '\t' +
                "surname='" + surname + '\'' +
                '}';
    }
}
