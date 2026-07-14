public class Freelancer implements Payable {
    
    @Override
    public void calculatePayment(int rate, int hours) {
        double Paycheck = rate * hours * 0.87;
        System.out.println("Зарплата фрилансера: " + Paycheck);
    }

}
