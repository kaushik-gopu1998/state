package com.state.client;

import com.state.context.GumballMachine;

public class Client {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
	}
}
