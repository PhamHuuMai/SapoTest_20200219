package vn.com.sapo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vn.com.sapo.service.ConfigService;

@SpringBootApplication
public class SapoMaiPhVoucherServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SapoMaiPhVoucherServiceApplication.class, args);
        init(context);
    }

    public static void init(ConfigurableApplicationContext context) {
        ConfigService configService = context.getBean(ConfigService.class);
        if (configService != null) {
            configService.initConfig();
        }
    }
}
