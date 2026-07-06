void main() {
    Payable employee = new Employee();
    Payable freelancer = new Freelancer();

    employee.calculatePayment(1000, 164);
    freelancer.calculatePayment(1000, 164);
}