package com.homes.demo.home;

import java.util.List;

public interface HomeInterface {
    public List<Home> getAllHomes();
    public Home getHome(int id);
    public List<Home> getHomesInNeighborhood(int id);
    public List<Home> getHomeInSchool(int id);
    public Home addHome(Home hm);
    public void deleteHome(int id);
    public Home updateHome(int id);
}
