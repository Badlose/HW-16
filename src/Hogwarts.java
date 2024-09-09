import java.util.Objects;

public abstract class Hogwarts {
    private int witchcraft;
    private int transgression;
    private final String name;

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return witchcraft == hogwarts.witchcraft && transgression == hogwarts.transgression &&
                Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(witchcraft, transgression, name);
    }


    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public abstract int getCharacteristicsSum();

    public static void getStrongestPupil(Hogwarts pupil, Hogwarts pupil2) {
        if (pupil.getTransgression() > pupil2.getTransgression()) {
            System.out.println("Расстояние для трансгрессии у " + pupil.getName() + " больше чем у " + pupil2.getName());
        } else if (pupil2.getTransgression() > pupil.getTransgression()) {
            System.out.println("Расстояние для трансгрессии у " + pupil2.getName() + " больше чем у " + pupil.getName());
        } else {
            System.out.println("Расстояние для трансгрессии у " + pupil.getName() + " и у " + pupil2.getName() + "одинаковое");
        }
        if (pupil.getWitchcraft() > pupil2.getWitchcraft()) {
            System.out.println(pupil.getName() + " обладает бОльшей мощностью магии, чем " + pupil2.getName());
        } else if (pupil2.getWitchcraft() > pupil.getWitchcraft()) {
            System.out.println(pupil2.getName() + " обладает бОльшей мощностью магии, чем " + pupil.getName());
        } else {
            System.out.println("Мощность магии у " + pupil.getName() + " и у " + pupil2.getName() + "одинаковая");
        }
    }

}
