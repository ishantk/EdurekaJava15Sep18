package co.edureka;

interface State{
	String showState();
}

class Placed implements State{
	public String showState() {
		return ">> Order Placed";
	}
}

class Shipped implements State{
	public String showState() {
		return ">> Order Shipped";
	}
}

class Delivered implements State{
	public String showState() {
		return ">> Order Delivered";
	}
}

class Order{
	
	State state; // Has-A Relation

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}

public class StatePattern {

	public static void main(String[] args) {
		
		State state1 = new Placed();
		State state2 = new Shipped();
		State state3 = new Delivered();
		
		Order order = new Order();
		order.setState(state1);
		
		System.out.println(order.getState().showState());
		
		// After Order is Placed it goes to Logistics
		// Logistics Updates the state
		
		order.setState(state2);
		System.out.println(order.getState().showState());
		
		// once the order is delivered to customer, sales man shall update the state
		order.setState(state3);
		System.out.println(order.getState().showState());

	}

}
