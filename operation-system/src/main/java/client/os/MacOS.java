package client.os;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import starter.laptop.HP_MD4;

@Component
@ConditionalOnBean(HP_MD4.class)
public class MacOS implements OS {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MacOs");
    }
}
