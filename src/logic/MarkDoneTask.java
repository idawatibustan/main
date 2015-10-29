package logic;

import storage.Output;

public class MarkDoneTask implements Command {
	private State currState;
	private int index;
	
	/***********CONSTRUCTOR**********/
	public MarkDoneTask() {

	}
	
	@Override
	public Output execute() {
		Task task = this.currState.getTaskList().remove(this.index-1);
		task.markDone();
		this.currState.add(task);
		this.currState.sort();
		return null;
		// TODO Auto-generated method stub

	}

	/**********  GETTER   **********/
	public int getIndex() {
		return index;
	}
	
	@Override
	public State getCurrState() {
		return currState;
	}
	
	/**********  SETTER   **********/
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void setCurrState(State state) {
		currState = state;
		
	}
	
	@Override
	public boolean isMutator(Command task) {
		return true;
	}


	

}