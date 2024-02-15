package feast;

import feast.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        TraditionalFeast traditionalFeast = applicationContext.getBean(TraditionalFeast.class);
        System.out.println(traditionalFeast.getTraditionalFeast());
    }
}
