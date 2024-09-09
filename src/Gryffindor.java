import java.util.Objects;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name " + super.getName() +
                ", transgression=" + super.getTransgression() +
                ", witchcraft=" + super.getWitchcraft() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery
                && Objects.equals(super.getName(), that.getName()) && super.getWitchcraft() == that.getWitchcraft()
                && super.getTransgression() == that.getTransgression();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int getCharacteristicsSum() {
        return nobility + honor + bravery;
    }

    public static void compareWithinFaculty(Gryffindor pupil, Gryffindor pupil2) {
        if (pupil.getCharacteristicsSum() > pupil2.getCharacteristicsSum()) {
            System.out.println(pupil.getName() + " лучший Гриффиндорец, чем " + pupil2.getName());
        } else if (pupil2.getCharacteristicsSum() > pupil.getCharacteristicsSum()) {
            System.out.println(pupil2.getName() + " лучший Гриффиндорец, чем " + pupil.getName());
        } else {
            System.out.println(pupil.getName() + " и " + pupil2.getName() + " равны по силе");
        }
    }
}
