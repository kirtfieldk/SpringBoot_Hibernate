package com.homes.demo.home;

import com.homes.demo.Database.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeService implements HomeInterface {
    @Autowired
    private Database db;

    public HomeService(Database db) {
        this.db = db;
    }

    @Override
    public List<Home> getAllHomes() {
        return this.db.executeQuery("from Home");
    }

    @Override
    public Home getHome(int id) {
        return (Home) this.db.getSingleItem(Home.class, id);
    }

    @Override
    public List<Home> getHomesInNeighborhood(int id) {
        return this.db.executeQuery("from Home where Neghborhood.id="+id);
    }

    @Override
    public List<Home> getHomeInSchool(int id) {
        return this.db.executeQuery("from Home where School.id="+id);
    }

    @Override
    public Home addHome(Home hm) {
        return (Home) this.db.addObject(hm);
    }

    @Override
    public void deleteHome(int id) {
        this.db.deleteObject(Home.class, id);
    }

    @Override
    public Home updateHome(int id) {
        return null;
    }
}
