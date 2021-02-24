package com.homes.demo.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homes.demo.agent.Agent;

import javax.persistence.*;

@Entity
@Table(name="login_info")
public class LoginCreds {
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @OneToOne
    @JoinColumn(name="agent")
    private Agent agent;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LoginCreds(){}
    public LoginCreds(@JsonProperty("username") String username, @JsonProperty("password") String password) {
        this.username = username;
        this.password = password;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public LoginCreds(@JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("Agent") Agent agent){
        this.password=password;
        this.username=username;
        this.agent=agent;
    }
}
