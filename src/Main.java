public class Main {
    public static void main(String[] args){

        findNumb();
    }

    public static void findNumb(){
        StringBuilder str = new StringBuilder("Chiara");
        int result = str.codePointAt(4);
        System.out.println("Il carattere in unicode n° 4 è " + result);
    }



}
