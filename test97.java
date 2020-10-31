package chapter9;



public class test97 {

	public static class Account {
		private int id;
		private double balance;
		private double annulInterestRate;
		private java.util.Date dateCreated;
		
		
		public Account() {
			
		}
		
		public Account(int id) {
			this.id = id;
		}
		
		public int getid(){
			return id;
		}
		
		public double getbalance(){
			return balance;
		}
		
		public double getannulInterestRate(){
			return annulInterestRate;
		}
		
		public void setid(int id) {
			this.id=id;
		}
		
		public void setbalance(double balance) {
			this.balance=balance;
		}
		
		public void setannulInterestRate(double annulInterestRate) {
			this.annulInterestRate=annulInterestRate;
		}
		
		public java.util.Date getdateCreated(){
			dateCreated= new java.util.Date();
			return dateCreated;
		}
		
		public double getMonthlyInterestRate(){
			double MonthlyInterestRate = annulInterestRate/12;
			return MonthlyInterestRate;
		}
		
		public double getMonthlyInterest(){
			double MonthlyInterestRate = annulInterestRate/12;
			double MonthlyInterest = balance*MonthlyInterestRate;
			return MonthlyInterest;
		}
		
		public void withDraw(double j) {
			balance-=j;
		}
		
		public void deposit(double i) {
			balance+=i;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account no1 = new Account(1122);
		no1.setbalance(20000);
		no1.setannulInterestRate(0.045);
		no1.withDraw(2500);
		no1.deposit(3000);
		System.out.println(no1.getbalance());
		System.out.println(no1.getMonthlyInterestRate());
		System.out.println(no1.getdateCreated());


	}

}
