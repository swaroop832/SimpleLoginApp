package com.swaroop.spring.sql.database.sqldatabasejdbcjpa.jpa;


import com.swaroop.spring.sql.database.sqldatabasejdbcjpa.loginDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaDao {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public loginDetails findByUserName(String username){
        return entityManager.find(loginDetails.class,username);
    }
    public int addUser(String username, String password){
        return jdbcTemplate.update("insert into login_details (username,password) values (?, ?)",username,password);
    }

}
