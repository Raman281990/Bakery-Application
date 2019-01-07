package com.process.order.bakery.vo;

import java.util.List;

public class Products
{
    private String code;
    
    private List<Packages> packages;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Packages> getPackages() {
		return packages;
	}

	public void setPackages(List<Packages> packages) {
		this.packages = packages;
	}

	

    
}