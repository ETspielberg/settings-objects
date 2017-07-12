package unidue.ub.settings.fachref;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Eike on 05.07.2017.
 */
@Entity
public class StockcontrolUser {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String stockcontrol;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStockcontrol() {
        return stockcontrol;
    }

    public void setStockcontrol(String stockcontrol) {
        this.stockcontrol = stockcontrol;
    }
}
