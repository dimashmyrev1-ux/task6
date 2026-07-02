public interface Payable {
   public void calculatePayment(int rate, int hours);
}

class Employee implements Payable {
@Override
public void calculatePayment(int rate, int hours){
 double Paycheck = rate*hours * 0.55;
 System.out.println("Зарплата сотрудника в штате: "+ Paycheck);
}
}

class Freelancer implements Payable {
    @Override
    public void calculatePayment(int rate, int hours){
        double Paycheck = rate*hours*0.87;
        System.out.println("Зарплата фрилансера: "+ Paycheck);
    }

}

void main() {

    Payable employee = new Employee();
    Payable freelancer = new Freelancer();


    employee.calculatePayment(1000, 164);
    freelancer.calculatePayment(1000, 164);

}
