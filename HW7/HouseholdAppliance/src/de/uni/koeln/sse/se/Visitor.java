package de.uni.koeln.sse.se;

public interface Visitor {

	void visitElectronic(Electronic e);
	void visitGlass(Glass g);
	void visitFurniture(Furniture f);
	
}
