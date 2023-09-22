package com.snigdha.snigdhahospitals.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate; 

    public UserDao(){

    }

    // table creation
    public int createTable(){
        String query="CREATE TABLE IF NOT EXISTS Blabla(id int primary key,name varchar(200),age int,city varchar(100) )";
        int update = this.jdbcTemplate.update(query);
        System.out.println("Contructor called !"+ update);
        return update;  
    }
}
