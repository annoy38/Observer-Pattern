package androidUpdate;

import java.awt.List;
import java.util.ArrayList;

public class operationClass implements IallMobile{

	private ArrayList<Imobile> mobile = new ArrayList<>();
	@Override
	public void attachMobile(Imobile m) {
		// TODO Auto-generated method stub
		mobile.add(m);
		
	}

	@Override
	public void dettachMobile(Imobile m) {
		// TODO Auto-generated method stub
		mobile.remove(m);
		
	}

	@Override
	public void notifyUpdate(UpdateFileClass u) {
		// TODO Auto-generated method stub
		for(Imobile m: mobile) {
			m.androidUpdate(u);
		}
	}

}
