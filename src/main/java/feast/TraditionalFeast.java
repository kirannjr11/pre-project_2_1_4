package feast;

import feast.models.Fish1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TraditionalFeast {

    private Fish1 fish;

    public String getTraditionalFeast() {
        return "Traditional Bedouin Wedding Feast consists of stuffing " + fish.toString();
    }

    @Autowired
    public void setFish(Fish1 fish) {
        this.fish = fish;
    }
}
