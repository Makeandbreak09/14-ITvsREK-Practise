/**
 * Created by aos on 26.04.2017.
 * Updated by aos on 17.02.2021.
 */
public class JustAClass {

    //TODO: Arbeite die Methoden von oben nach unten ab. Teste immer über die Klasse MainProgramm, ob die Methode das gewünschte liefert.
    /**
     * Bestimmt eine zufällige ganze Zahl zwischen 1 und 6 (Grenzen einschließlich).
     * @return
     */
    private int getRandom(){
        int rand = (int)(Math.random()*6) + 1;
        System.out.println("Random: " + rand);
        return rand;
    }


    /**
     * Summiert bis zur Zahl n einschließlich alle ganzen Zahlen auf und
     * gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpIt(int n){
        int o = 0;
        for(int i = 1; i<=n; i++){
            o+=i;
        }
        return o;
    }

    /**
     * Summiert bis zur Zahl n einschließlich alle ganzen Zahlen auf und
     * gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRek(int n){
        if(n>1) {
            return n + sumUpRek(n - 1);
        }else{
            return n;
        }
    }

    /**
     * Bestimmt n zufällige Ergebnisse zwischen 1 und 6 (Grenzen einschließlich),
     * summiert diese auf und gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRandomIt(int n){
        int o = 0;
        for(int i = 0; i<n; i++){
            o+=getRandom();
        }
        return o;
    }

    /**
     * Bestimmt n zufällige Ergebnisse zwischen 1 und 6 (Grenzen einschließlich),
     * summiert diese auf und gibt die Summe zurück.
     * @param n
     * @return
     */
    public int sumUpRandomRek(int n){
        if(n>0) {
            return getRandom() + sumUpRandomRek(n - 1);
        }else{
            return 0;
        }
    }

    /**
     * Bestimmt n zufällige positive, ganze Zahlen zwischen 1 und 6.
     * Gibt die größte dieser zufälligen Zahlen zurück.
     * @param n
     * @return die größte zufällig Zahl, die im Verlauf der Methode erstellt wurde.
     */
    public int biggestOfRandomIt(int n){
        int o = -1;
        for(int i = 0; i<n; i++){
            int p = getRandom();
            if(o<p){
                o=p;
            }
        }
        return o;
    }

    /**
     * Bestimmt n zufällige positive, ganze Zahlen zwischen 1 und 6.
     * Gibt die größte dieser zufälligen Zahlen zurück.
     * @param n
     * @return die größte zufällig Zahl, die im Verlauf der Methode erstellt wurde.
     */
    public int biggestOfRandomRek(int n){
        int o = -1;
        if(n>0) {
            o = biggestOfRandomRek(n - 1);
            int p = getRandom();
            if(o<p){
                o=p;
            }
        }
        return o;
    }

    public int fib(int n){
        if(n==0 || n==1)    return n;
        else if(n>1)        return fib(n-1)+fib(n-2);
        return -1;
    }
}
