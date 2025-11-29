package mleh.domain.write;

public class UserContactAddedEvent extends Event {
    private String contactType;
    private String contactDetails;

    public String getContactType() {
        return contactType;
    }
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
    public String getContactDetails() {
        return contactDetails;
    }
    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}   
