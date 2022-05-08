package starter.laptop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.laptop",havingValue = "macbookair")
public class MacBookAir implements Laptop {
    @Override
    public void afterPropertiesSet() {
        System.out.println("MacBookAir");
    }
}
