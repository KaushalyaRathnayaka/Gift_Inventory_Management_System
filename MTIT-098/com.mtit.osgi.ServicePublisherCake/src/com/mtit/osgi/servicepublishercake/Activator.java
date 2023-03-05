package com.mtit.osgi.servicepublishercake;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {
	ServiceRegistration serviceRegistration;
	@Override
	public void start(BundleContext context) throws Exception {
		
		final ServicePublisherCake ServiceDairy = new ServicePublisherCakeImpl();
		this.serviceRegistration = context.registerService(ServicePublisherCake.class.getName(), (Object)ServiceDairy, null);
		System.out.println();
		System.out.println("######################################");
		System.out.println("###      Homeware Products      ###");
		System.out.println("###     Stock Status : In Stock    ###");
		System.out.println("######################################");
		System.out.println();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("######################################");
		System.out.println("###       Dairy Products       ###");
		System.out.println("###   Stock Status : Out of Stock  ###");
		System.out.println("######################################");
		System.out.println();
	}


}
