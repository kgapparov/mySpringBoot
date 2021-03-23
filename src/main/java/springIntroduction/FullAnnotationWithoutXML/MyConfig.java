package springIntroduction.FullAnnotationWithoutXML;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("springintroduction.FullAnnotationWithoutXML")
public class MyConfig {
}
