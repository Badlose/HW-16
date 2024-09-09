import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honor;

    public Hufflepuff(String name, int witchcraft, int transgression, int industriousness, int loyalty, int honor) {
        super(name, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name " + super.getName() +
                ", transgression=" + super.getTransgression() +
                ", witchcraft=" + super.getWitchcraft() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honor == that.honor
                && Objects.equals(super.getName(), that.getName()) && super.getWitchcraft() == that.getWitchcraft()
                && super.getTransgression() == that.getTransgression();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honor);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public int getCharacteristicsSum() {
        return industriousness + loyalty + honor;
    }

    public static void compareWithinFaculty(Hufflepuff pupil, Hufflepuff pupil2) {
        if (pupil.getCharacteristicsSum() > pupil2.getCharacteristicsSum()) {
            System.out.println(pupil.getName() + " лучший Пуффендуец, чем " + pupil2.getName());
        } else if (pupil2.getCharacteristicsSum() > pupil.getCharacteristicsSum()) {
            System.out.println(pupil2.getName() + " лучший Пуффендуец, чем " + pupil.getName());
        } else {
            System.out.println(pupil.getName() + " и " + pupil2.getName() + " равны по силе");
        }
    }
}
