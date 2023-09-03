package class14;

public class task {

    public static void main(String[] args) {
        System.out.println(getVowels("yousseflaasri"));
    }


    private static String getVowels(String name) {
       return name=name.replaceAll("[^aouieAOUIE]","");

    }


}