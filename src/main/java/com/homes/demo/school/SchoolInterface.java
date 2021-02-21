package com.homes.demo.school;

import java.util.List;

public interface SchoolInterface {
    public List<School> getAllSchools();
    public School getSchool(int id);
    public School addSchool(School school);
    public void deleteSchool(int id);
    public School updateSchool(int id);

}
