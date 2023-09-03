package review3;

public class E2LogicalOperators {
    public static void main(String[] args) {

        boolean isMeat=false;
        boolean isEgg=true;
        boolean isFish=false;
        boolean milk=true;
        boolean vegetables=true;

        boolean isProtein=isMeat||isEgg||isFish;
        boolean isGoodDiet=(isMeat||isEgg||isFish) && milk && vegetables;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);
    }
}
