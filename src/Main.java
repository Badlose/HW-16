public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 12, 13, 14, 15, 16);
        System.out.println("harry = " + harry);

        Gryffindor hermione = new Gryffindor("Hermione Jean Granger", 99, 1, 88, 77, 66);
        Gryffindor ron = new Gryffindor("Ronald Bilius Weasley", 1, 2, 50, 99, 9);

        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 22, 23, 24, 25, 26);
        System.out.println("cedric = " + cedric);

        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 50, 51, 52, 53, 54);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 23, 24, 25, 26, 27);

        Ravenclaw cho = new Ravenclaw("Cho Chang", 32, 33, 34, 35, 36, 37);
        System.out.println("cho = " + cho);

        Ravenclaw padma = new Ravenclaw("Padma Patil", 61, 62, 63, 64, 65, 66);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 31, 32, 33, 34, 35, 36);

        Slytherin draco = new Slytherin("Draco Lucius Malfoy", 42, 43, 44, 45, 46, 47, 48);
        System.out.println("draco = " + draco);

        Slytherin graham = new Slytherin("Graham Montague", 11, 11, 11, 11, 11, 11, 11);
        Slytherin gregory = new Slytherin("Gregory Goyle", 12, 12, 12, 12, 12, 12, 12);

        Gryffindor.compareWithinFaculty(harry, hermione);
        System.out.println();

        Hufflepuff.compareWithinFaculty(cedric, zacharias);
        System.out.println();

        Ravenclaw.compareWithinFaculty(cho, padma);
        System.out.println();

        Slytherin.compareWithinFaculty(draco, graham);
        Slytherin.compareWithinFaculty(draco, draco);
        System.out.println();

        Hogwarts.getStrongestPupil(draco, harry);
        System.out.println();
    }
}