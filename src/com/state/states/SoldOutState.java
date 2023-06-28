package com.state.states;

import com.state.context.GumballMachine;

public class SoldOutState implements State{
	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

}
