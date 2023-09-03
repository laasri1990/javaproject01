package class9;

public class task9 {

    public static void main(String[] args) {

     String[][]countries={{"United States", "Mexico", "Guatemala", "Belize", "El Salvador", "Honduras",
             "Nicaragua", "Costa Rica", "Panama", "Cuba",  "Dominican Republic", "Haiti", "Jamaica", "Trinidad"},{
             "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru",
             "Suriname", "Uruguay","Venezuela"},{"Denmark","Serbia","Bulgaria","Slovakia","hungary","Portugal",
             "Greece","Sweden","Belgium","Netherlands","Romania","Ukraine","Poland","Spain"},{"Afghanistan", "Armenia",
             "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Burma", "Cambodia", "China", "East Timor", "Georgia",
             "Hong Kong", "India", "Indonesia", "Iran", "Iraq", "Japan", "Jordan", "Kazakhstan", "Kuwait", "Kyrgyzstan"},
             {"Morocco","Algeria", "Egypt", "Libya" , "Tunisia" ,"Mauritania", "Sudan"}};

            int total=0;

        for (int i = 0; i < countries.length; i++) { // print how many countries we have in 2d arrays

                total=total+ countries[i].length;

        } System.out.println(total);




    }
}


