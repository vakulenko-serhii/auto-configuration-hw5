package starter.laptop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "my.laptop",havingValue = "hp_md4")
public class HP_MD4 implements Laptop {
    @Override
    public void afterPropertiesSet(){
        System.out.println("HP_MD4");
    }
}
