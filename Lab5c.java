interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}
class Manager implements Employee {
       public double earnings(double basicSalary) {
        double DA = 0.8 * basicSalary;
        double HRA = 0.15 * basicSalary;
        return basicSalary + DA + HRA;
    }

        public double deductions(double basicSalary) {
        return 0.12 * basicSalary;
    }

    public double bonus(double basicSalary) {
                return 0;
    }
}
class Substaff extends Manager {
        public double bonus(double basicSalary) {
        return 0.5 * basicSalary;
    }
}

public class Lab5c {
    public static void main(String[] args) {
        double basicSalary = 50000;

        
        Substaff substaff = new Substaff();

        System.out.println("Earnings: " + substaff.earnings(basicSalary));
        System.out.println("Deductions: " + substaff.deductions(basicSalary));
        System.out.println("Bonus: " + substaff.bonus(basicSalary));
    }
}