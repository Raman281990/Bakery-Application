package com.process.order.bakery.vo;

import java.io.Serializable;

public class BakeryOrder implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3388628283105656187L;
	private Order order;
	
	public Order getOrder ()
    {
        return order;
    }

    public void setOrder (Order order)
    {
        this.order = order;
    }

    @Override
    public String toString()
    {
        return "BakeryOrder [order = "+order+"]";
    }

}
