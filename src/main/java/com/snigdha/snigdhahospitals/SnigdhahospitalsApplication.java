package com.snigdha.snigdhahospitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import com.snigdha.snigdhahospitals.dao.UserDao;

@SpringBootApplication
public class SnigdhahospitalsApplication implements CommandLineRunner{

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(SnigdhahospitalsApplication.class, args);
        System.out.println("started . . . . ");
    }

	// Configure a JdbcTemplate bean
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.userDao.createTable());
	}
}
