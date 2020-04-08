package ObjectOrientedOpdrachten;

public class Auto implements Voertuig{
    private String merk;
    private String kleur;

    protected int snelheid;

    public Auto(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void rijden(){
        snelheid = snelheid + 4;
    }
    public void remmen(){
        snelheid = snelheid - 4;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "merk='" + merk + '\'' +
                ", kleur='" + kleur + '\'' +
                ", snelheid=" + snelheid +
                '}';
    }
}

