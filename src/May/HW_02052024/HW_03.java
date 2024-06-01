package May.HW_02052024;

public class HW_03 {
    public static void main(String[] args) {
//Find the max salary in the input arrays {30,50,60,90,10, 100,999}

        int[] salaries={30,50,60,90,10, 100,999};

        int maxSalary=Integer.MIN_VALUE;
        for(int salary:salaries){
            if(salary>maxSalary){
               maxSalary=salary;
            }
        }
        System.out.println("Maximum salary:" +maxSalary);
    }
}
