package com.homes.demo.agent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homes.demo.neighborhood.Neighborhood;

import javax.persistence.*;

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

    public Agent(
             @JsonProperty("name") String name,
             @JsonProperty("agency") String agency,
             @JsonProperty("neighborhood") Neighborhood neighborhood,
             @JsonProperty("id") int id) {
        this.name = name;
        this.agency = agency;
        this.id = id;
        this.neighborhood = neighborhood;
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
