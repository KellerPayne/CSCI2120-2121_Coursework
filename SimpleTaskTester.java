import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class SimpleTaskTester{

	private SimpleTask task1;
	private SimpleTask task2;
	private SimpleTask task3;
	private	SimpleTask task4;
	private SimpleTask task5;

	MyDate date1 = new MyDate(30, 9, 2024);
	MyDate date2 = new MyDate(12, 10, 2024);
	MyDate date3 = new MyDate(20, 10, 2024);
	MyDate date4 = new MyDate(21, 10, 2024);
	MyDate date5 = new MyDate(25, 10, 2024);
	MyDate date6 = new MyDate(26, 10, 2024);
	MyDate date7 = new MyDate(27, 10, 2024);
	MyDate date8 = new MyDate(28, 10, 2024);
	MyDate date9 = new MyDate(29, 10, 2024);
	MyDate date10 = new MyDate(30, 10, 2024);

	Time2 time1 = new Time2(23, 59, 59);
	Time2 time2 = new Time2(11, 00, 00);
	Time2 time3 = new Time2(01, 00, 00);

	DateAndTimeCombo startDateAndTime1 = new DateAndTimeCombo(date9, time2);
	DateAndTimeCombo startDateAndTime2 = new DateAndTimeCombo(date8, time1);
	DateAndTimeCombo startDateAndTime3 = new DateAndTimeCombo(date7, time3);
	DateAndTimeCombo startDateAndTime4 = new DateAndTimeCombo(date5, time1);
	DateAndTimeCombo startDateAndTime5 = new DateAndTimeCombo(date1, time1);
	DateAndTimeCombo startDateAndTime6 = new DateAndTimeCombo(date2, time1);
	DateAndTimeCombo startDateAndTime7 = new DateAndTimeCombo(date3, time3);
	DateAndTimeCombo startDateAndTime8 = new DateAndTimeCombo(date4, time1);
	DateAndTimeCombo startDateAndTime9 = new DateAndTimeCombo(date6, time1);

	DateAndTimeCombo dueDateAndTime1 = new DateAndTimeCombo(date10, time1);
	DateAndTimeCombo dueDateAndTime2 = new DateAndTimeCombo(date9, time1);
	DateAndTimeCombo dueDateAndTime3 = new DateAndTimeCombo(date8, time2);
	DateAndTimeCombo dueDateAndTime4 = new DateAndTimeCombo(date6, time3);
	DateAndTimeCombo dueDateAndTime5 = new DateAndTimeCombo(date2, time2);
	DateAndTimeCombo dueDateAndTime6 = new DateAndTimeCombo(date3, time1);
	DateAndTimeCombo dueDateAndTime7 = new DateAndTimeCombo(date4, time2);
	DateAndTimeCombo dueDateAndTime8 = new DateAndTimeCombo(date5, time2);
	DateAndTimeCombo dueDateAndTime9 = new DateAndTimeCombo(date7, time1);

	DateAndTimeCombo completionDateAndTime1 = new DateAndTimeCombo(date1, time2);
	DateAndTimeCombo completionDateAndTime2 = new DateAndTimeCombo(date2, time2);
	DateAndTimeCombo completionDateAndTime3 = new DateAndTimeCombo(date3, time2);
	DateAndTimeCombo completionDateAndTime4 = new DateAndTimeCombo(date4, time2);
	DateAndTimeCombo completionDateAndTime5 = new DateAndTimeCombo(date5, time1);
	DateAndTimeCombo completionDateAndTime6 = new DateAndTimeCombo(date6, time3);



	@BeforeEach
	public void initialize(){
		task1 = new SimpleTask("Lab Homework Due", "Complete lab homework on recursion before the due date!", startDateAndTime7, dueDateAndTime2);
		task2 = new SimpleTask("Lecture Homework Due", "Complete coding homework for lecture!", startDateAndTime8, dueDateAndTime3);
		task3 = new SimpleTask("Javadocs", "Complete javadocs for programming assignment!", startDateAndTime9, dueDateAndTime8);
		task4 = new SimpleTask("Discrete Math Homework", "Complete all assignments before test!", startDateAndTime5, dueDateAndTime8);
		task5 = new SimpleTask("Apply for internship", "Be sure all information is filled out and resume is updated!", startDateAndTime5, dueDateAndTime1);
	}

	@Test
	public void testGetTitle(){
		assertEquals("Lab Homework Due", task1.getTitle());
		assertEquals("Lecture Homework Due", task2.getTitle());
		assertEquals("Javadocs", task3.getTitle());
		assertEquals("Discrete Math Homework", task4.getTitle());
		assertEquals("Apply for internship", task5.getTitle());
	}

	@Test
	public void testGetDescription(){
		assertEquals("Complete lab homework on recursion before the due date!", task1.getDescription());
		assertEquals("Complete coding homework for lecture!", task2.getDescription());
		assertEquals("Complete javadocs for programming assignment!", task3.getDescription());
		assertEquals("Complete all assignments before test!", task4.getDescription());
		assertEquals("Be sure all information is filled out and resume is updated!", task5.getDescription());
	}

	@Test
	public void testGetIsComplete(){
		assertFalse(task1.getIsComplete());
		assertFalse(task2.getIsComplete());
		assertFalse(task3.getIsComplete());
		assertFalse(task4.getIsComplete());
		assertFalse(task5.getIsComplete());
	}

	@Test
	public void testGetStartDateAndTime(){
		assertEquals(startDateAndTime7, task1.getStartDateAndTime());
		assertEquals(startDateAndTime8, task2.getStartDateAndTime());
		assertEquals(startDateAndTime9, task3.getStartDateAndTime());
		assertEquals(startDateAndTime5, task4.getStartDateAndTime());
		assertEquals(startDateAndTime5, task5.getStartDateAndTime());
	}

	@Test
	public void testGetDueDateAndTimeMethod(){
		assertEquals(dueDateAndTime2, task1.getDueDateAndTime());
		assertEquals(dueDateAndTime3, task2.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task3.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task4.getDueDateAndTime());
		assertEquals(dueDateAndTime1, task5.getDueDateAndTime());
	}

	@Test
	public void testGetCompletionDateAndTimeMethod(){
		assertEquals(null, task1.getCompletionDateAndTime());
		assertEquals(null, task2.getCompletionDateAndTime());
		assertEquals(null, task3.getCompletionDateAndTime());
		assertEquals(null, task4.getCompletionDateAndTime());
		assertEquals(null, task5.getCompletionDateAndTime());
	}

	@Test
	public void testSetTitleMethod(){
		task1.setTitle("Complete Java Homework");
		assertEquals("Complete Java Homework", task1.getTitle());
		task2.setTitle("Complete Discreet Math Homework");
		assertEquals("Complete Discreet Math Homework", task2.getTitle());
		task3.setTitle("Complete Outlier Training");
		assertEquals("Complete Outlier Training", task3.getTitle());
		task4.setTitle("Pay Car Note");
		assertEquals("Pay Car Note", task4.getTitle());
		task5.setTitle("Vacation!");
		assertEquals("Vacation!", task5.getTitle());
	}

	@Test
	public void testSetDescriptionMethod(){
		task1.setDescription("Complete the final few tests for the homework for CSCI2120");
		assertEquals("Complete the final few tests for the homework for CSCI2120", task1.getDescription());
		task2.setDescription("Complete remaining homework for chapter 2 for discreet math before test on next Friday");
		assertEquals("Complete remaining homework for chapter 2 for discreet math before test on next Friday", task2.getDescription());
		task3.setDescription("Complete remaining training courses in Outlier before the tasks run out");
		assertEquals("Complete remaining training courses in Outlier before the tasks run out", task3.getDescription());
		task4.setDescription("Pay car note due on the 7th of next month");
		assertEquals("Pay car note due on the 7th of next month", task4.getDescription());
		task5.setDescription("Be sure airbnb is booked for vacation!");
		assertEquals("Be sure airbnb is booked for vacation!", task5.getDescription());
	}

	@Test
	public void testSetStartDateAndTimeMethod(){
		task1.setStartDateAndTime(startDateAndTime2);
		task2.setStartDateAndTime(startDateAndTime2);
		task3.setStartDateAndTime(startDateAndTime2);
		task4.setStartDateAndTime(startDateAndTime2);
		task5.setStartDateAndTime(startDateAndTime2);

		assertEquals(startDateAndTime2, task1.getStartDateAndTime());
		assertEquals(startDateAndTime2, task2.getStartDateAndTime());
		assertEquals(startDateAndTime2, task3.getStartDateAndTime());
		assertEquals(startDateAndTime2, task4.getStartDateAndTime());
		assertEquals(startDateAndTime2, task5.getStartDateAndTime());
	}

	@Test
	public void testSetDueDateAndTimeMethod(){
		task1.setDueDateAndTime(dueDateAndTime8);
		task2.setDueDateAndTime(dueDateAndTime8);
		task3.setDueDateAndTime(dueDateAndTime8);
		task4.setDueDateAndTime(dueDateAndTime8);
		task5.setDueDateAndTime(dueDateAndTime8);

		assertEquals(dueDateAndTime8, task1.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task2.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task3.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task4.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task5.getDueDateAndTime());
	}

	@Test
	public void testCompleteMethod(){
		task1.complete(completionDateAndTime1);
		task2.complete(completionDateAndTime1);
		task3.complete(completionDateAndTime1);
		task4.complete(completionDateAndTime1);
		task5.complete(completionDateAndTime1);
	}

}