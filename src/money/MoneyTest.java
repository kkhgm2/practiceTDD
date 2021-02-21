package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
	@Test
	public void testMultipllication() {
		Money five = Money.dollar(5);
		assertEquals(new Money(10, "USD"), five.time(2));
		assertEquals(Money.dollar(15), five.time(3));
	}
	
	@Test
	private void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	private void testCurrency() {
		assertTrue("USD".equals(Money.dollar(5).currency()));
		assertTrue("CHF".equals(Money.franc(5).currency()));
	}
	
	@Test
	void testSimpleAdditons(){
		Money sum = Money.dollar(5).plus(Money.dollar(5));
		assertEquals(Money.dollar(10), sum);
	}
}
