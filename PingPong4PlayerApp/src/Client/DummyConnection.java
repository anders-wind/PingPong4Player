/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import Controller.Interface_Server;
import Server.ServerApp;
import java.awt.geom.Point2D;

/**
 * Class description:
 *
 * @buildDate 31-07-2014
 * @author Anders Wind - awis@itu.dk
 */
public class DummyConnection implements Interface_Server{

	private ServerApp serverconnection;
	
	public DummyConnection()
	{
		
	}
	
	@Override
	public Point2D getPlayerXPosition(int playerID)
	{
		return serverconnection.getGameSession().getPlayerXBatPos(playerID);
	}

	@Override
	public int getPlayerXScore(int playerID)
	{
		return serverconnection.getGameSession().getPlayerXPoints(playerID);
	}

	@Override
	public Point2D getBallPosition()
	{
		return serverconnection.getGameSession().getBallPos();
	}

	@Override
	public String getWhichPlayersTurn()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String getMessage()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void movePlayerPositive()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void movePlayerNegative()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void sendStartRoundSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void sendStartGameSignal()
	{
		serverconnection.runGame();
	}

	@Override
	public void sendEndGameSignal()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void startGame()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void setUp()
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int assignPlayer(String name)
	{
		return serverconnection.getGameSession().assignPlayer(name);
	}

}
