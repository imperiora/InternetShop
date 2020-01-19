package controller;

import model.ProSupplies;
import utils.Utils;
import view.ProSuppliesView;

public class ProSuppliesController implements ICommands {

	@Override
	public String[] getCommands() {
		String[] commands = {"list", "listPro", "listRec"};
			return commands;
	}
	public void list() {
		ProSupplies[] pro11 = Utils.getProSupplies();
		ProSuppliesView prosuppliesView = new ProSuppliesView();
		prosuppliesView.listAll(pro11);
	}
	//public void sortByPrice(int price) {
	//	ProSupplies[] pro1 = Utils.getProSupplies();
		//pro1.sort(new Comparator<ProSupplies>() {)
	//}
	
	
}