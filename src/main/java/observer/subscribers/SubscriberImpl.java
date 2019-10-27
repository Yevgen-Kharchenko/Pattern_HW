package observer.subscribers;

import java.util.List;

public class SubscriberImpl implements Subscriber {
    private String name;
    private String address;

    public SubscriberImpl(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void update(String news) {
        System.out.printf("Name: %s\nAddress: %s\nHas received a new %s\n",name,address,news);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
