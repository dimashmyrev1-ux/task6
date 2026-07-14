public class Employee implements Payable {
    
    @Override
    public void calculatePayment(int rate, int hours) {
        double Paycheck = rate * hours * 0.55;
        System.out.println("Зарплата сотрудника в штате: " + Paycheck);
    }
}
