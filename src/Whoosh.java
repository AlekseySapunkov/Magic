import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Whoosh {
    public static void main(String[] args) {
       String isMugle = """
               Yes 
               But
               """;
       String isTeacher = "true";
        System.out.println(isMugle.indexOf("Yes"));
        castSpell();

    }
    public static void castSpell() {
    String spell =  "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
    String spellToLow = spell.toLowerCase();
    int start = new Random().nextInt(0,50);
    String substring = spellToLow.substring(start);
    StringBuilder spellSub = new StringBuilder(substring);
    spellSub.reverse();
        System.out.println(spellSub);
    }
}