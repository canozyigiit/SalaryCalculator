public class Employee {


    private String name;
    private Double salary;
    private Integer workHours;
    private Integer hireYear;

    public Employee(String name, Double salary, Integer workHours, Integer hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Double tax() {

        if (salary < 1000) {
            return 0.0;
        } else {
            Double tax = salary * (0.03);
            return tax;
        }
    }

    public Integer bonus() {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        } else return 0;
    }

    public Double raiseSalary() {
        int currentYear = 2021;
        int bonus = bonus();
        double tax = tax();
        double newSalary = (salary + bonus - tax);
        if ((currentYear - hireYear) < 10) {
            return (newSalary * 0.05);
        } else if ((currentYear - hireYear)> 9 && (currentYear - hireYear) < 20) {
            return (newSalary * 0.10);
        } else {
            return (newSalary * 0.15);
        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                "\n name= " + name +
                ",\n salary= " + salary +
                ",\n workHours= " + workHours +
                ",\n hireYear= " + hireYear +
                ",\n tax= " + tax() +
                ",\n bonus= " + bonus() +
                ",\n raiseSalary= " + raiseSalary() +
                ",\n salaryWithTaxAndBonus= " +(salary + bonus() - tax()) +"\n" +
                '}';
    }
}
