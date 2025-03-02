import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class CompoundTaskTest {

	private CompoundTask task1;
	private CompoundTask task2;
	private CompoundTask task3;
	private CompoundTask task4;
	private CompoundTask task5;

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

	SimpleTask compoundTaskPart1 = new SimpleTask("Exercise 1", "Compelte exercise 1 for lab homework.", startDateAndTime7, dueDateAndTime2);
	SimpleTask compoundTaskPart2 = new SimpleTask("Exercise 2", "Complete exercise 2 for lab homework.", startDateAndTime7, dueDateAndTime2);
	SimpleTask compoundTaskPart3 = new SimpleTask("Complete Code for AbstractTask", "Write an AbstractTask class for hw2", startDateAndTime8, dueDateAndTime3);
	SimpleTask compoundTaskPart4 = new SimpleTask("Complete code for CompoundTask", "Write a CompoundTask class for hw2", startDateAndTime8, dueDateAndTime3);
	SimpleTask compoundTaskPart5 = new SimpleTask("Update SimpleTask", "Update code for SimpleTask to extend AbstractTask.", startDateAndTime8, dueDateAndTime3);
	SimpleTask compoundTaskPart6 = new SimpleTask("Javadocs for hw2", "Complete all javadocs for hw2", startDateAndTime8, dueDateAndTime3);
	SimpleTask compoundTaskPart7 = new SimpleTask("JUnit Tests for hw2", "Write JUnit tests for hw2", startDateAndTime8, dueDateAndTime3);
	SimpleTask compoundTaskPart9 = new SimpleTask("Review Javadoc tags", "Review Javadoc tags before completing programming assignment.", startDateAndTime9, dueDateAndTime2);
	SimpleTask compoundTaskPart10 = new SimpleTask("3.1 Homework", "Complete 3.1 homework.", startDateAndTime5, dueDateAndTime8);
	SimpleTask compoundTaskPart11 = new SimpleTask("3.2 Homework", "Complete 3.2 homework", startDateAndTime5, dueDateAndTime8);
	SimpleTask compoundTaskPart12 = new SimpleTask("3.3 Homework", "Complete 3.3 homework", startDateAndTime5, dueDateAndTime8);
	SimpleTask compoundTaskPart13 = new SimpleTask("3.4 Homework", "Complete 3.4 homework.", startDateAndTime5, dueDateAndTime8);
	SimpleTask compoundTaskPart14 = new SimpleTask("Professional Portfolio Website", "Be sure PPW is up in GitHub", startDateAndTime5, dueDateAndTime1);
	SimpleTask compoundTaskPart15 = new SimpleTask("Resume", "Be sure resume is updated!", startDateAndTime5, dueDateAndTime1);

	@BeforeEach
	public void initialize(){

		task1 = new CompoundTask("Lab Homework Due", "Complete lab homework on recursion before the due date!", startDateAndTime7, dueDateAndTime2);
		task2 = new CompoundTask("Lecture Homework Due", "Complete coding homework for lecture!", startDateAndTime8, dueDateAndTime3);
		task3 = new CompoundTask("Javadocs", "Complete javadocs for programming assignment!", startDateAndTime9, dueDateAndTime8);
		task4 = new CompoundTask("Discrete Math Homework", "Complete all assignments before test!", startDateAndTime5, dueDateAndTime8);
		task5 = new CompoundTask("Apply for internship", "Be sure all information is filled out and resume is updated!", startDateAndTime5, dueDateAndTime1);
	}

	@Test
	public void testAddSubtask(){
		task1.addSubtask(compoundTaskPart1);
		task1.addSubtask(compoundTaskPart2);
		task2.addSubtask(compoundTaskPart3);
		task2.addSubtask(compoundTaskPart4);
		task2.addSubtask(compoundTaskPart5);
		task2.addSubtask(compoundTaskPart6);
		task2.addSubtask(compoundTaskPart7);
		task3.addSubtask(compoundTaskPart9);
		task4.addSubtask(compoundTaskPart10);
		task4.addSubtask(compoundTaskPart11);
		task4.addSubtask(compoundTaskPart12);
		task4.addSubtask(compoundTaskPart13);
		task5.addSubtask(compoundTaskPart14);
		task5.addSubtask(compoundTaskPart15);

		assertEquals(2, task1.getNumberOfSubtasks());
		assertEquals(5, task2.getNumberOfSubtasks());
		assertEquals(1, task3.getNumberOfSubtasks());
		assertEquals(4, task4.getNumberOfSubtasks());
		assertEquals(2, task5.getNumberOfSubtasks());
	}

	@Test
	public void testGetSubtask(){
		task1.addSubtask(compoundTaskPart1);
		task1.addSubtask(compoundTaskPart2);
		task2.addSubtask(compoundTaskPart3);
		task2.addSubtask(compoundTaskPart4);
		task2.addSubtask(compoundTaskPart5);
		task2.addSubtask(compoundTaskPart6);
		task2.addSubtask(compoundTaskPart7);
		task3.addSubtask(compoundTaskPart9);
		task4.addSubtask(compoundTaskPart10);
		task4.addSubtask(compoundTaskPart11);
		task4.addSubtask(compoundTaskPart12);
		task4.addSubtask(compoundTaskPart13);
		task5.addSubtask(compoundTaskPart14);
		task5.addSubtask(compoundTaskPart15);

		assertEquals(compoundTaskPart1, task1.getSubtask(0));
		assertEquals(compoundTaskPart3, task2.getSubtask(0));
		assertEquals(compoundTaskPart9, task3.getSubtask(0));
		assertEquals(compoundTaskPart10, task4.getSubtask(0));
		assertEquals(compoundTaskPart14, task5.getSubtask(0));
	}

	@Test
	public void testGetTitleMethod(){
		assertEquals("Lab Homework Due", task1.getTitle());
		assertEquals("Lecture Homework Due", task2.getTitle());
		assertEquals("Javadocs", task3.getTitle());
		assertEquals("Discrete Math Homework", task4.getTitle());
		assertEquals("Apply for internship", task5.getTitle());
	}

	@Test
	public void testGetDescriptionMethod(){
		assertEquals("Complete lab homework on recursion before the due date!", task1.getDescription());
		assertEquals("Complete coding homework for lecture!", task2.getDescription());
		assertEquals("Complete javadocs for programming assignment!", task3.getDescription());
		assertEquals("Complete all assignments before test!", task4.getDescription());
		assertEquals("Be sure all information is filled out and resume is updated!", task5.getDescription());
	}

	@Test
	public void testGetIsCompleteMethod(){
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
	public void testGetDueDateAndTime(){
		assertEquals(dueDateAndTime2, task1.getDueDateAndTime());
		assertEquals(dueDateAndTime3, task2.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task3.getDueDateAndTime());
		assertEquals(dueDateAndTime8, task4.getDueDateAndTime());
		assertEquals(dueDateAndTime1, task5.getDueDateAndTime());
	}

	@Test
	public void testSetTitle(){
		task1.setTitle("Lab 6 Due!");
		task2.setTitle("HW2 for Java Lecture Due!");
		task3.setTitle("Javadocs Assignment");
		task4.setTitle("Chapter 3 Homework");
		task5.setTitle("Apply for an Internship!");

		assertEquals("Lab 6 Due!", task1.getTitle());
		assertEquals("HW2 for Java Lecture Due!", task2.getTitle());
		assertEquals("Javadocs Assignment", task3.getTitle());
		assertEquals("Chapter 3 Homework", task4.getTitle());
		assertEquals("Apply for an Internship!", task5.getTitle());
	}

	@Test
	public void testSetDescription(){
		task1.setDescription("A description");
		task2.setDescription("Another description");
		task3.setDescription("One more description");
		task4.setDescription("OMG, another description");
		task5.setDescription("I cannot. It's another description");

		assertEquals("A description", task1.getDescription());
		assertEquals("Another description", task2.getDescription());
		assertEquals("One more description", task3.getDescription());
		assertEquals("OMG, another description", task4.getDescription());
		assertEquals("I cannot. It's another description", task5.getDescription());
	}

	@Test
	public void testSetStartDateAndTime(){
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
	public void testSetDueDateAndTime(){
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

		compoundTaskPart1.complete(completionDateAndTime1);
		compoundTaskPart2.complete(completionDateAndTime1);
		compoundTaskPart3.complete(completionDateAndTime1);
		compoundTaskPart4.complete(completionDateAndTime1);
		compoundTaskPart5.complete(completionDateAndTime1);
		compoundTaskPart6.complete(completionDateAndTime1);
		compoundTaskPart7.complete(completionDateAndTime1);
		compoundTaskPart9.complete(completionDateAndTime1);
		compoundTaskPart10.complete(completionDateAndTime1);
		compoundTaskPart11.complete(completionDateAndTime1);
		compoundTaskPart12.complete(completionDateAndTime1);
		compoundTaskPart13.complete(completionDateAndTime1);
		compoundTaskPart14.complete(completionDateAndTime1);
		compoundTaskPart15.complete(completionDateAndTime1);

		task1.addSubtask(compoundTaskPart1);
		task1.addSubtask(compoundTaskPart2);
		task2.addSubtask(compoundTaskPart3);
		task2.addSubtask(compoundTaskPart4);
		task2.addSubtask(compoundTaskPart5);
		task2.addSubtask(compoundTaskPart6);
		task2.addSubtask(compoundTaskPart7);
		task3.addSubtask(compoundTaskPart9);
		task4.addSubtask(compoundTaskPart10);
		task4.addSubtask(compoundTaskPart11);
		task4.addSubtask(compoundTaskPart12);
		task4.addSubtask(compoundTaskPart13);
		task5.addSubtask(compoundTaskPart14);
		task5.addSubtask(compoundTaskPart15);

		task1.complete(completionDateAndTime2);
		task2.complete(completionDateAndTime2);
		task3.complete(completionDateAndTime2);
		task4.complete(completionDateAndTime2);
		task5.complete(completionDateAndTime2);

		assertTrue(task1.getIsComplete());
		assertTrue(task2.getIsComplete());
		assertTrue(task3.getIsComplete());
		assertTrue(task4.getIsComplete());
		assertTrue(task5.getIsComplete());
	}


}