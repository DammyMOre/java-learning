"""
PSEUDO CODE
prompt the user to enter amount to borrow
save it as principal amount

prompt the user to enter a rate
save it as yearly rate

prompt the user to enter duration of repayment in years
save it as duration in years

store % as PERCENTAGE
store the numbers of months in a year as MONTHSINAYEAR 
multiply duration in years by MONTHSINAYEAR
save it as duration in months
divide yearly rate by PERCENTAGE by MONTHSINAYEAR
Add 1 + rate in month ** duration in month multiplied by rate in month
save it as rate calculator
Add 1+ rate in month**duration in months -1
save it as division
divide rate calculation by division
save as calculation 
multiply principal amount by calculation
save it as monthly repayment
print monthly repayment
"""



import java.util.Scanner;

public class MotgageCalculator{

public static void main (String...args){

Scanner scanner = new Scanner(System.in);

System.out.print("enter amount: ");
int principalAmount= scanner.nextInt();

System.out.print("enter a rate: ");
double annualRate = scanner.nextInt();

System.out.print("enter yearly duration: ");
int durationInYears = scanner.nextInt();

double monthlyDuration = durationInYears * 12;

double monthlyRate = (annualRate /100)/12;

double rate = 1+ monthlyRate;

double power =  Math.pow(rate,monthlyDuration );

double cal = monthlyRate * power;

double divide = power - 1;

double calculation = cal /divide;

double monthlyRepayment = principal * calculation;

System.out.print(monthlyRepayment);









}

}