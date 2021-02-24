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

    @Column(name="username")
    private String username;
    public Agent(
            @JsonProperty("username") String username,
             @JsonProperty("name") String name,
             @JsonProperty("agency") String agency,

             @JsonProperty("id") int id) {
        this.name = name;
        this.username=username;
        this.agency = agency;
        this.id = id;

    }
    public Agent(){}
    public Agent(
             String username, String name, String agency) {
        this.name = name;
        this.username=username;
        this.agency = agency;
        this.id = id;

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


}
