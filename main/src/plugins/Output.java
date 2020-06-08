package plugins;

import main.PluginIF;
import output.Main;

public class Output implements PluginIF {

	public void printTestMsg() {
		//System.out.println("---> TEST PLUGIN TEST <---");
                
            output.Main myMain = new output.Main();
            myMain.printTestMsg();
	}

}