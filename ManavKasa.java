import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {

        double Armut,Elma,Domates,Muz,Patlican;
        Scanner inp= new Scanner(System.in);
        System.out.print("Armut kaç kilo");
        Armut= inp.nextDouble();
        System.out.print("Elma kaç kilo");
        Elma= inp.nextDouble();
        System.out.print("Domates kaç kilo");
        Domates= inp.nextDouble();
        System.out.print("Muz kaç kilo");
        Muz= inp.nextDouble();
        System.out.print("Patlıcan kaç kilo");
        Patlican= inp.nextDouble();

        double tutar = (Armut*2.14 + Elma*3.67 + Domates*1.11 + Muz*0.95 + Patlican*5.00);
        System.out.print("Toplam tutar:"+tutar);


    }
}