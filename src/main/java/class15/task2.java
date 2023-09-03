package class15;

public class task2 {

    private String name;
    private double grad1;
    private  double grad2;
    private double grad3;

    public task2(String getname,double getgrad1,double getgrad2,double getgrad3){
        name=getname;
        grad1=getgrad1;
        grad2=getgrad2;
        grad3=getgrad3;
    }
    public double calcaverage(){
     double calc=(grad1+grad2+grad3)/3; //we can also creat it as a void sout(name+" got "+calc)

        return calc;
    }

    public static void main(String[] args) {

        task2 d1=new task2("youssef",45,44,53);

        System.out.println("the average of "+ d1.name+ " is " +d1.calcaverage());
    }
}
