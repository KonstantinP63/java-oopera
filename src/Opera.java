import java.util.ArrayList;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public void printListActors() {
        System.out.println("Cписок всех актеров оперы:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }
}
