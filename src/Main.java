import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String jmenoProdejce;
        LocalDate datumNarozeniProdejce;
        int pocetDosudSjednanychSmluv;
        boolean seniorniProdejce;

        ProdejciMrkve prvniZelinar = new ProdejciMrkve(
                "Karel Mrkvička",
                LocalDate.of(1970, 10, 3),
                147,
                true
        );

        ProdejciMrkve druhyZelinar = new ProdejciMrkve(
                "Petr Karotka",
                LocalDate.of(1990, 10, 3),
                147,
                false
        );

        System.out.println(prvniZelinar.getJmenoProdejce());
        System.out.println(druhyZelinar.getJmenoProdejce());

    }
}