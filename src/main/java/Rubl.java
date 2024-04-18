public class Rubl {
    public String rubel(final double coast) {
        double ost = coast % 100;
        if ((11 <= ost) && (ost < 19)) {
            return "рублей";
        }
        ost = ost % 10;
        if ((5 <= ost) && (ost <= 9)) {
            return "рублей";
        }
        if ((2 <= ost) && (ost <= 4)) {
            return "рубля";
        }
        if ((1 <= ost) && (ost < 2)) {
            return "рубль";
        }
        return "рублей";
    }
}
