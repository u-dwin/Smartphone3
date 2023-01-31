package org.example;

public class Friend extends Contact {
    private long phoneNumber;

    public Friend(long phoneNumber, String contactName) {
        super.setContactName(contactName);
        this.phoneNumber = phoneNumber;
    }

    public Friend(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                ", contactName='" + getContactName() + '\'' +
                '}';
    }
}
