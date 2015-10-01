package planit;

public class Command {

	

	private static final int INDEX_FIRST = 0;
	private static final int INDEX_SECOND = 1;

	private static final int RANGE_ARRAY_SIZE = 2;

	private static StringParser sp = new StringParser();

	private String userStringInput;

	private static String userCommand = null; //Action type

	private static String userEventTask = null; // Type of event/task

	private static String[] userDateRange = new String[RANGE_ARRAY_SIZE]; // Array of dates
	private static String userDateString = null; // formatted string of date/dates
	
	private static String[] userTimeRange = new String[RANGE_ARRAY_SIZE];
	private static String userTimeString = null; // formatted string of date/dates
	
	
	public Command(String userStringInput) {
		setUserStringInput(userStringInput);
		executeParsing(userStringInput);
	}

	private static void executeParsing(String userStringInput) {
		setUserCommand(userStringInput);
		setUserEventTask(userStringInput);
		setUserDate(userStringInput);
		setUserTime(userStringInput);		
	}


	/*
	 * ACCESSORS
	 * 
	 * Used by :logic to determine what to do with the <event>, <date> and
	 * <time> inputs
	 * 
	 */
	
	public String getUserCommand() {
		return userCommand;
	}

	public String getUserEventTask() {
		return userEventTask;
	}

	public String[] getUserDateRange() {
		return userDateRange;
	}

	public String getUserDateStart() {
		return userDateRange[INDEX_FIRST];
	}

	public String getUserDateEnd() {
		return userDateRange[INDEX_SECOND];
	}

	public String[] getUserTimeRange() {
		return userTimeRange;
	}

	public String getUserTimeStart() {
		return userTimeRange[INDEX_FIRST];
	}

	public String getUserTimeEnd() {
		return userTimeRange[INDEX_SECOND];
	}

	public String getUserStringInput() {
		return userStringInput;
	}

	public String getUserDateString() {
		return userDateString;
	}
	
	public String getUserTimeString() {
		return userTimeString;
	}
	
	/*
	 * MUTATORS
	 * 
	 * Sets the relevant data to the attributes using methods from StringParser
	 * class
	 * 
	 */
	public void setUserStringInput(String userStringInput) {
		this.userStringInput = userStringInput;
	}
	
	private static void setUserCommand(String userStringInput) {
		userCommand = sp.extractUserCommand(userStringInput);
	}
	
	private static void setUserEventTask(String userStringInput) {
		userEventTask = sp.extractUserEventTask(userStringInput);
	}
	
	private static void setUserDate(String userStringInput) {
		userDateRange = sp.extractUserDate(userStringInput);
	}
	
	private static void setUserTime(String userStringInput) {
		userTimeRange = sp.extractUserTime(userStringInput);
	}
	
	public void setUserDateString(String dateString) {
		userDateString = dateString;
	}
	
	public void setUserTimeString(String timeString) {
		userTimeString = timeString;
	}
	
}
