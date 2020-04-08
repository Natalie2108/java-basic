package ObjectOrientedOpdrachten;

public class RaceAuto extends Auto {
    private int topSnelheid;
    public RaceAuto(String merk, String kleur) {
        super(merk, kleur);
        this.topSnelheid = topSnelheid;
    }
    public int getTopSnelheid() {
        return topSnelheid;
    }

    public void setTopSnelheid(int topSnelheid) {
        this.topSnelheid = topSnelheid;
    }


}
