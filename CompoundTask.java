/**
 * @author: Keller Payne
 * @version: 0.0.1
 * @since: October 26, 2024
 * @see: Class DateAndTimeCombo
 * @see: Class SimpleTask
 * @see: Class AbstractTask
 * 
 * A class that represents a compound task, which relies on completion of subtasks 
 * before it can be marked as complete, that can be found in a to-do list.
 */

public class CompoundTask extends AbstractTask{

	private String title;								//Title of CompoundTask
	private String description;							//Description of CompoundTask
	private boolean isComplete;							//Indicates if task has been completed
	private DateAndTimeCombo startDateAndTime;			//Start date and time of CompoundTask
	private DateAndTimeCombo dueDateAndTime;			//Due date and time of CompoundTask
	private DateAndTimeCombo completionDateAndTime;		//Date and time CompoundTask was completed
	private SimpleTask[] subtasks;						//Array of subtasks to be completed before CompoundTask is completed
	private int numberOfTasks = 0;						//Number of subtasks associated with the CompoundTask


	/**
	 * Creates an instance of CompoundTask, initializing a SimpleTask array of size 10 to store
	 * subtasks required to complete CompoundTask.
	 * 
	 * @param title Name of CompoundTask
	 * @param description Detailed summary of the CompoundTask
	 * @param isComplete Indicates if a task has been completed
	 * @param startDateAndTime Instance of DateAndTimeCombo representing start date and time of CompoundTask
	 * @param dueDateAndTime Instance of DateAndTimeCombo representing due date and time of CompoundTask
	 * @param completionDateAndTime Instance of DateAndTimeCombo representing date and time CompoundTask was completed.
	 * 
	 * @custom.require title is a String
	 * @custom.require description is a String
	 * @custom.require isComplete is boolean
	 * @custom.require startDateAndTime instance of DateAndTimeCombo
	 * @custom.require dueDateAndTime instance of DateAndTimeCombo
	 * @custom.require completionDateAndTime instance of DateAndTimeCombo
	 */

	public CompoundTask(String title, String description, boolean isComplete, DateAndTimeCombo startDateAndTime, DateAndTimeCombo dueDateAndTime, DateAndTimeCombo completionDateAndTime){
		this.title = title;
		this.description = description;
		this.isComplete = isComplete;
		this.startDateAndTime = startDateAndTime;
		this.dueDateAndTime = dueDateAndTime;
		this.completionDateAndTime = completionDateAndTime;

		this.subtasks = new SimpleTask[10];
	}

	/**
	 * Overloaded constructor that creates an instance of CompoundTask, initializing a SimpleTask array of
	 * size 10 to store subtasks required to complete CompoundTask, and automatically sets  isComplete to 
	 * false and completionDateAndTime to null.
	 * @param title Name of CompoundTask
	 * @param description Detailed summary of the CompoundTask
	 * @param startDateAndTime Instance of DateAndTimeCombo representing start date and time of CompoundTask
	 * @param dueDateAndTime Instance of DateAndTimeCombo representing due date and time of CompoundTask
	 * 
	 * @custom.require title is a String
	 * @custom.require description is a String
	 * @custom.require startDateAndTime instance of DateAndTimeCombo
	 * @custom.require dueDateAndTime instance of DateAndTimeCombo
	 */

	public CompoundTask(String title, String description, DateAndTimeCombo startDateAndTime, DateAndTimeCombo dueDateAndTime){
		this(title, description, false, startDateAndTime, dueDateAndTime, null);

		this.subtasks = new SimpleTask[10];
	}

	/**
	 * Method that adds a subtask to the SimpleTask array. 
	 * 
	 * @param subtask Instance of SimpleTask to be added to subtasks array.
	 * 
	 * @custom.require subtask instance of SimpleTask
	 * @custom.invariant subtask.length >= 0 && <= 10
	 * @custom.ensure this.getNumberOfSubtasks() == old.getNumberOfSubtasks() + 1
	 */

	public void addSubtask(SimpleTask subtask){
		if (subtasks.length <= 10){
			this.subtasks[this.numberOfTasks] = subtask;
			this.numberOfTasks++;
		} else {
			System.out.println("Number of allowed subtasks exceeded!");
		}
	}

	/**
	 * Returns subtask stored at given index in SimpleTask array stored in subtasks.
	 * 
	 * @param index
	 * @return SimpleTask stored in SimpleTask array.
	 * 
	 * @custom.require index <= 10
	 */

	public SimpleTask getSubtask(int index){
		
		SimpleTask taskAtIndex = null;

		if(index < subtasks.length){
			taskAtIndex = this.subtasks[index];
		} else {
			System.out.println("Specified index greater than number of allowed subtasks!");
		}
		
		return taskAtIndex;
	}

	/**
	 * Method that returns number of subtasks stored in SimpleTask array.
	 * @return Number of SimpleTasks stored in SimpleTask array.
	 */

	public int getNumberOfSubtasks(){
		return this.numberOfTasks;
	}

	/**
	 * Overridden method from AbstractTask class that returns title of CompoundTask
	 * 
	 * @return Title of CompoundTask
	 */

	@Override
	public String getTitle(){
		return this.title;
	}

	/**
	 * Overridden method from AbstractTask class that returns description of CompoundTask.
	 * 
	 * @return Description of CompoundTask
	 */

	@Override
	public String getDescription(){
		return this.description;
	}

	/**
	 * Overridden method from AbstractTask class that returns if CompoundTask has been completed.
	 * 
	 * @return boolean indicating if CompoundTask has been completed.
	 */

	@Override
	public boolean getIsComplete(){
		return this.isComplete;
	}

	/**
	 * Overridden method from AbstractTask class that returns start date and time of CompoundTask.
	 * 
	 * @return Instance of DateAndTimeCombo indicating start date and time of CompoundTask.
	 */

	@Override
	public DateAndTimeCombo getStartDateAndTime(){
		return this.startDateAndTime;
	}

	/**
	 * Overridden method from AbstractTask class that returns due date and time of CompoundTask.
	 * 
	 * @return Instance of DateAndTimeCombo indicating due date and time of CompoundTask.
	 */

	@Override
	public DateAndTimeCombo getDueDateAndTime(){
		return this.dueDateAndTime;
	}

	/**
	 * Overridden method from AbstractTask class that returns completion date and time of CompoundTask.
	 * 
	 * @return Instance of DateAndTimeCombo indicating completion date and time of CompoundTask.
	 */

	@Override
	public DateAndTimeCombo getCompletionDateAndTime(){
		return this.completionDateAndTime;
	}

	/**
	 * Overridden method from AbstractTask class that changes the title of CompoundTask.
	 * 
	 * @param title New title of CompoundTask
	 * 
	 * @custom.require title is a String
	 * @custom.ensure old.getTitle() != this.getTitle()
	 */

	@Override
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * Overridden method from AbstractTask class that changes description of CompoundTask.
	 * 
	 * @param description New description of CompoundTask
	 * 
	 * @custom.require description is a String
	 * @custom.ensure old.getDescription() != this.getDescription()
	 */

	@Override
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Overridden method from AbstractTask class that changes start date and time of CompoundTask.
	 * 
	 * @param startDateAndTime New start date and time of CompoundTask.
	 * 
	 * @custom.require startDateAndTime instanceof DateAndTimeCombo
	 * @custom.ensure old.getstartDateAndTime() != this.getStartDateAndTime()
	 */

	@Override
	public void setStartDateAndTime(DateAndTimeCombo startDateAndTime){
		this.startDateAndTime = startDateAndTime;
	}

	/**
	 * Overridden method from AbstractTask class that changes due date and time of CompoundTask.
	 * 
	 * @param dueDateAndTime New due date and time of CompoundTask.
	 * 
	 * @custom.require dueDateAndTime instanceof DateAndTimeCombo
	 * @custom.ensure old.getDueDateAndTime() != this.getDueDateAndTime()
	 */

	@Override
	public void setDueDateAndTime(DateAndTimeCombo dueDateAndTime){
		this.dueDateAndTime = dueDateAndTime;
	}

	/**
	 * Overridden method from AbstractTask class that sets CompoundTask as complete after checking for completion
	 * of all subtasks associated with CompoundTask, as well as setting the completion date and time for CompoundTask.
	 * 
	 * @param completionDateAndTime New completion date and time of CompoundTask.
	 * 
	 * @custom.require completionDateAndTime instance of DateAndTimeCombo
	 * @custom.ensure this.getCompletionDateAndTime() != null
	 */

	@Override
	public void complete(DateAndTimeCombo completionDateAndTime){
		
		boolean allTasksComplete = false;

		for (int i = 0; i < subtasks.length; i++){
			if(this.subtasks[i].getIsComplete()){
				allTasksComplete = true;
			}
		}
		
		if(allTasksComplete == true){
			this.completionDateAndTime = completionDateAndTime;
			this.isComplete = true;
		} else {
			System.out.println("All subtasks are not complete. Ensure all subtasks are complete before continuing!");
		}
	}

	/**
	 * Overridden toString() method to print information about CompoundTask including title, description,
	 * number of subtasks, start date and time, due date and time, and if the task is complete. If task is
	 * complete, it will print completion date and time of CompoundTask. If all subtasks are not completed,
	 * will ask user to complete all subtasks before continuing.
	 * 
	 * @return String of relevant information related to CompoundTask.
	 */

	@Override
	public String toString(){
		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(title).append(" (").append(description).append(")\n");
		stringBuilder.append("Number of Subtasks: ").append(numberOfTasks).append("\n");
		stringBuilder.append("Start: ").append(startDateAndTime).append("\n");
		stringBuilder.append("Due: ").append(dueDateAndTime).append("\n");
		stringBuilder.append("Complete: ").append(isComplete);
		
		if (isComplete){
			stringBuilder.append(" ").append(completionDateAndTime).append("\n");
		} else {
			stringBuilder.append("Finish all subtasks to set task as complete!\n");
		}
		
		return stringBuilder.toString();
	}

} // end class CompoundTask