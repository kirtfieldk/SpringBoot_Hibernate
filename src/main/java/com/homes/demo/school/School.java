package com.homes.demo.school;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homes.demo.neighborhood.Neighborhood;

import javax.persistence.*;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="school_id")
    private int id;

    @OneToOne
    @JoinColumn(name="neighborhood")
    private Neighborhood neighborhood;

    @Column(name="name")
    private String namel;

    @Column(name="city")
    private String city;

    @Column(name="address")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public School(
                  String namel,
                  String city,
                  String address,
                  Neighborhood neighborhood) {
        this.namel = namel;
        this.city = city;
        this.address = address;
        this.neighborhood=neighborhood;
    }

    public School(@JsonProperty("id") int id,
                  @JsonProperty("name") String namel,
                  @JsonProperty("city") String city,
                  @JsonProperty("address") String address,
                  Neighborhood neighborhood) {

        this.id = id;
        this.namel = namel;
        this.city = city;
        this.address = address;
        this.neighborhood=neighborhood;
    }
}
