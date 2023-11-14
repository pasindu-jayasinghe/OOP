package Encapsulation;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public Employee(int baseSalary){
      this(baseSalary,0);
    }

    public static void printNumOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    //overloading but it's good to pass extra hrs as 0 without overloading
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("can not be less than 0");
        this.baseSalary = baseSalary;
     }

     private int getBaseSalary(){//To reduce the coupling made this private
        return baseSalary;
     }

    private int getHourlyRate() {//To reduce the coupling made this private
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0)
            throw new IllegalArgumentException("can not be less than 0");
        this.hourlyRate = hourlyRate;
    }


}
