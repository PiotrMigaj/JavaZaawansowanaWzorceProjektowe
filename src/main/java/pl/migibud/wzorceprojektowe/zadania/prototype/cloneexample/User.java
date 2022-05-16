package pl.migibud.wzorceprojektowe.zadania.prototype.cloneexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
public class User {

    private String firstName;
    private String lastName;
    private Address address;

    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.address = user.address.copy();
    }

    public User copy(){
        return new User(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected User clone() {
        User user = null;
        try {
            user = (User) super.clone();
        }catch (CloneNotSupportedException e){
            user = new User(this);
        }
        user.address = this.address.clone();
        return user;
    }
}
