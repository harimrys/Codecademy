public class CarLoan {
  public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3; //representa los 3 años del prestamo
    int interestRate = 5; //representa el tipo de interes %
    int downPayment = 2000; //representa el pago de la entrada del coche
    

    if((loanLength <= 0) || (interestRate <= 0)){
      System.out.println("Error!");
    }
    else if(downPayment >= carLoan){
      System.out.println("No hace falta prestamo");
    }else{
      int remainingBalance = carLoan - downPayment;
      int month = loanLength * 12;
      int monthlyBalance = remainingBalance / month;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;

      System.out.println(monthlyPayment);
    }
  }
}
