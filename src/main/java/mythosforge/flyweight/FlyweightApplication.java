package mythosforge.flyweight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightApplication implements CommandLineRunner {

    @Autowired
    private FontFactory fontFactory;

    public static void main(String[] args) {
        SpringApplication.run(FlyweightApplication.class, args);
    }

    @Override
    public void run(String... args) {
        FontFlyweight arialBold12 = 	fontFactory.getFont("Arial", 12, "Bold");
        FontFlyweight timesBold12 = 	fontFactory.getFont("Times", 12, "Bold");
        FontFlyweight arialBold12_2 = 	fontFactory.getFont("Arial", 12, "Bold");

        // arialBold12 e arialBold12_2 referem-se ao mesmo objeto compartilhado
        System.out.println("arialBold12 == arialBold12_2? " 
                           + (arialBold12 == arialBold12_2));
        arialBold12.apply('A');
        timesBold12.apply('B');
    }
}