package sg.edu.nus.iss.argocd;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ArgocdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArgocdApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(){
        return args -> {
              log.info("Application Version: V1");
			  //System.out.println("Application Version: V1");
        };
    }

}