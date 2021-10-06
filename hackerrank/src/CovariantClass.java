import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
    String whatsYourName(){
        return "Flower";
    }
}

class Jasmine extends Flower{
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    String whatsYourName(){
        return "Jasmine";
    }
}

class Region {
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    Lily yourNationalFlower(){
        return new Lily();
    }
}

class AndhraPradesh extends Region{
    Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}
public class CovariantClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());

    }
}
