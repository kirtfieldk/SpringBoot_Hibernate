package com.homes.demo.agent;

import java.util.List;

public interface AgentInterface {
    public List<Agent> getAllAgents();
    public Agent getAgent(int id);

    private String encrypt(String password){
        /* We will encrypt the password here and place into DB */

    }

}
