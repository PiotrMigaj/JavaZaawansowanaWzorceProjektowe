package pl.migibud.wzorceprojektowe.zadania.prototype.cloneexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class Address implements Cloneable{

    private String street;
    private String city;
    private String country;

    public Address(Address address) {
        this.street = address.street;
        this.city = address.city;
        this.country = address.country;
    }

    public Address copy(){
        return new Address(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    protected Address clone(){
        try {
            return (Address) super.clone();
        }catch (CloneNotSupportedException e){
            return new Address(this);
        }
    }
}
