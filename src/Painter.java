
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.paint.Color;

public class Painter {

    public static void main(String[] args) {
        Paintbrush<String> pb1 = new Paintbrush<>("red");
        Paintbrush<Color> pb2 = new Paintbrush<>(Color.BLANCHEDALMOND);

        List<Paintbrush> pbList = new ArrayList();

        Map<String, String> animalFoodMap = new HashMap<String, String>();

        animalFoodMap.put("chicken", "corn");
        animalFoodMap.put("pigs", "bacon");
        animalFoodMap.put("teenager", "pizza");

        String key = "pigs";
        animalFoodMap.get(key); //returns bacon

        animalFoodMap.containsKey("cow"); // returns false

        Map<Color, Paintbrush> brushes = new HashMap();
        brushes.put(Color.AQUA, pb2);

    }
}
