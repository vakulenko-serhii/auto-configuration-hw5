package starter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import starter.laptop.Laptop;


@Configuration
@ComponentScan(basePackageClasses = Laptop.class)
public class LaptopConfig {
}
