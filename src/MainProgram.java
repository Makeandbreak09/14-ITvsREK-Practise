/**
 * Created by aos on 26.04.2017.
 * Redefindes by aos on 17.02.2021.
 */
public class MainProgram {

    public static void main(String[] args){
        JustAClass jc = new JustAClass();

        System.out.println("Summe der ersten 10 ganzen Zahlen-Iterativ: "+ jc.sumUpIt(10));
        System.out.println("Summe der ersten 10 ganzen Zahlen-Rekursiv: "+ jc.sumUpRek(10));

        System.out.println("Summe von 10 zufälligen ganzen Zahlen zwischen 1 und 6-Iterativ: "+ jc.sumUpRandomIt(10));
        System.out.println("Summe von 10 zufälligen ganzen Zahlen zwischen 1 und 6-Rekursiv: "+ jc.sumUpRandomRek(10));

        System.out.println("Die Größte von 10 zufälligen ganzen Zahlen zwischen 1 und 6-Iterativ: "+ jc.biggestOfRandomIt(10));
        System.out.println("Die Größte von 10 zufälligen ganzen Zahlen zwischen 1 und 6-Rekursiv: "+ jc.biggestOfRandomRek(10));
    }
}
