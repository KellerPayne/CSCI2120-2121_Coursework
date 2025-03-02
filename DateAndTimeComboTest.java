import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DateAndTimeComboTest{

	private DateAndTimeCombo case1;
	private DateAndTimeCombo case2;
	private DateAndTimeCombo case3;
	private DateAndTimeCombo case4;
	private DateAndTimeCombo case5;
	private DateAndTimeCombo case6;
	private DateAndTimeCombo case7;
	private DateAndTimeCombo case8;
	private DateAndTimeCombo case9;
	private DateAndTimeCombo case10;
	private DateAndTimeCombo case11;
	private DateAndTimeCombo case12;


	@BeforeEach
	public void initialize(){
		case1 = new DateAndTimeCombo(1, 1, 2024, 00, 00, 00);
		case2 = new DateAndTimeCombo(31, 1, 2024, 23, 59, 59);
		case3 = new DateAndTimeCombo(1, 2, 2024, 00, 00, 00);
		case4 = new DateAndTimeCombo(29, 2, 2024, 23, 59, 59);
		case5 = new DateAndTimeCombo(1, 3, 2024, 00, 00, 00);
		case6 = new DateAndTimeCombo(31, 3, 2024, 23, 59, 59);
		case7 = new DateAndTimeCombo(1, 4, 2024, 00, 00, 00);
		case8 = new DateAndTimeCombo(30, 4, 2024, 23, 59, 59);
		case9 = new DateAndTimeCombo(1, 5, 2024, 00, 00, 00);
		case10 = new DateAndTimeCombo(31, 5, 2024, 23, 59, 59);
		case11 = new DateAndTimeCombo(1, 6, 2024, 00, 00, 00);
		case12 = new DateAndTimeCombo(30, 6, 2024, 23, 59, 59);
		
	}

	@Test
	public void testInitialState() {

		assertEquals("12:00:00 AM", case1.getTime());
		assertEquals("11:59:59 PM", case2.getTime());
		assertEquals("12:00:00 AM", case3.getTime());
		assertEquals("11:59:59 PM", case4.getTime());
		assertEquals("12:00:00 AM", case5.getTime());
		assertEquals("11:59:59 PM", case6.getTime());
		assertEquals("12:00:00 AM", case7.getTime());
		assertEquals("11:59:59 PM", case8.getTime());
		assertEquals("12:00:00 AM", case9.getTime());
		assertEquals("11:59:59 PM", case10.getTime());
		assertEquals("12:00:00 AM", case11.getTime());
		assertEquals("11:59:59 PM", case12.getTime());
		assertEquals("January 1, 2024", case1.getDate());
		assertEquals("January 31, 2024", case2.getDate());
		assertEquals("February 1, 2024", case3.getDate());
		assertEquals("February 29, 2024", case4.getDate());
		assertEquals("March 1, 2024", case5.getDate());
		assertEquals("March 31, 2024", case6.getDate());
		assertEquals("April 1, 2024", case7.getDate());
		assertEquals("April 30, 2024", case8.getDate());
		assertEquals("May 1, 2024", case9.getDate());
		assertEquals("May 31, 2024", case10.getDate());
		assertEquals("June 1, 2024", case11.getDate());
		assertEquals("June 30, 2024", case12.getDate());

	}

	@Test
	public void testSetDateMethod(){
		case1.setDate(2, 1, 2024);
		assertEquals("January 2, 2024", case1.getDate());
		
		case2.setDate(1, 2, 2024);
		assertEquals("February 1, 2024", case2.getDate());
	}

	@Test
	public void testSetTimeMethod(){
		case1.setTime(12, 32, 22);
		assertEquals("12:32:22 PM", case1.getTime());

		case2.setTime(1, 10, 20);
		assertEquals("1:10:20 AM", case2.getTime());
	}
}
