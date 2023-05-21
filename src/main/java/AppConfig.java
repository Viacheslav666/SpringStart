import com.sun.jdi.connect.Transport;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Driver;


@Configuration
public class AppConfig {

    @Bean(name = "audi")
    @Scope("prototype")
    public Car getCarBean() {
        return new Car("Audi");
    }
    @Bean(name = "toyota")
    @Scope("prototype")
    public Pickup getPickupBean() {
        return new Pickup("toyota");
    }
    @Bean(name = "man")
    @Scope("prototype")
    public Bus getBusBean() {
        return new Bus("man");
    }
    @Bean(name = "driver")
    @Qualifier("toyota")
    public Drivers getDriverBean() {
        return new Drivers("Kirill", getCarBean());


    }
    @Bean(name = "driver1")
    @Qualifier("audi")
    public Drivers getDriver1Bean() {
        return new Drivers("Vasia", getBusBean());


    }
    @Bean(name = "driver2")
    @Qualifier("man")
    public Drivers getDriver2Bean() {
        return new Drivers("Anton", getPickupBean());

    }


}
