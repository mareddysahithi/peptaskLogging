package com.peptask.Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER =  LogManager.getLogger(App.class);
	public double cost(String material_type,String automation,double area)
	{
		double return_value=0.0;
		if(material_type.equals("standard"))
			return_value=area*1200;
		else if(material_type.equals("above standard"))
			return_value=area*1500;
		else if(material_type.equals("high standard"))
		{
			if(automation.equals("no"))
				return_value =  1800*area;
			else
				return_value = 2500*area;
		}
		return return_value;
	}
	public static void main(String args[])
	{
		App hc=new App();
		LOGGER.info("Material type = standard :: Automation = no :: Area of house = 5412 :: Estimated cost = "+hc.cost("standard","no",5412));
		LOGGER.info("Material type = above standard :: Automation = yes :: Area of house = 5412 :: Estimated cost = "+hc.cost("above standard","no",5412));
		LOGGER.info("Material type = high standard :: Automation = no :: Area of house = 5412 :: Estimated cost "+hc.cost("high standard","no",5412));
	}
}
