package de.uni.koeln.sse.se;

public class MovingCosts implements Visitor {
	private double tmpMovingcosts;

	public MovingCosts() {

	}

	public void visitElectronic(Electronic e) {
		if (e.getFragile()) {
			tmpMovingcosts = ((double) e.getWeight() / 10.0) * 5.0;
		}
		if (!e.getFragile()) {
			tmpMovingcosts = ((double) e.getWeight() / 15.0) * 5.0;
			
		}
		System.out.println(e.getName() + " : ");
	}

	public void visitFurniture(Furniture f) {
		tmpMovingcosts = ((double) f.getWeight() / 20.0) * 5.0;
		System.out.println(f.getName() + " : ");
	}

	public void visitGlass(Glass g) {
		if (g.getTickness() == 1) {
			tmpMovingcosts = ((double) g.getLenght() * 2.0);
		}
		if (g.getTickness() == 2) {
			tmpMovingcosts = ((double) g.getLenght() * 1.2);
		}
		if (g.getTickness() == 3) {
			tmpMovingcosts = ((double) g.getLenght() * 0.7);
		}
		System.out.println(g.getName() + " : ");
	}

	public double getMovingCosts(HouseholdItem h) {
		tmpMovingcosts = 0;
		h.accept(this);
		return tmpMovingcosts;
	}
}
