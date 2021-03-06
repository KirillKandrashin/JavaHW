package models;

import javax.persistence.*;

@Entity
@Table(name="autos")
public class Auto {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    private String model;

    private String color;

    public Auto(){}

    public Auto(String model, String color){
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public User getUser() {
        return user;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", user=" + user +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
