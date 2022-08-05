public class Main {
    public static void main(String[] args) {
        System.out.println("2 parametre alan sayıların çarpımı: " + sayilariCarp(5,6));
        System.out.println("3 parametre alan sayıların çarpımı: " + sayilariCarp(4,5,6));
    }
    static int sayilariCarp(int a, int b){
        int carp = a * b;
        return carp;
    }
    static int sayilariCarp(int a, int b, int c){
        int carp = a * b * c;
        return carp;
    }
}