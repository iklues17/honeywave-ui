package org.anyframe.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.honeywave.ui.web.HoneywaveWebApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HoneywaveWebApplication.class)
@WebAppConfiguration
public class CargoTrackerWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
