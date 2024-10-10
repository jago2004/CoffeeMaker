import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest {

	@Test
	public void testAddIngredients() throws Exception {
		CoffeeMaker cm = new CoffeeMaker();
		cm.addIngredients(20, 10);
		assertEquals(20, cm.getCoffee());
		assertEquals(10, cm.getMilk());
	}

	@Test
	public void testAddIngredientsException() {
		try {
			CoffeeMaker cm = new CoffeeMaker();
			cm.addIngredients(4, -1);
			fail("InventoryException should be thrown");
		} catch (Exception e) {
			// success if thrown
		}
	}

	@Test
	public void testMakeEspressoWithoutIngredients() {
		CoffeeMaker cm = new CoffeeMaker();
		assertEquals(5, cm.makeEspresso(5));
	}

	@Test
	public void testMakeLatteWithoutIngredients() {
		CoffeeMaker cm = new CoffeeMaker();
		assertEquals(5, cm.makeLatte(5));
	}
	
	@Test
	public void testMakeEspresso() throws Exception {
		CoffeeMaker cm = new CoffeeMaker();
		cm.addIngredients(10, 10);
		assertEquals(4, cm.makeEspresso(5));
	}

	@Test
	public void testMakeLatte() throws Exception {
		CoffeeMaker cm = new CoffeeMaker();
		cm.addIngredients(10, 10);
		assertEquals(3, cm.makeLatte(5));
	}
}
