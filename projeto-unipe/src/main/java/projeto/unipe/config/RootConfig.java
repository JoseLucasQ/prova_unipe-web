package projeto.unipe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("projeto.unipe")
@EnableWebMvc
public class RootConfig {

}
