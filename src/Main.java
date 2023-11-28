public class Main {
    public static void main(String[] args){

        findNumb();
    }

    public static void findNumb(){
        StringBuilder str = new StringBuilder("Chiara");
        int result = str.codePointAt(4);
        StringBuilder str2 = new StringBuilder("Il carattere in unicode n° 4 è ");
        System.out.println(str2.append(result));
    }



}
