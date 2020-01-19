package view;

import model.ProSupplies;
//import model.RecSupplies;
public class ProSuppliesView {
	public void listAll(ProSupplies[] pro1) {
		for(ProSupplies prosupplies: pro1) {
			if (prosupplies == null) {
				continue;
			}
			System.out.println(prosupplies);
		}
	}
}
/*public class RecSuppliesView {
	public void listAll(RecSupplies[] rec1) {
		for(RecSupplies recsupplies: rec1) {
			if (recsupplies == null) {
				continue;
			}
			System.out.println(recsupplies);
		}
	}
}*/
