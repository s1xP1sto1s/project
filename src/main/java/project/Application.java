package project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {
	
	@Autowired
	public static JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
//		SpringApplication.run(Application.class, args);
		jdbcTemplate.update("insert into USER(name,age) values(?, ?)", "james", 20);
	}
}