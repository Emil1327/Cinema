package com.test.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.Objects;

@Entity
@Table
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "status")
    private Status status;

    @Column(name = "row")
    private int row;

    @Column(name = "seat")
    private int seat;

    @ManyToOne
    private Hall hall;

    public Seats() {
    }

    public Seats(int id, Status status, int row, int seat, Hall hall) {
        this.id = id;
        this.status = status;
        this.row = row;
        this.seat = seat;
        this.hall = hall;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seats seats = (Seats) o;
        return id == seats.id && row == seats.row && seat == seats.seat && status == seats.status && Objects.equals(hall, seats.hall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, row, seat, hall);
    }

    @Override
    public String toString() {
        return "Seats{" +
                "id=" + id +
                ", status=" + status +
                ", row=" + row +
                ", seat=" + seat +
                ", hall=" + hall +
                '}';
    }
}
