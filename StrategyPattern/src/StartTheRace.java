
public class StartTheRace {
    public static void main(String[] args) {
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicoptor helicoptor = new Helicoptor();
        Jet jet = new Jet();
        streetRacer.go();
        formulaOne.go();
        helicoptor.go();
        jet.go();
    }
}
