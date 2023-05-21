import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Drivers {
    private String name;
    private Transport transport;

//    @Autowired
//    public void setTranspot(@Qualifier("getBusBean") Transport transport) {
//        this.transport = transport;
//    }
//    @Autowired
//    public void setTranspot1(@Qualifier("getCarBean") Transport transport) {
//        this.transport = transport;
//    }
//    @Autowired
//    public void setTranspot2(@Qualifier("getPickupBean") Transport transport) {
//        this.transport = transport;
//    }

}
