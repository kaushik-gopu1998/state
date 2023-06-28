package com.state.states;
import com.state.context.GumballMachine;
public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
		throw new UnsupportedOperationException("You can't insert quarter");
	}
	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	@Override
	public void turnCrank() {
		System.out.println("You turned");
		gumballMachine.setState(gumballMachine.getSoldState());
	}
	@Override
	public void dispense() {	
		throw new UnsupportedOperationException("No gumball dispensed");
	}
}
