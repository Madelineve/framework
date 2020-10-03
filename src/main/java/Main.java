
import controller.PageController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@ComponentScan(basePackageClasses = PageController.class)
@EntityScan(basePackages = "model")
@EnableJpaRepositories(basePackages = "repository")
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

}