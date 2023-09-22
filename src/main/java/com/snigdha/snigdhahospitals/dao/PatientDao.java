package com.snigdha.snigdhahospitals.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate; 

    public PatientDao(){

    }

    // table creation
    public int createTable(){
        String query="CREATE TABLE IF NOT EXISTS patient(id int primary key ,name varchar(200),phone bigint,dob date,blood varchar(10))";
        int update = this.jdbcTemplate.update(query);
        System.out.println("Contructor called !"+ update);
        return update;  
    }
    
}
