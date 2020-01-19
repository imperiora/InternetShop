package controller;

import model.RecSupplies;
import utils.Utils;
import view.RecSuppliesView;

public class RecSuppliesController {
	public void list2() {
		RecSupplies[] rec1 = Utils.getRecSupplies();
		RecSuppliesView recsuppliesView = new RecSuppliesView();
		recsuppliesView.listAll(rec1);
}

}
