import java.util.Objects;

public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int firstForPower;

    public Slytherin(String name, int witchcraft, int transgression, int trick, int determination,
                     int ambition, int resourcefulness, int firstForPower) {
        super(name, witchcraft, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.firstForPower = firstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name " + super.getName() +
                ", transgression=" + super.getTransgression() +
                ", witchcraft=" + super.getWitchcraft() +
                ", trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", firstForPower=" + firstForPower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin that = (Slytherin) o;
        return trick == that.trick && determination == that.determination && ambition == that.ambition
                && resourcefulness == that.resourcefulness && firstForPower == that.firstForPower
                && Objects.equals(super.getName(), that.getName()) && super.getWitchcraft() == that.getWitchcraft()
                && super.getTransgression() == that.getTransgression();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trick, determination, ambition, resourcefulness, firstForPower);
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getFirstForPower() {
        return firstForPower;
    }

    public void setFirstForPower(int firstForPower) {
        this.firstForPower = firstForPower;
    }

    @Override
    public int getCharacteristicsSum() {
        return trick + determination + ambition + resourcefulness + firstForPower;
    }

    public static void compareWithinFaculty(Slytherin pupil, Slytherin pupil2) {
        if (pupil.getCharacteristicsSum() > pupil2.getCharacteristicsSum()) {
            System.out.println(pupil.getName() + " лучший Слизеринец, чем " + pupil2.getName());
        } else if (pupil2.getCharacteristicsSum() > pupil.getCharacteristicsSum()) {
            System.out.println(pupil2.getName() + " лучший Слизеринец, чем " + pupil.getName());
        } else {
            System.out.println(pupil.getName() + " и " + pupil2.getName() + " равны по силе");
        }
    }
}
