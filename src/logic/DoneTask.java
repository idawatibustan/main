package logic;

import java.util.ArrayList;

import storage.Output;

public class DoneTask implements Command {
	
	private int index;
	
	/***********CONSTRUCTOR**********/
	public DoneTask() {

	}
	
	@Override
	public Output execute() {
		return null;
		// TODO Auto-generated method stub

	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}
	
	/**********  GETTER   **********/
	public int getIndex() {
		return index;
	}
	
	/**********  SETTER   **********/
	public void setIndex(int index) {
		this.index = index;
	}
}
