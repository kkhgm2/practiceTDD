package money;

public class Money {
	protected int amount;
	protected String currency;
	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	public Money time(int i) {
		return new Money(this.amount * i, this.currency);
	}
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	String currency() {
		return currency;
	}
	
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		return amount == money.amount 
				&& currency().equals(money.currency());
	}
	public String toString () {
		return amount + " " + currency;
	}
	
	public Money plus(Money money) {
		return new Money(amount + money.amount, money.currency());
	}
	
	
}
