package com.homes.demo.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homes.demo.agent.Agent;
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
    @ManyToOne
    @JoinColumn(name="neighborhood")
    private Neighborhood neborhood;

    @ManyToOne
    @JoinColumn(name="agent")
    private Agent agent;


    @Column(name="price")
    private int price;
    @ManyToOne
    @JoinColumn(name="school")
    private School school;

    @Column(name="description")
    private String description;
    public Home(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Home(
                 String address,
                 int floors,
                 int sqFt,
                 Neighborhood neborhood,
                 School school,
                 int price,
                 Agent agent,
                 String description) {
        this.description = description;
        this.address = address;
        this.school=school;
        this.floors = floors;
        this.sqFt = sqFt;
        this.price=price;
        this.neborhood = neborhood;
        this.agent=agent;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Home(@JsonProperty("id") int id,
                @JsonProperty("address") String address,
                @JsonProperty("floors") int floors,
                @JsonProperty("sq_foot") int sqFt,
                @JsonProperty("neighborhood") Neighborhood neborhood,
                @JsonProperty("agent") Agent agent,
                @JsonProperty("School") School school,
                @JsonProperty("price") int price,
                @JsonProperty("description") String description) {
        this.id = id;
        this.description = description;
        this.address = address;
        this.school=school;
        this.floors = floors;
        this.sqFt = sqFt;
        this.agent = agent;
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
