package com.imdb.process.info.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imdb.process.info.vo.SearchMovies;

import io.swagger.annotations.ApiOperation;

/** BakeryOrderController controller provides endpoint for placing order in the bakery and in response it gets the biiling information
 * per package of the products order as per quantity
 *  
 * @author Ramandeep kaur
 *
 */
@RefreshScope
@RestController
@RequestMapping("/imdb")
public interface MoviesController {
	
	
	/** Place Order API takes in customerOrder for different products in the bakery containing order quantity of each product.
	 * 	This API produces billing information about each product (per package price of the product) as Bakery sells products in different packages.
	 * 
	 * @param bakeryOrder
	 * @return bakeryOrder
	 */
	@ApiOperation(value="To place Bakery Order",notes="This operation is use place order in bakery for different products and "
			+ " and it returns the billing information along with the per package price for the ordered product per quantity")
	@RequestMapping(value = "/topRatedMovies", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SearchMovies> placeOrder(@RequestBody SearchMovies searchMovies); 
}

