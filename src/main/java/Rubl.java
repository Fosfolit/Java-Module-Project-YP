public class Rubl {
    public String rubel(final double coast) {
        double ost = coast % 10;
        if ((5 <= ost) && (ost <= 9)) {
            return "рублей";
        }
        if ((1 <= ost) && (ost < 2)) {
            return "рублю";
        }
        return "рубля";
    }
}
