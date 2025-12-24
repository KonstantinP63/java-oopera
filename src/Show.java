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
        } else  {
            System.out.println("Такой актёр уже есть в списке и не может быть добавлен ещё раз.");
        }
    }

    //Заменить одного актёра в спектакле на другого.
    public void changeActor(Actor actor, String surname) {
        boolean isFound = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(surname)) {
                if (isFound) {
                    System.out.println("Актёр с фамилией " + surname + " уже заменён." + "\n");
                    continue;
                }
                listOfActors.set(i, actor);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Актёра с фамилией " + surname + " в списке нет." + "\n");
        }
    }
}
