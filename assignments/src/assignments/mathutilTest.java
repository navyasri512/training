package assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mathutilTest {
	mathutil m;
	@BeforeEach
	void init() {
		m=new mathutil();
	}
	@AfterAll
	static void cleanup() {
		System.out.println("cleaning after every method");
	}
	@BeforeAll
	public static void each() {
		System.out.println("starting each method");
	}
	@AfterEach
	public void end() {
		System.out.println("ending each method");
	}

	@Test
	void test() {
		assertEquals(2,m.add(1, 1),"adding two numbers");
	}

}
