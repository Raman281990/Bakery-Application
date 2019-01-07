package com.process.order.bakery.service;

import com.process.order.bakery.vo.Order;

/**
 * @author GAGAN
 * 
 *RuleSetCacheService contains CRUD operations for Rule set Cache
 */
public interface BakeryService {

	/** addRuleSetIntoCache adds rule set to cache
	 * @param createRuleSetCache
	 * @return
	 */
	public boolean calculateOrder(
			Order order);
	
	
}
