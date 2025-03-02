/**
 * @author: Keller Payne
 * @version 0.0.1
 * @since October 26, 2024
 * @see: Class DateAndTimeCombo
 * 
 * An abstract class that can be extended to represent tasks in a to-do list.
 */

public abstract class AbstractTask{

	private String title;							// All subclasses must have a title instance variable
	private String description;						// All subclasses must have a description instance variable
	private boolean isComplete;						// All subclasses must have an isComplete instance variable
	private DateAndTimeCombo startDateAndTime;		// All subclasses must have an instance variable that is an instance of DateAndTimeCombo called startDateAndTime
	private DateAndTimeCombo dueDateAndTime;		// All subclasses must have an instance variable that is an instance of DateAndTimeCombo called dueDateAndTime 
	private DateAndTimeCombo completionDateAndTime;	// All subclasses must have an instance variable that is an instance of DateAndTimecombo called completionDateAndTime

	/**
	 * Getter method for subclasses to override to return the title of the task.
	 * 
	 * @return String title of task
	 */	

	public abstract String getTitle();

	/**
	 * Getter method for subclasses to override to return the description of the task.
	 * 
	 * @return String description of task
	 */

	public abstract String getDescription();

	/**
	 * Getter method for subclasses to override to return boolean indicating if task has been completed.
	 * 
	 * @return boolean value indicating task completeness
	 */

	public abstract boolean getIsComplete();

	/**
	 * Getter method for subclasses to override to return DateAndTimeCombo instance for the start date and time of task.
	 * 
	 * @return DateAndTimeCombo instance of start date and time.
	 */

	public abstract DateAndTimeCombo getStartDateAndTime();

	/**
	 * Getter method for subclasses to override to return DateAndTimeCombo instance for the due date and time of task.
	 * 
	 * @return DateAndTimeCombo instance of due date and time.
	 */

	public abstract DateAndTimeCombo getDueDateAndTime();

	/**
	 * Getter method for subclasses to override to return DateAndTimeCombo instance for the completion date and time
	 * of task.
	 * 
	 * @return DateAndTimeCombo instance of completion date and time.
	 */

	public abstract DateAndTimeCombo getCompletionDateAndTime();

	/**
	 * Setter method for subclasses to override to set title of task.
	 * 
	 * @param title New title of task.
	 * 
	 * @custom.require title is a String
	 * @custom.ensure old.getTitle() != this.getTitle()
	 */

	public abstract void setTitle(String title);

	/**
	 * Setter method for subclasses to override to set description of task.
	 * 
	 * @param description New description of task.
	 * 
	 * @custom.require description is a String.
	 * @custom.ensure old.getDescription() != this.getDescription()
	 */

	public abstract void setDescription(String description);

	/**
	 * Setter method that changes date and time of task.
	 * 
	 * @param startDateAndTime New start date and time of task.
	 * 
	 * @custom.require startDateAndTime instanceof DateAndTimeCombo
	 * @custom.ensure old.getStartDateAndTime() != this.getStartDateAndTime()
	 */

	public abstract void setStartDateAndTime(DateAndTimeCombo startDateAndTime);

	/**
	 * Setter method that changes due date and time of task.
	 * 
	 * @param dueDateandTime New due date and time of task.
	 * 
	 * @custom.require dueDateandTime instanceof DateAndTimeCombo
	 * @custom.ensure old.getDueDateAndTIme() != this.getDueDateAndTime()
	 */

	public abstract void setDueDateAndTime(DateAndTimeCombo dueDateAndTime);

	/**
	 * Setter method to mark task as complete. Subclasses must override method to ensure correct implementation
	 * within each task type's boundaries.
	 * 
	 * @param completionDateAndTime Date and time task was completed.
	 * 
	 * @custom.require completionDateAndTime instanceof DateAndTimeCombo
	 * @custom.ensure this.getCompletionDateAndTime() != null;
	 */

	public abstract void complete(DateAndTimeCombo completionDateAndTime);


} // end class AbstractTask