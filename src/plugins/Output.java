package plugins;

import main.PluginIF;

public class Output implements PluginIF {

	public void printTestMsg() {
		System.out.println("---> TEST PLUGIN TEST <---");
	}

}