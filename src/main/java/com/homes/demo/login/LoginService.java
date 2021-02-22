package com.homes.demo.login;

import com.homes.demo.Database.Database;
import com.homes.demo.agent.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService implements LoginInterface{
    @Autowired
    private Database db;

    public LoginService(Database db) {
        this.db = db;
    }

    @Override
    public LoginToken login(String username) {
        List<Agent> agent = this.db.executeQuery("from Agent a where a.username="+username);
        return null;
    }
}
