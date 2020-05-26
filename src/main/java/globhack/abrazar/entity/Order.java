package globhack.abrazar.entity;

import java.sql.Date;


import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private Date date;

    //#region Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    //#endregion
    
    //#region
    public Order() {
    }
    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
    }
    //#endregion
}