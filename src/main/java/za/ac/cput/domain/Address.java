package za.ac.cput.domain;

import java.util.Comparator;
import java.util.Objects;

public class Address {
    private String street;
    private String city;
    private String state;

    protected Address() {
    }
    private Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public static class Builder{
        private String street;
        private String city;
        private String state;

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }
        public Address build(){
            return new Address(this);

        }
    }
}
