package mvc1.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan //서블릿 자동 등록
@SpringBootApplication
public class Mvc1ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(Mvc1ServletApplication.class, args);
    }

}
