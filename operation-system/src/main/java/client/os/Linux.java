package client.os;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import starter.laptop.Lenovo_TS6;

@Component
@ConditionalOnBean(Lenovo_TS6.class)
public class Linux implements OS {
    @Override
    public void afterPropertiesSet() {
        System.out.println("Linux");
    }
}
