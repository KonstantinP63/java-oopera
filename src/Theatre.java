import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 176);
        Actor actor3 = new Actor("Василиса", "Васильева", Gender.FEMALE, 170);
        Actor actor4 = new Actor("Юрий", "Яковлев", Gender.MALE, 184);

        Director director1 = new Director("Сидор", "Сидоров", Gender.MALE, 12);
        Director director2 = new Director("Владимир", "Владимиров", Gender.MALE, 8);

        MusicalShow.musicAuthor = "Валентин Валентинов";
        Ballet.choreographer = "Павел Павлов";

        Show show = new Show("Земля и небо", 130, director1);

        Opera opera = new Opera("Евгений Пинегин", 240, director2, MusicalShow.musicAuthor,
                "Евгений встречает Татьяну и влюбляется в неё.", 56);

        Ballet ballet = new Ballet("Челкунчик", 158, director1, MusicalShow.musicAuthor,
                "Совершив геройский поступок, Челкунчик становится принцем.", Ballet.choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        show.printListActors();

        opera.printListActors();

        ballet.printListActors();

        show.changeActor(actor3, actor1.surname);
        show.printListActors();

        ballet.changeActor(actor4, actor1.surname);
        ballet.printListActors();

        opera.printLibretto();

        ballet.printLibretto();
    }
}
