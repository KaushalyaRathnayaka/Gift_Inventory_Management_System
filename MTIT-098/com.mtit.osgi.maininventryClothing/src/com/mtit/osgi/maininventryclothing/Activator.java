package com.mtit.osgi.maininventryclothing;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.osgi.servicepublisherclothingfashion.ServicePublisherClothingFashion;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		Scanner scann = new Scanner(System.in);
		
		int answer = 0;
		
        try {
            do {
        		System.out.println();
        		System.out.println("#############################################################################");
        		System.out.println("###     Welcome to Main Manager Gift Inventory Management Section     ###");
        		System.out.println("#############################################################################");
        		System.out.println();
        		System.out.println();
        		System.out.println("####################################################");
        		System.out.println("##                                                ##");
        		System.out.println("##    1. View Clothing & Fashion Accessories      ##");
        		System.out.println("##    2. View Cake     					          ##");
        		System.out.println("##    3. View Perfume     				          ##");
        		System.out.println("##    4. View Beauty & Cosmetics   				  ##");
        		System.out.println("##    5. Calculate Profit     					  ##");
        		System.out.println("##                            					  ##");
        		System.out.println("##   99. Exit                 				      ##");
        		System.out.println("##                            					  ##");
        		System.out.println("####################################################");
        		System.out.println();
        		System.out.print("Enter Number: ");
                answer = scann.nextInt();
                switch (answer) {
                    case 1: {
                        this.serviceReference = bundleContext.getServiceReference(ServicePublisherClothingFashion.class.getName());
                        final ServicePublisherClothingFashion servicemenscloths = (ServicePublisherClothingFashion)bundleContext.getService(this.serviceReference);
                        if (servicemenscloths != null) {
                        	servicemenscloths.ClothingFashionService();
                            continue;
                        }
                        continue;
                    }
                   
                                   
                    case 99: {
                        continue;
                    }
                    default: {
                        System.out.println("Invalid number. Please choose a given service number.");
                        continue;
                    }
                }
            } while (answer != 99);
	}catch (Exception ex) {
        System.out.println("Exception occured. ");
	}
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println();
		System.out.println("##########################################################");
		System.out.println("###      Main Clothing Inventory Manager Logged Out    ###");
		System.out.println("##########################################################");
		System.out.println();
	}

}
