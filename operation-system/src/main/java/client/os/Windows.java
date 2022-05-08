package client.os;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;
import starter.laptop.Lenovo_TS6;


@Component
@ConditionalOnMissingBean(Lenovo_TS6.class)
public class Windows implements OS {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Windows");
    }
}
