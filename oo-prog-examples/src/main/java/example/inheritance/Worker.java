package example.inheritance;

import java.math.BigDecimal;

/**
 * Created by jens on 04.07.17.
 */
public class Worker extends Employee {

    @Override
    public BigDecimal calculateSalary() {
        return BigDecimal.TEN;
    }


}
