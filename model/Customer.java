package model;

public class Customer {

    private String cname;
    private String city;
    private String email;

    public Customer(String cname, String city, String email) {
        this.cname = cname;
        this.city = city;
        this.email = email;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
