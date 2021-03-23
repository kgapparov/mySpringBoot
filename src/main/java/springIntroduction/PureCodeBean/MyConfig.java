package springIntroduction.PureCodeBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet myPet(){
        return new Cat();
    }
    @Bean
    @Scope("singleton")
    public Person myPerson(){
        return new Person(myPet());
    }
}
