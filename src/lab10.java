public class lab10 {
    public static void main(String[] args) {
        double [] max_salary = {80000, 90000, 300009, 40000};
        double max = max_salary[0];
        for (int i = 1; i < max_salary.length; i++) {
            if (max_salary[i] > max)
                max = max_salary[i];
        }
        System.out.println("Maximum salary is: " + max);
        }
    }
