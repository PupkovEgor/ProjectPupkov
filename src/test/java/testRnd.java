import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.Randomize;

public class testRnd {

	//Проверка на диапазон сгенерированного числа
	@Test
	public void testRand() {
		Randomize rnd = new Randomize();
		int num = rnd.rand();
		int cel = num % 1;
		assertTrue(num >= 45 && num <=75 && cel == 0);
	}

}
