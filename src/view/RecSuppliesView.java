package view;

import model.RecSupplies;

public class RecSuppliesView {
	public void listAll(RecSupplies[] rec1) {
		for(RecSupplies recsupplies: rec1) {
			if (recsupplies == null) {
				continue;
			}
			System.out.println(recsupplies);
		}
	}
}
