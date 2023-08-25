package class9;

public class task8 {

    public static void main(String[] args) {

     String[][]countries={{"United States", "Mexico", "Guatemala", "Belize", "El Salvador", "Honduras",
             "Nicaragua", "Costa Rica", "Panama", "Cuba",  "Dominican Republic", "Haiti", "Jamaica", "Trinidad"},{
             "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru",
             "Suriname", "Uruguay","Venezuela"},{"Denmark","Serbia","Bulgaria","Slovakia","hungary","Portugal",
             "Greece","Sweden","Belgium","Netherlands","Romania","Ukraine","Poland","Spain"},{"Afghanistan", "Armenia",
             "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Burma", "Cambodia", "China", "East Timor", "Georgia",
             "Hong Kong", "India", "Indonesia", "Iran", "Iraq", "Japan", "Jordan", "Kazakhstan", "Kuwait", "Kyrgyzstan"},
             {"Morocco","Algeria", "Egypt", "Libya" , "Tunisia" ,"Mauritania", "Sudan"}};

     for(String[]i:countries){
         for(String j:i){

             System.out.println(j+" ");
         }

     }
        System.out.println("=========================================");
        for (int j = 0; j < countries.length; j++) {
            for (int k = 0; k < countries[j].length; k++) {

                System.out.println(countries[j][k]);
            }


        }




    }
}


