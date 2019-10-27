package observer.postoffice;

import observer.publishers.Periodicals;
import observer.subscribers.SubscriberImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Observer {
    private Map<Periodicals, List<SubscriberImpl>> listeners = new HashMap<>();

    public Observer(Periodicals... types) {
        for (Periodicals operation : types) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }


    public void subscribe(SubscriberImpl listener, Periodicals... types) {
        for (Periodicals type : types) {
            List<SubscriberImpl> users = listeners.get(type);
            users.add(listener);
        }
    }

    public void unsubscribe(SubscriberImpl listener, Periodicals... types) {
        for (Periodicals type : types) {
            List<SubscriberImpl> users = listeners.get(type);
            users.remove(listener);
        }
    }

    public void notify(Periodicals... types) {
        for (Periodicals type : types) {
            if (listeners.containsKey(type)) {
                for (SubscriberImpl subscriber : listeners.get(type)) {
                    subscriber.update(type.getName());
                }
            }

        }
    }
}
