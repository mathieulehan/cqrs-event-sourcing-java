package mleh.repository.read;

public class UserReadRepository {
    private Map<String, UserAddress> userAddress = new HashMap<>();
    private Map<String, UserContact> userContact = new HashMap<>();
    // accessors and mutators
    public Map<String, UserAddress> getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(Map<String, UserAddress> userAddress) {
        this.userAddress = userAddress;
    }
    public Map<String, UserContact> getUserContact() {
        return userContact;
    }
    public void setUserContact(Map<String, UserContact> userContact) {
        this.userContact = userContact;
    }
}