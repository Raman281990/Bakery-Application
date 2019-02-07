package com.imdb.process.info.service.impl;

import org.springframework.stereotype.Service;

import com.imdb.process.info.service.MovieService;


@Service
public class BakeryServiceImpl implements MovieService {
	/*
	 * 
	 * @Autowired BakeryPrices bakeryPrices;
	 * 
	 * 
	 * @Override public boolean calculateOrder(Order order) {
	 * 
	 * order.getLineItems().stream().forEach(lineItem -> { String product =
	 * lineItem.getProduct(); bakeryPrices.getProducts().stream().filter(p ->
	 * p.getCode().equals(product)) .forEach(matchingProduct -> { List<Packages>
	 * productPackages = matchingProduct.getPackages().stream().sorted((x,y) ->
	 * y.getPackageSize().compareTo(x.getPackageSize()))
	 * .collect(Collectors.toList());
	 * 
	 * int quantity =lineItem.getQuantity(); for(int i
	 * =0;i<productPackages.size();i++) { Packages pack = productPackages.get(i);
	 * int packageSize =pack.getPackageSize();
	 * 
	 * 
	 * if(quantity %packageSize ==0) {
	 * 
	 * int quotient = (quantity / packageSize);
	 * System.out.println(packageSize+"*"+quotient+"Price"+(pack.getPackagePrize()*
	 * quotient)); break; } else if((((productPackages.size()>2 && i<
	 * productPackages.size() -2 )) && ((quantity % packageSize )<
	 * (productPackages.get(i+1).getPackageSize()))) && ((quantity % packageSize )<
	 * (productPackages.get(i+2).getPackageSize()))) { int quotient = (quantity /
	 * packageSize)-1;
	 * System.out.println(packageSize+"*"+quotient+"Price"+pack.getPackagePrize());
	 * quantity = quantity - (packageSize *quotient); }
	 * 
	 * else { int quotient = quantity / packageSize; if(quotient !=0) {
	 * System.out.println(packageSize+"*"+quotient+"Price"+pack.getPackagePrize());
	 * } quantity = quantity -(packageSize*quotient);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * });
	 * 
	 * });
	 * 
	 * return false; }
	 */}
