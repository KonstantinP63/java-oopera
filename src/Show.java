import java.util.ArrayList;

public class Show {
    protected String title;
    public int duration;
    protected Director director;
    //protected ArrayList<Actor> listOfTheaterActors; // Состав труппы театра.
    protected ArrayList<Actor> listOfActors; // Cписок всех актеров, участвующих в спектакле.

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        //this.listOfTheaterActors = new ArrayList<>();
        this.listOfActors = new ArrayList<>();
    }

    //Распечатать список всех актеров.
    public void printListActors() {
        System.out.println("Cписок всех актеров спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }

    //Добавить нового актера в спектакль.
    public void addActor(Actor actor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(actor);
            return;
        }
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            return;
        }
        for (Actor act : listOfActors) {
            if (act.equals(actor)) {
                System.out.println("Такой актёр уже есть в списке и не может быть добавлен ещё раз.");
            }
        }
    }

    //Заменить одного актёра в спектакле на другого.
    public void changeActor(Actor actor, String surname) {
        for (Actor act : listOfActors) {
            if (!act.surname.equals(surname)) {
                System.out.println("Такого актёра нет в списке." + '\n');
                return;
            } else {
                listOfActors.remove(act);
                listOfActors.add(actor);
                return;
            }
        }
    }
}
