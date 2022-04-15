package com.test.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    private User user;

    @OneToOne
    private Film film;

    @OneToOne
    private Hall hall;

    @OneToOne
    private Seats seats;

    public Ticket() {
    }

    public Ticket(int id, User user, Film film, Hall hall, Seats seats) {
        this.id = id;
        this.user = user;
        this.film = film;
        this.hall = hall;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && Objects.equals(user, ticket.user) && Objects.equals(film, ticket.film) && Objects.equals(hall, ticket.hall) && Objects.equals(seats, ticket.seats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, film, hall, seats);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", user=" + user +
                ", film=" + film +
                ", hall=" + hall +
                ", seats=" + seats +
                '}';
    }
}
