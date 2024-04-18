import java.util.ArrayList;
import java.io.PrintStream;
import java.util.Scanner;

public class Logik extends Rubl {
    static int count = 0;
    static ArrayList<Tovar> arr = new ArrayList<>();
    static Scanner in ;
    public static void inputParameters (){
        in = new Scanner(System.in);
        while(true){
            System.out.println("Введите количество человек");
            if(in.hasNextInt()){
                count = in.nextInt();
                if(count>1){
                    addingProducts();
                    break;
                }else{
                    System.out.println("Некорректное количество человек");
                }
            }else{
                System.out.println("Некорректный ввод");
                in.next();
            }
        }
        in.close();
    }


    public static void addingProducts(){
        String inp = "";
        in.nextLine();
        while(!inp.equalsIgnoreCase("Завершить")){
            System.out.println("Добавить новый товар ? Да||Завершить");
            inp = in.nextLine();
            if (inp.equalsIgnoreCase("да")){
                addTovar();
                in.nextLine();
            }
            else if (!inp.equalsIgnoreCase("Завершить")){
                System.out.println("Некоректный ввод");
            }
        }
        outputResults();
    }


    public static void addTovar(){
        System.out.println("Введите название товара ");
        String name = in.nextLine();
        double wer = 0;
        while (!(wer > 0)){
            System.out.println("Введите корректную цену товара");
            if (in.hasNextFloat()||in.hasNextInt()||in.hasNextDouble()){
                wer = scan();
                if(wer< 0){
                    System.out.println("Некорректная цена");
                }
            }
            else{
                System.out.println("Некоректный ввод");
                in.next();
            }
        }
        arr.add(new Tovar(name,wer));
        System.out.println("Товар успешно добавлен");
    }


    public static void outputResults() {
        System.out.println("Добавленные товары:");
        double all = 0;
        if (arr.isEmpty()){
            System.out.println("Товаров нет");
        }else {
            for (Tovar no : arr) {
                all += no.coast;
                no.see();
            }
        }
        double n = all/count;
        Rubl out = new Rubl();
        System.out.printf("Общая сумма %.2f %s\n",all ,out.rubel(n));
        System.out.printf("С каждого человека по %.2f %s\n",n ,out.rubel(n));
    }


    public static double scan(){
        if (in.hasNextInt()){
            return in.nextInt();
        }
        if (in.hasNextDouble()){
            return in.nextDouble();
        }
        if (in.hasNextFloat()){
            return in.nextFloat();
        }
        return 0;
    }

}
