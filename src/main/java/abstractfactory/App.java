package abstractfactory;

import abstractfactory.factoies.EnglishFactory;
import abstractfactory.factoies.FilmFactory;
import abstractfactory.factoies.FranceFactory;
import abstractfactory.factoies.UkrainianFactory;
import abstractfactory.film.Film;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    String name;

    private FilmFactory configuration(String selector) {
        FilmFactory factory = null;
        switch (selector) {
            case "1":
                factory = new EnglishFactory();
                break;
            case "2":
                factory = new FranceFactory();
                break;
            case "3":
                factory = new UkrainianFactory();
                break;
        }
        return factory;
    }

    private void startFilm() {
        Film film;
        name = newFilm();
        while (true) {
            try {
                String selector = scanner.nextLine();
                if (selector.matches("[1-3]")) {
                    ;
                    film = new Film(name, configuration(selector));
                    film.paint();
                } else if (selector.equals("stop")) {
                    break;
                } else if (selector.equals("new")) {
                    name = newFilm();
                } else {
                    throw new IllegalAccessException();
                }
            } catch (IllegalAccessException e) {
                System.out.println("You should write number from 1 to 3");
            }
        }
        System.out.println("The film was finished!");
    }


    public String newFilm() {
        System.out.println("Select the movie you want to watch (name it)");
        String name = scanner.nextLine();
        System.out.println("If you want to change language, input:");
        System.out.println("1 - English;\n2 - Français\n3 - Українська");
        System.out.println("If you want to stop film, write \"stop\"");
        System.out.println("If you want to select new film, write \"new\"");
        return name;
    }

    public static void main(String[] args) {
        new App().startFilm();

    }
}
