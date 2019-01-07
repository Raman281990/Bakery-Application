package com.process.order.bakery.vo;

public class Packages {

	    private double packagePrize;

	    private Integer packageSize;

	    public double getPackagePrize ()
	    {
	        return packagePrize;
	    }

	    public void setPackagePrize (double packagePrize)
	    {
	        this.packagePrize = packagePrize;
	    }

	    public Integer getPackageSize ()
	    {
	        return packageSize;
	    }

	    public void setPackageSize (int packageSize)
	    {
	        this.packageSize = packageSize;
	    }

	    @Override
	    public String toString()
	    {
	        return "Packages [packagePrize = "+packagePrize+", packageSize = "+packageSize+"]";
	    }
	
				
		
}
