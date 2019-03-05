package spring.study.startup.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ConfigTest {
    private int port;
    private String host;

    @Bean
    public Boolean testBoolean(){
      log.info("加载bean");
      return new Boolean(true);
    }
}
