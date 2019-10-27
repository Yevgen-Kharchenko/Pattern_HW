package observer;

import observer.postoffice.Observer;
import observer.subscribers.SubscriberImpl;

import static observer.publishers.Periodicals.*;

public class App {

    private static SubscriberImpl subscriber1 = new SubscriberImpl
            ("Petro Ivanchenko (1)", "Bandera aveny, 10");
    private static SubscriberImpl subscriber2 = new SubscriberImpl
            ("Ivan Petrenko (2)", "Pravdy aveny, 110");
    private static SubscriberImpl subscriber3 = new SubscriberImpl
            ("Olga Makuha(3)", "Peremogy aveny, 65");
    private static SubscriberImpl subscriber4 = new SubscriberImpl
            ("Yevgen Lahno (4)", "Shevchenko street, 54");
    private static SubscriberImpl subscriber5 = new SubscriberImpl
            ("Oleg Lyashko (5)", "Perova aveny, 14");
    private static SubscriberImpl subscriber6 = new SubscriberImpl
            ("Volodymyr Zelensky (6)", "Geroiv UPA aveny, 31");

    private static Observer observer = new Observer(PLAYBOY, COSMO, TIMES);

    public static void main(String[] args) {

        observer.subscribe(subscriber1, TIMES);
        observer.subscribe(subscriber2, COSMO);
        observer.subscribe(subscriber3, PLAYBOY);
        observer.subscribe(subscriber4, TIMES, PLAYBOY);
        observer.subscribe(subscriber5, COSMO, TIMES);
        observer.subscribe(subscriber6, TIMES, COSMO, PLAYBOY);

        observer.notify(TIMES);
        System.out.println("ooooooooooooooooooooooooooooooooooo");

        observer.notify(COSMO, PLAYBOY);
        System.out.println("ooooooooooooooooooooooooooooooooooo");

        observer.unsubscribe(subscriber6, TIMES);

        observer.notify(TIMES);


    }
}
