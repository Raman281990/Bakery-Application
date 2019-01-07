package com.process.order.bakery.vo;

import java.io.Serializable;

public class LineItems implements Serializable{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = -1638592419800178443L;

		private String product;

	    private int quantity;

	    public String getProduct ()
	    {
	        return product;
	    }

	    public void setProduct (String product)
	    {
	        this.product = product;
	    }

	    public int getQuantity ()
	    {
	        return quantity;
	    }

	    public void setQuantity (int quantity)
	    {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString()
	    {
	        return "LineItems [product = "+product+", quantity = "+quantity+"]";
	    }

}
