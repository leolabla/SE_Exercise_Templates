package de.uni.koeln.sse.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		// Initialise some household
		List<HouseholdItem> householdItmes = new ArrayList<>();

		Electronic microwaveOven = new Electronic("Microwave Oven", 37, 48, 27, 13, false);
		Electronic tv = new Electronic("TV", 122, 73, 15, 18, true);

		Glass wineGlass = new Glass("Wine glasses", 33, 28, 23, 1);
		Glass coffeeTable = new Glass("Glass Coffee Table ", 80, 80, 45, 3);

		Furniture bed = new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard = new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);

		List<HouseholdItem> namesList = Arrays.asList(microwaveOven, tv, wineGlass, coffeeTable, bed, cupboard);
		householdItmes.addAll(namesList);

		MovingCosts mc = new MovingCosts();
		System.out.println("visit Costs for HousehouldItem is: " + mc.getMovingCosts(microwaveOven) + " Euros");
		System.out.println("visit Costs for HousehouldItem is: " + mc.getMovingCosts(tv) + " Euros");
		System.out.println("visit Costs for HousehouldItem is: " + mc.getMovingCosts(wineGlass) + " Euros");
		System.out.println("visit Costs for HousehouldItem is: " + mc.getMovingCosts(coffeeTable) + " Euros");
		System.out.println("visit Costs for HousehouldItem is: " + mc.getMovingCosts(bed) + " Euros");
		System.out.println("visit Costs for HousehouldItem is: " + mc.getMovingCosts(cupboard) + " Euros");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		PackingInstructions pi = new PackingInstructions();
		System.out.println(pi.getPackingInstructions(microwaveOven));
		System.out.println(pi.getPackingInstructions(cupboard));
		System.out.println(pi.getPackingInstructions(bed));
		System.out.println(pi.getPackingInstructions(coffeeTable));
		System.out.println(pi.getPackingInstructions(wineGlass));
		System.out.println(pi.getPackingInstructions(tv));

	}

}
