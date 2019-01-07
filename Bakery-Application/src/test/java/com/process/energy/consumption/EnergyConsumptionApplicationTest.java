package com.process.energy.consumption;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.process.order.bakery.BakeryOrderProcessingApplication;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = BakeryOrderProcessingApplication.class)
public class EnergyConsumptionApplicationTest {

	 @Test
	public void contextLoads() {
	    
		// EnergyConsumptionApplication.main(new String[] {});
	 }
	
}
