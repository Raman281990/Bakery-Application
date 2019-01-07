package com.process.order.bakery.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.process.order.bakery.controller.BakeryOrderController;
import com.process.order.bakery.service.BakeryService;
import com.process.order.bakery.vo.BakeryOrder;

/** BakeryOrderController controller provides endpoint for placing order in the bakery and in response it gets the biiling information
 * per package of the products order as per quantity
 *  
 * @author Ramandeep kaur
 *
 */
@Service
public class BakeryOrderControllerImpl implements BakeryOrderController {

	@Autowired
	BakeryService bakeryService;


	/** Place Order API takes in customerOrder for different products in the bakery containing order quantity of each product.
	 * 	This API produces billing information about each product (per package price of the product) as Bakery sells products in different packages.
	 * 
	 * @param bakeryOrder
	 * @return bakeryOrder
	 */
	@Override
	public ResponseEntity<BakeryOrder> placeOrder(@RequestBody BakeryOrder bakeryOrder) {
	
		bakeryService.calculateOrder(bakeryOrder.getOrder());
		return null;
	}

}
