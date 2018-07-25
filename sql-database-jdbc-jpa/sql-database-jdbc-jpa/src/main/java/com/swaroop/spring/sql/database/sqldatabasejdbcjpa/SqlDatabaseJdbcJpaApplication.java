package com.swaroop.spring.sql.database.sqldatabasejdbcjpa;

import com.swaroop.spring.sql.database.sqldatabasejdbcjpa.jpa.PersonJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SqlDatabaseJdbcJpaApplication  implements CommandLineRunner {
	@Autowired
	private loginController loginController;

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SqlDatabaseJdbcJpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(loginController.findbyUserName("swaroop1"));
	}
}
