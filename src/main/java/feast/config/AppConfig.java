package feast.config;

import feast.models.Chicken3;
import feast.models.Duck2;
import feast.models.Goat6;
import feast.models.Horse7;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "feast")
public class AppConfig {

    @Bean
    public static Duck2 getDuck(Chicken3 chicken) {
        return new Duck2(chicken);
    }

    @Bean
    public static Goat6 getHorse(Horse7 horse) {
        return new Goat6(horse);
    }
}
