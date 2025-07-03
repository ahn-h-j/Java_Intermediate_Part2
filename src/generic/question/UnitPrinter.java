package generic.question;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle1) {
        System.out.println("이름 : " + shuttle1.unit.getName() + ", HP : " + shuttle1.unit.getHp());
    }

    public static void printV2(Shuttle<?> shuttle1) {
        System.out.println("이름 : " + shuttle1.unit.getName() + ", HP : " + shuttle1.unit.getHp());
    }
}
