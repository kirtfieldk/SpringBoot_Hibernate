package com.homes.demo.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homes.demo.neighborhood.Neighborhood;
import com.homes.demo.school.School;

import javax.persistence.*;

@Entity
@Table(name="home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="home_id")
    private int id;

    @Column(name="address")
    private String address;

    @Column(name="floors")
    private int floors;

    @Column(name="sqft")
    private int sqFt;
    @OneToOne
    @JoinColumn(name="neighborhood")
    private Neighborhood neborhood;

    @Column(name="price")
    private int price;
    @OneToOne
    @JoinColumn(name="school")
    private School school;
    public Home(){}
    public Home(@JsonProperty("id") int id,
                @JsonProperty("address") String address,
                @JsonProperty("floors") int floors,
                @JsonProperty("sq_foot") int sqFt,
                @JsonProperty("neborhood") Neighborhood neborhood,
                @JsonProperty("School") School school,
                @JsonProperty("price") int price) {
        this.id = id;
        this.address = address;
        this.school=school;
        this.floors = floors;
        this.sqFt = sqFt;
        this.price=price;
        this.neborhood = neborhood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public Neighborhood getNeborhood() {
        return neborhood;
    }

    public void setNeborhood(Neighborhood neborhood) {
        this.neborhood = neborhood;
    }
}
