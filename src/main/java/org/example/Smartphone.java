package org.example;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {
    private String phoneName;
    private String brandName;
    private Friend contactArray[];

    public boolean startRadio(){
        System.out.println("Radio started");
        boolean radioOn = true;
        return(radioOn);
    }

    public boolean stopRadio(){
        System.out.println("Radio stopped");
        boolean radioOn = false;
        return(radioOn);
    }

    public String getPosition(){
        String position = "Köln";
        return position;
    }

    public Smartphone() {
    }

    public Smartphone(String phoneName, String brandName, Friend[] contactArray) {
        this.phoneName = phoneName;
        this.brandName = brandName;
        this.contactArray = contactArray;
    }


    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Friend[] getContactArray() {return contactArray;
    }

    public void setContactArray(Friend[] contactArray) {
        this.contactArray = contactArray;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "phoneName='" + phoneName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", contactArray=" + Arrays.toString(contactArray) +
                '}';
    }
}
