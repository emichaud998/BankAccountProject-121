public class BankingDriver{
public static void main (String[] args){
  BankAccount nicksAcct = new BankAccount("Nick",450,550);
  BankAccount carolsAcct = new BankAccount("Carol",600,700);

   nicksAcct.printReport();
   carolsAcct.printReport();
  
   int nicktotal = (nicksAcct.getSaveMoney()+nicksAcct.getCheckMoney());
   int caroltotal = (carolsAcct.getSaveMoney()+carolsAcct.getCheckMoney());
   int combined = (caroltotal+nicktotal);
   System.out.println("Total money in all accounts: $" + combined);
  
   nicksAcct.makeCheckingDeposit(100);
   nicksAcct.printReport();
  
   int nickSavings = nicksAcct.getSaveMoney();
   int nickChecking = nicksAcct.getCheckMoney();
   carolsAcct.makeCheckingDeposit(nickChecking+nickSavings);
   nicksAcct.makeCheckingWithdrawal(nickChecking);
   nicksAcct.makeSavingsWithdrawal(nickSavings);
  
   nicksAcct.printReport();
   carolsAcct.printReport();
   
  }
  }
  
  
  
  
  