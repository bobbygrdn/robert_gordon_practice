package class_practice.store.address;

public class Address {
    private boolean isPrimaryAdress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;

    public Address(boolean isPrimaryAdress, int streetNumber, String streetName, String city, String state) {
        this.isPrimaryAdress = isPrimaryAdress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    public boolean isPrimaryAdress() {
        return isPrimaryAdress;
    }

    public void setPrimaryAdress(boolean isPrimaryAdress) {
        this.isPrimaryAdress = isPrimaryAdress;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
