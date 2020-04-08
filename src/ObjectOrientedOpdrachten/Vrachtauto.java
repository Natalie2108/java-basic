package ObjectOrientedOpdrachten;

public class Vrachtauto extends Auto {
    private int laadvermogen;

    public Vrachtauto(String merk, String kleur) {
        super(merk, kleur);
        this.laadvermogen = laadvermogen;
    }

    public int getLaadvermogen() {
        return laadvermogen;
    }

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
    }

    @Override
    public void rijden() {
        snelheid += 2;
    }

    @Override
    public void remmen() {
        snelheid += 2;
    }
}
