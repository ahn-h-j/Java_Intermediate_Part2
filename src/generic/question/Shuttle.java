package generic.question;

public class Shuttle<T extends BioUnit> {
    T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public void showInfo() {
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }
}
