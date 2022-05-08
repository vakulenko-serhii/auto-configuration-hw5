package starter.laptop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.laptop",havingValue = "Lenovo_TS6")
public class Lenovo_TS6 implements Laptop {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Lenovo_TS6");
    }
}
