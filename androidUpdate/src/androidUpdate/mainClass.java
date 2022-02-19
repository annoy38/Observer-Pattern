package androidUpdate;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UpdateFileClass message;
		RealmeClass realme = new RealmeClass();
		OnePlusClass onePlus = new OnePlusClass();
		RedmiClass redmi = new RedmiClass();
		operationClass operation = new operationClass();
		operation.attachMobile(realme);
		operation.attachMobile(onePlus);
		operation.attachMobile(redmi);
		operation.notifyUpdate(new UpdateFileClass("Add dark Theam in android 3.5.6 Update"));
	}

}
