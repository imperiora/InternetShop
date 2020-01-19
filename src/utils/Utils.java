package utils;
import model.RecSupplies;
import model.ProSupplies;


public class Utils {
	public static ProSupplies[] getProSupplies() {

		ProSupplies[] pro1 = { new ProSupplies("saw", 235.6, 44, 7),
								new ProSupplies("tent", 2400, 325, 2),
								new ProSupplies("ax", 450, 35, 2),
								new ProSupplies("knife", 120, 200, 17)};
		return pro1;
	}
	//RecSupplies recSupplies = new RecSupplies();
	public static RecSupplies[] getRecSupplies() {
		RecSupplies[] rec1 = { new RecSupplies("tennis requet", 320.2, 50, 4, 5),
				new RecSupplies("rectent", 2400, 325, 2, 120),
				new RecSupplies("recax", 450, 35, 2, 243),
				new RecSupplies("amateurknife", 120, 200, 17, 436)
		};
		return rec1;
	}
	
}