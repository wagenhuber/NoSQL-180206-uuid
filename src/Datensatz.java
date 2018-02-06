import java.util.UUID;

public abstract class Datensatz {

    private final UUID id;

    public Datensatz() {
        this.id = UUID.randomUUID();
    }

    public Datensatz(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
