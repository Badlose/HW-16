import java.util.Objects;

public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name " + super.getName() +
                ", transgression=" + super.getTransgression() +
                ", witchcraft=" + super.getWitchcraft() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw that = (Ravenclaw) o;
        return mind == that.mind && wisdom == that.wisdom && wit == that.wit
                && creativity == that.creativity
                && Objects.equals(super.getName(), that.getName()) && super.getWitchcraft() == that.getWitchcraft()
                && super.getTransgression() == that.getTransgression();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creativity);
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public int getCharacteristicsSum() {
        return mind + wisdom + wit + creativity;
    }

    public static void compareWithinFaculty(Ravenclaw pupil, Ravenclaw pupil2) {
        if (pupil.getCharacteristicsSum() > pupil2.getCharacteristicsSum()) {
            System.out.println(pupil.getName() + " лучший Когтевранец, чем " + pupil2.getName());
        } else if (pupil2.getCharacteristicsSum() > pupil.getCharacteristicsSum()) {
            System.out.println(pupil2.getName() + " лучший Когтевранец, чем " + pupil.getName());
        } else {
            System.out.println(pupil.getName() + " и " + pupil2.getName() + " равны по силе");
        }
    }
}
