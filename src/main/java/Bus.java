import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
@EqualsAndHashCode
public class Bus extends Transport{

    Bus(String name) {
        super(name);
    }

    @Override
    public void check(Transport transport) {
        System.out.println(transport + "готов к работе");
    }
}
