package mleh.repository.write;

public class EventStore {
    private Map<String, List<Event>> store = new HashMap<>();

    public Map<String, List<Event>> getStore() {
        return store;
    }

    public void setStore(Map<String, List<Event>> store) {
        this.store = store;
    }
}
