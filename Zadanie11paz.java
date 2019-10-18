package zadanie11paz;

import java.util.Scanner;

public class Zadanie11paz {

    public static void lokata() {
        Scanner we = new Scanner(System.in);
        System.out.print("Podaj kwotę: ");
        double kwota = we.nextDouble();
        System.out.print("Podaj oprocentowanie: ");
        double oprocentowanie = we.nextDouble();
        System.out.print("Podaj liczbę miesięcy");
        int miesiace = we.nextInt();
        double odsetki = kwota * oprocentowanie / 100 * miesiace / 12;
        double wynik = kwota + odsetki;
        System.out.println("Ostateczna kwota: " + wynik + "zł");
    }

    public static void zad1() {

        Scanner we = new Scanner(System.in);
        System.out.print("Podaj temperaturę w skali Celsjusza: ");
        double celsjusz = we.nextDouble();
        double farenheit = 33 + 1.8 * celsjusz;
        System.out.print("Wynikowa temp. w skali Fahrenheita: " + farenheit);
    }

    public static void zad2() {

        Scanner we = new Scanner(System.in);
        System.out.print("Podaj wagę w kg: ");
        double waga = we.nextDouble();
        System.out.print("Podaj wzrost w metrach: ");
        double wzrost = we.nextDouble();
        double bmi = waga / (wzrost * wzrost);
        System.out.print("Wskaźmik BMI wynosi: " + bmi);
        if ((bmi > 18.5) && (bmi < 24.9)) {
            System.out.println(" Waga prawidłowa");
        } else if (bmi < 18.5) {
            System.out.println(" Niedowaga");
        } else {
            System.out.println(" Nadwaga");
        }

    }

    public static void zad3() {
        Scanner we = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double pierw = we.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double druga = we.nextDouble();
        System.out.print("Podaj trzecią liczbę: ");
        double trzecia = we.nextDouble();
        double srednia = (pierw + druga + trzecia) / 3;
        if ((pierw > druga) && (pierw > trzecia)) {
            System.out.print("Pierwsza liczba jest największa (" + pierw + ")");
            if (druga > trzecia) {
                System.out.print("Trzecia liczba jest najmniejsza (" + trzecia + ")");
            } else {
                System.out.print("Druga liczba jest najmniejsza (" + druga + ")");
            }
        } else if ((druga > pierw) && (druga > trzecia)) {
            System.out.print("Druga liczba jest największa (" + druga + ")");
            if (pierw > trzecia) {
                System.out.print("Trzecia liczba jest najmniejsza (" + trzecia + ")");
            } else {
                System.out.print("Pierwsza liczba jest najmniejsza (" + pierw + ")");
            }
        } else if ((trzecia > pierw) && (trzecia > druga)) {
            System.out.print("Trzecia liczba jest największa (" + trzecia + ")");
            if (pierw > druga) {
                System.out.print("Druga liczba jest najmniejsza (" + druga + ")");
            } else {
                System.out.print("Pierwsza liczba jest najmniejsza (" + pierw + ")");
            }
        }
        System.out.println("Średnia arytmetyczna podanych liczb: " + srednia);
    }

    public static void zad4() {
        Scanner we = new Scanner(System.in);
        System.out.print("Podaj dochód: ");
        double doch = we.nextDouble();
        if (doch <= 85528) {
            double p1 = doch * 0.18 + 556.02;
            System.out.print("Podatek dochodowy wynosi " + p1 + " zł");
        } else {
            double p2 = 14839.02 + ((doch - 85528) * 0.32);
            System.out.print("Podatek dochodowy wynosi " + p2 + " zł");
        }
    }

    public static void zad5() {
        Scanner we = new Scanner(System.in);
        System.out.print("Podaj cenę towaru (100-10tys zł): ");
        double cena = we.nextDouble();
        if ((cena >= 100) && (cena <= 10000)) {

            System.out.print("Podaj liczbę rat (6-48): ");
            double rata = we.nextInt();
            if ((rata >= 6) && (rata <= 12)) {
                double odsetki = (cena * 0.025);
                double kw = ((cena + odsetki) / rata);
                System.out.print("Miesięczna rata wynosi: " + kw + " zł.");
            } else if ((rata >= 13) && (rata <= 24)) {
                double odsetki = (cena * 0.05);
                double kw = ((cena + odsetki) / rata);
                System.out.print("Miesięczna rata wynosi: " + kw + " zł.");
            } else if ((rata >= 25) && (rata <= 48)) {
                double odsetki = (cena * 0.10);
                double kw = ((cena + odsetki) / rata);
                System.out.print("Miesięczna rata wynosi: " + kw + " zł.");
            } else {
                System.out.print("Podaj prawidłową liczbę rat.");
            }
        } else {
            System.out.print("Podaj prawidłową cenę.");
        }
    }

    public static void zad6() {
        Scanner we = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double pierw = we.nextDouble();
        System.out.print("Podaj znak działania: ");
        char symbol = we.next().charAt(0);
        System.out.print("Podaj drugą liczbę: ");
        double druga = we.nextDouble();
        if (symbol == '+') {
            double wynik = pierw + druga;
            System.out.print("Wynik działania: " + wynik);
        } else if (symbol == '-') {
            double wynik = pierw - druga;
            System.out.print("Wynik działania: " + wynik);
        } else if (symbol == '*') {
            double wynik = pierw * druga;
            System.out.print("Wynik działania: " + wynik);
        } else if (symbol == '/') {
            if (druga == 0) {
                System.out.print("Nie można dzielić przez zero.");
            } else {
                double wynik = pierw / druga;
                System.out.print("Wynik działania: " + wynik);
            }
        } else {
            System.out.print("Podaj prawidłowy symbol.");
        }

    }

    public static void zad6a() {
        Scanner we = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        double pierw = we.nextDouble();
        System.out.print("Podaj znak działania: ");
        char symbol = we.next().charAt(0);
        System.out.print("Podaj drugą liczbę: ");
        double druga = we.nextDouble();
        switch (symbol) {
            case '+':
                double dod = pierw + druga;
                System.out.print("Wynik działania to " + dod);
                break;
            case '-':
                double ode = pierw - druga;
                System.out.print("Wynik działania to " + ode);
                break;
            case '*':
                double mno = pierw * druga;
                System.out.print("Wynik działania to " + mno);
                break;
            case '/':
                if (druga=='0'){
                System.out.print("Nie można dzielić przez 0");
                }
                else {double dzi=pierw/druga;
                System.out.print("Wynik działania to "+dzi);}
        }
    }

    public static void main(String[] args) {
        zad6a();
    }

}
