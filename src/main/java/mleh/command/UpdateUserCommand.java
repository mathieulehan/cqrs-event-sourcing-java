package mleh.command;

import mleh.domain.write.Address;
import mleh.domain.write.Contact;

public class UpdateUserCommand {
    private String userId;
    private Set<Address> addresses;
    private Set<Contact> contacts;
}