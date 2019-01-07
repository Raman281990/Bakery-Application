package com.process.order.bakery.vo;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.process.order.bakery.config.YamlPropertySourceFactory;


@Configuration
@EnableConfigurationProperties
//@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:application.yaml")
@ConfigurationProperties
public class BakeryPrices {
	
	
	private List<Products> products;

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	@Override
    public String toString()
    {
        return "BakeryPrices [products = "+products+"]";
    }

}
