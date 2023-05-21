import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        car.check(car);
        Bus bus = context.getBean(Bus.class);
        bus.check(bus);
        Pickup pickup = context.getBean(Pickup.class);
        pickup.check(pickup);
        Drivers drivers = context.getBean("driver",Drivers.class);
        Drivers drivers1 = context.getBean("driver1",Drivers.class);
        Drivers drivers2 = context.getBean("driver2",Drivers.class);
        System.out.println(drivers);
        System.out.println(drivers1);
        System.out.println(drivers2);
        context.close();
    }
}