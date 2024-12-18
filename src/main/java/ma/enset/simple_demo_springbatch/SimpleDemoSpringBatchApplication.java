package ma.enset.simple_demo_springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimpleDemoSpringBatchApplication {

    public static void main(String[] args) {
        System.out.println("FILE : " + new ClassPathResource("orders.csv").exists());

        SpringApplication.run(SimpleDemoSpringBatchApplication.class, args);
    }

}
