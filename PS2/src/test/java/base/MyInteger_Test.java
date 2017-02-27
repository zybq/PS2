package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

//Set static constructors (a ; odd :: b ; even)
	static MyInteger a;
	static MyInteger b;
	
//Set static integers (evenNum ; even :: oddNum ; odd)	
	static int evenNum;
	static int oddNum;


//Variables set before each @Test
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	a = new MyInteger(7);
	b = new MyInteger(8);
	evenNum = 8;
	oddNum = 3;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	//Test isEven()
	@Test
	public void test_isEven_true(){
			assertTrue(b.isEven());
	}
	
	@Test
	public void test_isEven_false(){
			assertFalse(a.isEven());
	}

	
	//Test isOdd()
	@Test
	public void test_isOdd_true(){
			assertTrue(a.isOdd());
	}
	
	@Test
	public void test_isOdd_false(){
			assertFalse(b.isOdd());
	}


	//Test isPrime()
	@Test
	public void test_isPrime_true(){
			assertTrue(a.isPrime());
	}
	
	@Test
	public void test_isPrime_false(){
			assertFalse(b.isPrime());
	}

	
	//Test isEven(int)
	@Test
	public void test_isEven_WithInt_true(){
			assertTrue(MyInteger.isEven(evenNum));
	}

	@Test
	public void test_isEven_WithInt_false(){
			assertFalse(MyInteger.isEven(oddNum));
	}


	//Test isOdd(int)
	@Test
	public void test_isOdd_WithInt_true(){
			assertTrue(MyInteger.isOdd(oddNum));
	}

	@Test
	public void test_isOdd_WithInt_false(){
			assertFalse(MyInteger.isOdd(evenNum));
	}
	

	//Test isPrime(int)
	@Test
	public void test_isPrime_WithInt_true(){
			assertTrue(MyInteger.isPrime(oddNum));
	}

	@Test
	public void test_isPrime_WithInt_false(){
			assertFalse(MyInteger.isPrime(evenNum));
	}
	

	//Test isPrime(MyInteger)
	@Test
	public void test_isEven_WithMyInt_true(){
			assertTrue(MyInteger.isEven(b));
	}
	
	@Test
	public void test_isEven_WithMyInt_false(){
			assertFalse(MyInteger.isEven(a));
	}
	

	//Test isOdd(MyInteger)
	@Test
	public void test_isOdd_WithMyInt_true(){
			assertTrue(MyInteger.isOdd(a));
	}

	@Test
	public void test_isOdd_WithMyInt_false(){
			assertFalse(MyInteger.isOdd(b));
	}
	

	//Test isPrime(MyInteger)
	@Test
	public void test_isPrime_WithMyInt_true(){
			assertTrue(MyInteger.isPrime(a));
	}
	
	@Test
	public void test_isPrime_WithMyInt_false(){
			assertFalse(MyInteger.isPrime(b));
	}
	

	//Test equals(int)
	@Test
	public void test_equals_true(){
			assertTrue(b.equals(evenNum));
	}
	
	@Test
	public void test_equals_false(){
			assertFalse(a.equals(evenNum));
	}


	//Test equals(MyInteger)
	@Test
	public void test_equals_WithMyInt_true(){
			assertTrue(MyInteger.equals(b));
	}

	@Test
	public void test_equals_WithMyInt_false(){
			assertFalse(a.equals(oddNum));
	}
}
