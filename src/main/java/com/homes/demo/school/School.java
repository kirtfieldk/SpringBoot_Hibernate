package com.homes.demo.school;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

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

    public School(@JsonProperty("id") int id,
                  @JsonProperty("name") String namel,
                  @JsonProperty("city") String city,
                  @JsonProperty("address") String address) {

        this.id = id;
        this.namel = namel;
        this.city = city;
        this.address = address;
    }
}
