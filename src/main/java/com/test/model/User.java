package com.test.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "phoneNumber")
    private int number;

    @NotNull
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    public User() {
    }

    public User(int id, int number, String email) {
        this.id = id;
        this.number = number;
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && number == user.number && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}
