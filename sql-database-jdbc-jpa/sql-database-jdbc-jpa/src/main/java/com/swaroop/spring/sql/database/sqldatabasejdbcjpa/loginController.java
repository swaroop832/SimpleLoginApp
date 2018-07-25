package com.swaroop.spring.sql.database.sqldatabasejdbcjpa;


import com.swaroop.spring.sql.database.sqldatabasejdbcjpa.jpa.PersonJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginController {


    @Autowired
    private PersonJpaDao personJpaDao;

    @GetMapping(value = "/getUser", params = {"username"})
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody loginDetails findbyUserName(@RequestParam(value = "username") String username){
        loginDetails loginDetail = personJpaDao.findByUserName(username);
        if(loginDetail != null)
            return loginDetail;
        else
            return null;
    }
    @GetMapping(value = "/addUser", params = {"username", "password"})
    @CrossOrigin(origins = "http://localhost:4200")
    public int addloginDetails(@RequestParam(value = "username") String username, @RequestParam(value="password") String password){
       return personJpaDao.addUser(username,password);
    }

}
