package com.state.context;

import com.state.states.HasQuarterState;
import com.state.states.NoQuarterState;
import com.state.states.SoldOutState;
import com.state.states.SoldState;
import com.state.states.State;

public class GumballMachine {
	State SoldoutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State state;
	int count=0;
	public GumballMachine(int numberGumballs){
		SoldoutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count=numberGumballs;
		if(numberGumballs>0) {
			state=noQuarterState;
		}else {
			state=SoldoutState;
		}
	}
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	public void setState(State state) {
		this.state = state;
	}
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot..");
		if(count>0) {
			count=count-1;
		}
	}
	public State getSoldoutState() {
		return SoldoutState;
	}
	public void setSoldoutState(State soldoutState) {
		SoldoutState = soldoutState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}
	public State getSoldState() {
		return soldState;
	}
	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
