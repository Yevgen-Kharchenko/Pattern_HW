package observer.publishers;

public enum Periodicals {
    TIMES("Times"),
    COSMO("Cosmopolitan"),
    PLAYBOY("PlayBoy");

    private final String name;

    Periodicals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
