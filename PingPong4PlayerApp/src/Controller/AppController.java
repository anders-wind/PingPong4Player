/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Client.ClientApp;
import Server.ServerApp;
import Client.MainFrame;

/**
 *
 * @author Anders Wind - awis@itu.dk
 */
public class AppController {

	private static ChooseServerOrClientFrame chooseFrame;
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		chooseFrame = new ChooseServerOrClientFrame();
	}
	
	public static void startAsServer()
	{
		chooseFrame.dispose();
		chooseFrame = null;
		ServerApp.getServerApp();
	}
	
	public static void startAsClient()
	{
		chooseFrame.dispose();
		chooseFrame = null;
		ServerApp.getServerApp(); // for testing
		ClientApp.getClientApp();
	}
}
