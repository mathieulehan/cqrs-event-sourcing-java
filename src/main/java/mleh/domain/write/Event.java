package mleh.domain.write;

public abstract class Event {
    public final UUID id = UUID.randomUUID();
    public final Date created = new Date();
}
