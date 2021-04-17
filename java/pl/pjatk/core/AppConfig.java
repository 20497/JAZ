package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public MySimplePojo mySimplePojo()
    {
        System.out.println("Hello from mySimplePojo");
        return new MySimplePojo("pojo", 10);
    }

    @Bean
    public List<String> defaultData()
    {
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    public List<String> otherDefaultData()
    {
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    @ConditionalOnProperty(value="my.homework.property", havingValue = "true")
    public String homeworkBean()
    {
        return "Profil ze zmienną o wartości true";
    }
}
