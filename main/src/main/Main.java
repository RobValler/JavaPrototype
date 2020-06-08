package main;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

	public static void main(String[] arguments) throws Throwable {
		new Main();
	}

	public Main() throws Throwable {	

		// load and instantiate the plugin
		File dir = new File("");
		URL loadPath = dir.toURI().toURL();
		URL[] classUrl = new URL[]{loadPath};
		ClassLoader cl = new URLClassLoader(classUrl);
		Class loadedClass = cl.loadClass("plugins.Output");
		PluginIF modInstance = (PluginIF)loadedClass.getDeclaredConstructor().newInstance();

		// call the plugin method
		modInstance.printTestMsg();
	}
}