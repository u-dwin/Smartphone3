package org.example;

public abstract class Contact {
    private String contactName;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Contact(String contactName) {
        this.contactName = contactName;
    }

    public Contact(){
    }
}
