package May.ex_04052024;

public class lab135 {
    public static void main(String[] args) {

        int [] salaries={30,50,60,90,10,100,999,-1,-2};
        int max_salary=Integer.MIN_VALUE;

       /* for (int i = 0; i < salaries.length; i++) {

            if (salaries[i]>max_salary)
            {
                max_salary=salaries[i];

            }
        }*/
        int j=0;
        while(j<salaries.length){
            if (salaries[j]>max_salary){
                max_salary=salaries[j];
            }
            j++;
        }



            System.out.println("Maximum salary is->"+max_salary);
        }
    }

