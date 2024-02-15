package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chicken3 {

    private final Pig4 pig4;

    @Autowired
    public Chicken3(Pig4 pig4) {
        this.pig4 = pig4;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a pig, " + pig4.toString();
    }
}

