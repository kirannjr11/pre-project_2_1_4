package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pig4 {
    private Lamb5 lamb5;

@Autowired
    public void setLamb5(Lamb5 lamb) {
        this.lamb5 = lamb;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a lamb, " +lamb5.toString();
    }
}
