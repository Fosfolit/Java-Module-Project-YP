public class Tovar extends Rubl{
    String name;
    double coast;

    public Tovar(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }

    public void see() {
        System.out.printf("%s = %.2f %s\n",this.name ,this.coast ,this.rubel(this.coast));
    }
}
