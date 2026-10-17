
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Character Manager v0.1 ===");

        Character hero =
            new Character("Arjuna", CharacterType.WARRIOR, 5);
        Character wizard =
            new Character("Merlin", CharacterType.MAGE, 3);
        Character scout =
            new Character("Athena", CharacterType.ARCHER, 4);

        // Menampilkan tiga karakter
        System.out.println(hero);
        System.out.println(wizard);
        System.out.println(scout);

        // Demo level up
        System.out.println();
        System.out.println(">> " + hero.getName() + " level up!");

        hero.setLevel(hero.getLevel() + 1);

        System.out.println("After level up: " + hero);
    }
}
