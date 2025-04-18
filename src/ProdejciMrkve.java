import java.time.LocalDate;

public class ProdejciMrkve {
    String jmenoProdejce;
    LocalDate datumNarozeniProdejce;
    int pocetDosudSjednanychSmluv;
    boolean seniorniProdejce;

    public ProdejciMrkve(String jmenoProdejce, LocalDate datumNarozeniProdejce, int pocetDosudSjednanychSmluv, boolean seniorniProdejce) {
        this.jmenoProdejce = jmenoProdejce;
        this.datumNarozeniProdejce = datumNarozeniProdejce;
        this.pocetDosudSjednanychSmluv = pocetDosudSjednanychSmluv;
        this.seniorniProdejce = seniorniProdejce;
    }

    public String getJmenoProdejce() {
        return jmenoProdejce;
    }

    public void setJmenoProdejce(String jmenoProdejce) {
        this.jmenoProdejce = jmenoProdejce;
    }

    public LocalDate getDatumNarozeniProdejce() {
        return datumNarozeniProdejce;
    }

    public void setDatumNarozeniProdejce(LocalDate datumNarozeniProdejce) {
        this.datumNarozeniProdejce = datumNarozeniProdejce;
    }

    public int getPocetDosudSjednanychSmluv() {
        return pocetDosudSjednanychSmluv;
    }

    public void setPocetDosudSjednanychSmluv(int pocetDosudSjednanychSmluv) {
        this.pocetDosudSjednanychSmluv = pocetDosudSjednanychSmluv;
    }

    public boolean isSeniorniProdejce() {
        return seniorniProdejce;
    }

    public void setSeniorniProdejce(boolean seniorniProdejce) {
        this.seniorniProdejce = seniorniProdejce;
    }
}
