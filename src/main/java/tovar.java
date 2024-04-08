public class tovar {
    String name;
    double coast;

    public tovar(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }

    public void see() {
        System.out.println(this.name + " = " + String.format("%.2f", this.coast) + this.rubus());
    }

    public String rubus() {

        if (this.coast <= 1.5) {
            return " рубль";
        } else {
            return " рубля";
        }
    }
}
