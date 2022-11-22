package de.uni.koeln.sse.se;

public class PackingInstructions implements Visitor {

	private String filler;

	public PackingInstructions() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitElectronic(Electronic e) {
		filler = e.getName() + ": should be covered with Polyethylene foram film and packed in a box with dimensions "
				.concat(Integer.toString(e.getHeight() + 1)).concat("x").concat(Integer.toString(e.getWidth() + 1))
				.concat("x").concat(Integer.toString(e.getLenght() + 1));

	}

	@Override
	public void visitGlass(Glass g) {
		filler = (g.getName() + ": should be wrapped with bubble wraps and packet in a box with dimensinos: "
				.concat(Integer.toString(g.getHeight() + 1)).concat("x").concat(Integer.toString(g.getWidth() + 1))
				.concat("x").concat(Integer.toString(g.getLenght() + 1)));
	}

	@Override
	public void visitFurniture(Furniture f) {
		filler = f.getName() + ": should be covered with waterproof covers with area of: "
						.concat(Integer.toString(f.getLenght()).concat("x").concat(Integer.toString(f.getWidth())));
	}

	public String getPackingInstructions(HouseholdItem h) {
		filler = "";
		h.accept(this);
		return filler;
	}

}
