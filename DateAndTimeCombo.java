/**
 * @author: Keller Payne
 * @version: 0.0.2
 * @since: 10/26/2024
 * @see: Class MyDate
 * @see: Class Time2
 * 
 * 
 * A class that represents a specific date and time.
 * 
 */

public class DateAndTimeCombo implements Comparable<DateAndTimeCombo>{

	private MyDate date;
	private Time2 time;

/**
 * Creates a new DateAndTimeCombo object.
 * 
 * @param day An integer representing the day of the month.
 * @param month An integer representing the month.
 * @param year An integer representing the year.
 * @param hour An integer representing hours in a 24 hour format.
 * @param minute An integer representing minutes.
 * @param second An integer representing seconds.
 * @return An instance of a new DateAndTimeCombo Object.
 * @throws IllegalArgumentException if invalid inputs are used for any parameters.
 * 
 */
	public DateAndTimeCombo(MyDate date, Time2 time){

		this.date = date;
		this.time = time;
	}

	/**
	 * Returns the date.
	 * 
	 * @return Returns myDate.
	 */

	public MyDate getDate(){
		return this.date;
	}

	/**
	 * Returns the time.
	 * 
	 * @return Returns myTime.
	 */

	public Time2 getTime(){
		return this.time;
	}

	/**
	 * Creates a new instance of MyDate and sets myDate equal to it.
	 * 
	 * @param day integer representing day of the month of new MyDate instance.
	 * @param month integer representing month of new MyDate instance.
	 * @param year integer representing year of new MyDate instance.
	 * @see: Class MyDate
	 * 
	 */

	public void setDate(MyDate date){
		this.date = date;
	}

	/**
	 * Creates a new instance of MyTime and sets myTime equal to it.
	 * 
	 * @param hour integer representing hour of new MyTime instance.
	 * @param minute integer representing minute of new MyTime instance.
	 * @param second integer representing second of new MyTime instance.
	 * @see: Class Time2
	 * 
	 */

	public void setTime(Time2 time){
		this.time = time;
	}

	@Override
	public String toString() {
		String returnVal = "";
		returnVal += this.date.toString();
		returnVal += " at " + this.time.toString();
		return returnVal;
	}

	@Override
	public int compareTo(DateAndTimeCombo otherCombo){
        if (this.equals(otherCombo)){
            return 0;
        }
        
        if (this.date.getYear() == otherCombo.date.getYear()){
        		if (this.date.getMonth() == otherCombo.date.getMonth()){
        			if (this.date.getDay() == otherCombo.date.getDay()){
        				if (this.time.getHour() == otherCombo.time.getHour()){
        					if (this.time.getMinute() == otherCombo.time.getMinute()){
        						if (this.time.getSecond() == otherCombo.time.getSecond()){
        							return 0;
        						} else if (this.time.getSecond() < otherCombo.time.getSecond()){
        							return -1;
        						} else {
        							return 1;
        						}
        					} else if (this.time.getMinute() < otherCombo.time.getMinute()){
        						return -1;
        					} else {
        						return 1;
        					}
        				} else if (this.time.getHour() < otherCombo.time.getHour()){
        					return -1;
        				} else {
        					return 1;
        				}
        			} else if (this.date.getDay() < otherCombo.date.getDay()){
        				return -1;
        			} else {
        				return 1;
        			}
        		} else if (this.date.getMonth() < otherCombo.date.getMonth()){
        			return -1;
        		} else {
        			return 1;
        		}
        } else if (this.date.getYear() < otherCombo.date.getYear()){
        	return -1;
        } else {
        	return 1;
        }
    }

    @Override
    public boolean equals(Object otherCombo){
        if(!(otherCombo instanceof DateAndTimeCombo)){
            return false;
        }
        DateAndTimeCombo other = (DateAndTimeCombo) otherCombo;
        return this.date.equals(other.date) && this.time.equals(other.time);
    }

} // End Class DateAndTimeCombo