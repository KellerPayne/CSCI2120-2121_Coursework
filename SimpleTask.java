/**
 * @author: Keller Payne
 * @version: 0.0.2
 * @since: October 26, 2024
 * @see: Class DateAndTimeCombo
 * @see: Class AbstractTask
 * 
 * A class that represents a single task that can be found in a to-do list.
 */

public class SimpleTask extends AbstractTask{

	private String title;								//Title of SimpleTask
	private String description;							//Description of SimpleTask
	private boolean isComplete;							//Indicates if task has been completed
	private DateAndTimeCombo startDateAndTime;			//Start date and time of SimpleTask
	private DateAndTimeCombo dueDateAndTime;			//Due date and time of SimpleTask
	private DateAndTimeCombo completionDateAndTime;		//Date and time SimpleTask was completed

	/**
	 * Creates an instance of SimpleTask.
	 *
	 * @param title A String that acts as a short label for the task.
	 * @param description A String that provides a more detailed summary of the task.
	 * @param isComplete A boolean that represents if the task is finished or not.
	 * @param startDateAndTime An instance of DateAndTimeCombo that represents the start date and time of the task.
	 * @param dueDateAndTime An instance of DateAndTimeCombo that represents the due date and time of the task.
	 * @param completionDateAndTime An instance of DateAndTimeCombo that represents the date and time that the task was completed.
	 * 
	 */

	public SimpleTask(String title, String description, boolean isComplete, DateAndTimeCombo startDateAndTime, DateAndTimeCombo dueDateAndTime, DateAndTimeCombo completionDateAndTime){
		this.title = title;
		this.description = description;
		this.isComplete = isComplete;
		this.startDateAndTime = startDateAndTime;
		this.dueDateAndTime = dueDateAndTime;
		this.completionDateAndTime = completionDateAndTime;
	}

	/**
	 * Overloaded constructor that creates an instance of SimpleTask but sets isComplete and completionDateAndTime to default values.
	 * 
	 * @param title A String that acts as a short label for the task.
	 * @param description A String that provides a more detailed summary of the task.
	 * @param startDateAndTime An instance of DateAndTimeCombo that represents the start date and time of the task.
	 * @param dueDateAndTime An instance of DateAndTimeCombo that represents the due date and time of the task.
	 * 
	 */

	public SimpleTask(String title, String description, DateAndTimeCombo startDateAndTime, DateAndTimeCombo dueDateAndTime){
		this(title, description, false, startDateAndTime, dueDateAndTime, null);
	}

	/**
	 * Returns the title of the task.
	 * 
	 * @return Returns the value stored in title.
	 * 
	 */

	@Override
	public String getTitle(){
		return this.title;
	}

	/**
	 * Returns the description of the task. 
	 *
	 * @return Returns the value stored in description.
	 * 
	 */

	@Override
	public String getDescription(){
		return this.description;
	}

	/**
	 * Returns if the task is complete or not.
	 * 
	 * @return returns the value stored in isComplete.
	 * 
	 */

	@Override
	public boolean getIsComplete(){
		return this.isComplete;
	}

	/**
	 * Returns startDateAndTime.
	 * 
	 * @return Returns startDateAndTime.
	 * 
	 */

	@Override
	public DateAndTimeCombo getStartDateAndTime(){
		return this.startDateAndTime;
	}

	/**
	 * Returns dueDateAndTime.
	 * 
	 * @return Returns dueDateAndTime.
	 * 
	 */

	@Override
	public DateAndTimeCombo getDueDateAndTime(){
		return this.dueDateAndTime;
	}

	/**
	 * Returns completionDateAndTime. 
	 *
	 * @return Returns completionDateAndTime.
	 * 
	 */

	@Override
	public DateAndTimeCombo getCompletionDateAndTime(){
		return this.completionDateAndTime;
		
	}

	/**
	 * Sets the value of title.
	 * 
	 * @param title A String that acts as a short label for the task.
	 * 
	 */

	@Override
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * Sets the value of description.
	 * 
	 * @param description A String that provides a more detailed summary of the task.
	 * 
	 */

	@Override
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 *Sets the startDateAndTime.
	 * 
	 * @param startDateAndTime An instance of DateAndTimeCombo that represents the startDateAndTime.
	 * 
	 */

	@Override
	public void setStartDateAndTime(DateAndTimeCombo startDateAndTime){
		this.startDateAndTime = startDateAndTime;
	}

	/**
	 * Sets the dueDateAndTime.
	 * 
	 * @param dueDateAndTime An instance of DateAndTimeCombo that represents the dueDateAndTime.
	 * 
	 */

	@Override
	public void setDueDateAndTime(DateAndTimeCombo dueDateAndTime){
		this.dueDateAndTime = dueDateAndTime;
	}

	/**
	 * Sets completionDateAndTime to an instance of DateAndTimeCombo and sets isComplete to true.
	 * 
	 * @param completionDateAndTime An instance of DateAndTimeCombo that represents the completionDateAndTime.
	 * 
	 */

	@Override
	public void complete(DateAndTimeCombo completionDateAndTime){
		this.completionDateAndTime = completionDateAndTime;
		this.isComplete = true;
	}

	@Override
	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(title).append(" (").append(description).append(")\n");
		stringBuilder.append("Start: ").append(startDateAndTime).append("\n");
		stringBuilder.append("Due: ").append(dueDateAndTime).append("\n");
		stringBuilder.append("Complete: ").append(isComplete);
		if (isComplete){
			stringBuilder.append(" ").append(completionDateAndTime).append("\n");
		}else{
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
	
} // end class SimpleTask