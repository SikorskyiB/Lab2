import com.necklace.Necklace;
import com.precious_stones.PreciousStone;
import com.precious_stones.implementation.Diamond;
import com.precious_stones.implementation.Emerald;
import com.precious_stones.implementation.Ruby;
import com.precious_stones.implementation.Sapphire;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PreciousStone diamond1 = new Diamond(98, 1200, 5);
        PreciousStone diamond2 = new Diamond(99, 1500, 2);
        PreciousStone emerald = new Emerald(55, 500, 10.0);
        PreciousStone ruby = new Ruby(75, 140, 7.0);
        PreciousStone sapphire = new Sapphire(60, 590, 5.4);
        List<PreciousStone> stones = List.of(diamond1, diamond2, emerald, ruby, sapphire);

        Necklace necklace = new Necklace(stones);

        System.out.println("Створюємо намисто:\n\t" + necklace);

        System.out.println("Вага намиста: " + necklace.getWeight() + "CD");

        System.out.println("Вартість намиста: " + necklace.getPrice() + "$");

        System.out.print("Цінність (колекційна) каміння в намисті:\n\t");
        necklace.displayValues();

        System.out.print("Відсортоване по цінності каміння:\n\t");
        necklace.sortByValue();
        necklace.displayValues();

        System.out.println("Каміння в межах прозорості 10-80:\n\t" + necklace.findInTransparencyRange(10, 80));

    }


}