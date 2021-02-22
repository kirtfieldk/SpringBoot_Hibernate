package com.homes.demo.agent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homes.demo.neighborhood.Neighborhood;

import javax.persistence.*;
/*
    Agent object -> the powerhouse // Once logged in can
    create, edit, and delete listings
 */
@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="agent_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name="agency")
    private String agency;
    @OneToOne
    @JoinColumn(name="neighborhood")
    private Neighborhood neighborhood;
    @Column(name="username")
    private String username;
    public Agent(
            @JsonProperty("username") String username,
             @JsonProperty("name") String name,
             @JsonProperty("agency") String agency,
             @JsonProperty("neighborhood") Neighborhood neighborhood,
             @JsonProperty("id") int id) {
        this.name = name;
        this.username=username;
        this.agency = agency;
        this.id = id;
        this.neighborhood = neighborhood;
    }
    public Agent(
             String username, String name, String agency, Neighborhood neighborhood) {
        this.name = name;
        this.username=username;
        this.agency = agency;
        this.id = id;
        this.neighborhood = neighborhood;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }
}
