package com.homes.demo.school;

import com.homes.demo.Database.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolService implements SchoolInterface {
    @Autowired
    private Database db;

    public SchoolService(Database db) {
        this.db = db;
    }

    @Override
    public List<School> getAllSchools() {
        return this.db.executeQuery("from School");
    }

    @Override
    public School getSchool(int id) {
        return (School) this.db.getSingleItem(School.class,id);
    }

    @Override
    public School addSchool(School school) {
        return (School) this.db.addObject(school);
    }

    @Override
    public void deleteSchool(int id) {
        this.db.deleteObject(School.class, id);
    }

    @Override
    public School updateSchool(int id) {
        return null;
    }
}
