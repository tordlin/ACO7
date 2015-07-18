package week1.hw1;

/**
 * Created by Tordlin on 13/07/2015.
 */

/*Address: Country, city, street, building*/

public class Address {
    private String country;
    private String city;
    private String street;
    private int building;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public String showAddress() {
        String address = getCountry() + ", " + getCity() + ", " + getStreet() + ", " + getBuilding();
        return address;
    }
}
