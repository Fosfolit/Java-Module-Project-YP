import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        inputParameters();
    }
    static ArrayList<tovar> arr = new ArrayList<>();
    static int count = 0;
    static double all = 0;
    public static void inputParameters (){
        Scanner in =new Scanner(System.in);
        while(1==1){
            System.out.println("Введите количество человек");
            count = in.nextInt();
            if(count>1){
                addingProducts();

                break;
            }else{
                System.out.println("Некорректное количество человек");
            }
        }
        in.close();
    }
    public static void addingProducts(){
        Scanner in =new Scanner(System.in);
        String vv = "";
        while(!vv.equalsIgnoreCase("Завершить")){
            System.out.println("Добавить новый товар ? Да||Завершить");
            vv = in.next();
            if (vv.equalsIgnoreCase("да")){
                addTovar();
            }
            else{
                if (!vv.equalsIgnoreCase("Завершить")){
                    System.out.println("Некоректный ввод");
                }
            }
        }
        outputResults();
        in.close();
    }
    public static void addTovar(){
        Scanner in =new Scanner(System.in);
        System.out.println("Введите название товара ");
        String name = in.next();
        System.out.println("Введите корректную цену товара");
        double coast = in.nextFloat();
        while (coast < 0){
            System.out.println("Некорректная цена \n Введите корректную цену");
            coast = in.nextFloat();
        }
        arr.add(new tovar(name,coast));
        all =all + coast;
        System.out.println("Товар успешно добавлен");
        in.close();
    }
    public static void outputResults() {
        System.out.println("Добавленные товары:");
        for(tovar no :arr){
            no.see();
        }
        double n =all/count;
        System.out.println("С каждого человека по "+String.format("%.2f",n)+rubus(n));
    }
    public static String rubus(double in) {

        if(in <= 1.5){
            return " рубль";
        }else{
            return " рубля";
        }
    }
}
