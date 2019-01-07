package com.process.order.bakery.vo;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -447076968743290664L;
	private List<LineItems> lineItems;

    public List<LineItems> getLineItems ()
    {
        return lineItems;
    }

    public void setLineItems (List<LineItems> lineItems)
    {
        this.lineItems = lineItems;
    }

    @Override
    public String toString()
    {
        return "Order [lineItems = "+lineItems+"]";
    }
}