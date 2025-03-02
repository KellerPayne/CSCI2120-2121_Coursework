import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class SimpleTaskTest{

	private SimpleTask task1;
	private SimpleTask task2;
	private SimpleTask task3;
	private	SimpleTask task4;
	private SimpleTask task5;
	private SimpleTask task6;


	@BeforeEach
	public void initialize(){
		DateAndTimeCombo startDateAndTime1 = new DateAndTimeCombo(22, 9, 2024, 06, 59, 59);
		DateAndTimeCombo dueDateAndTime1 = new DateAndTimeCombo(27, 9, 2024, 23, 59, 59);
		DateAndTimeCombo startDateAndTime2 = new DateAndTimeCombo(22, 9, 2024, 6, 59, 59);
		DateAndTimeCombo dueDateAndTime2 = new DateAndTimeCombo(24, 9, 2024, 9, 00, 00);
		DateAndTimeCombo startDateAndTime3 = new DateAndTimeCombo(17, 9, 2024, 11, 00, 00);
		DateAndTimeCombo dueDateAndTime3 = new DateAndTimeCombo(24, 9, 2024, 11, 00, 00);
		DateAndTimeCombo startDateAndTime4 = new DateAndTimeCombo(19, 9, 2024, 12, 00, 00);
		DateAndTimeCombo dueDateAndTime4 = new DateAndTimeCombo(26, 9, 2024, 23, 59, 59);

		task1 = new SimpleTask("Discrete Math Test", "Finish studying for discrete math test", startDateAndTime1, dueDateAndTime1);
		task2 = new SimpleTask("Assembly Language Test 1", "Take Assembly Language Test in Room 102", startDateAndTime2, dueDateAndTime2);
		task3 = new SimpleTask("Lab 3", "Complete lab3 activities and submit in gitlab", startDateAndTime3, dueDateAndTime3);
		task4 = new SimpleTask("Homework 1 Due", "Homework 1 for Data Structures Due in gitlab and on Canvas", startDateAndTime4, dueDateAndTime4);

	}

	@Test
	public void testGetTitleMethod(){
		assertEquals("Discrete Math Test", task1.getTitle());
		assertEquals("Assembly Language Test 1", task2.getTitle());
		assertEquals("Lab 3", task3.getTitle());
		assertEquals("Homework 1 Due", task4.getTitle());
	}

	@Test
	public void testGetDescriptionMethod(){
		assertEquals("Finish studying for discrete math test", task1.getDescription());
		assertEquals("Take Assembly Language Test in Room 102", task2.getDescription());
		assertEquals("Complete lab3 activities and submit in gitlab", task3.getDescription());
		assertEquals("Homework 1 for Data Structures Due in gitlab and on Canvas", task4.getDescription());
	}

	@Test
	public void testGetIsCompleteMethod(){
		assertEquals(false, task1.getIsComplete());
		assertEquals(false, task2.getIsComplete());
		assertEquals(false, task3.getIsComplete());
		assertEquals(false, task4.getIsComplete());
	}

	@Test
	public void testGetStartDateAndTime(){
		assertEquals("September 22, 2024 6:59:59 AM", task1.getStartDateAndTime());
		assertEquals("September 22, 2024 6:59:59 AM", task2.getStartDateAndTime());
		assertEquals("September 17, 2024 11:00:00 AM", task3.getStartDateAndTime());
		assertEquals("September 19, 2024 12:00:00 PM", task4.getStartDateAndTime());
	}

	@Test
	public void testGetDueDateAndTimeMethod(){
		assertEquals("September 27, 2024 11:59:59 PM", task1.getDueDateAndTime());
		assertEquals("September 24, 2024 9:00:00 AM", task2.getDueDateAndTime());
		assertEquals("September 24, 2024 11:00:00 AM", task3.getDueDateAndTime());
		assertEquals("September 26, 2024 11:59:59 PM", task4.getDueDateAndTime());
	}

	@Test
	public void testGetCompletionDateAndTimeMethod(){
		assertEquals("Task has not yet been completed!", task1.getCompletionDateAndTime());
		assertEquals("Task has not yet been completed!", task2.getCompletionDateAndTime());
		assertEquals("Task has not yet been completed!", task3.getCompletionDateAndTime());
		assertEquals("Task has not yet been completed!", task4.getCompletionDateAndTime());
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
	}

	@Test
	public void testGetStartDateAndTimeMethod(){
		DateAndTimeCombo testNewStartDateAndTime = new DateAndTimeCombo(24, 9, 2024, 20, 11, 00);
		task1.setStartDateAndTime(testNewStartDateAndTime);
		assertEquals("September 24, 2024 8:11:00 PM", task1.getStartDateAndTime());
		task2.setStartDateAndTime(testNewStartDateAndTime);
		assertEquals("September 24, 2024 8:11:00 PM", task2.getStartDateAndTime());
		task3.setStartDateAndTime(testNewStartDateAndTime);
		assertEquals("September 24, 2024 8:11:00 PM", task3.getStartDateAndTime());
		task4.setStartDateAndTime(testNewStartDateAndTime);
		assertEquals("September 24, 2024 8:11:00 PM", task4.getStartDateAndTime());
	}

	@Test
	public void testSetDueDateAndTimeMethod(){
		DateAndTimeCombo testNewDueDateAndTime = new DateAndTimeCombo(27, 9, 2024, 23, 59, 00);
		task1.setDueDateAndTime(testNewDueDateAndTime);
		assertEquals("September 27, 2024 11:59:00 PM", task1.getDueDateAndTime());
		task2.setDueDateAndTime(testNewDueDateAndTime);
		assertEquals("September 27, 2024 11:59:00 PM", task2.getDueDateAndTime());
		task3.setDueDateAndTime(testNewDueDateAndTime);
		assertEquals("September 27, 2024 11:59:00 PM", task3.getDueDateAndTime());
		task4.setDueDateAndTime(testNewDueDateAndTime);
		assertEquals("September 27, 2024 11:59:00 PM", task4.getDueDateAndTime());
	}

	@Test
	public void testCompleteMethod(){
		DateAndTimeCombo testCompletionDateAndTime = new DateAndTimeCombo(25, 9, 2024, 10, 45, 59);
		task1.complete(testCompletionDateAndTime);
		assertEquals(true, task1.getIsComplete());
		task2.complete(testCompletionDateAndTime);
		assertEquals(true, task2.getIsComplete());
		task3.complete(testCompletionDateAndTime);
		assertEquals(true, task3.getIsComplete());
		task4.complete(testCompletionDateAndTime);
		assertEquals(true, task4.getIsComplete());
	}

}