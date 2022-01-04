/*
 ********************************************************************************
 * 
 * Copyright (C) 2022 Ethoca
 * All Rights Reserved
 * This module contains proprietary information of
 * Ethoca and should be treated as confidential.
 * 
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF ETHOCA
 * 
 * The copyright notice above does not evidence any
 * actual or intended publication of such source code.
 * 
 ********************************************************************************
 */

package com.ethoca.dataintelligence.streaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class can be used to bootstrap and launch a Spring application from a Java main method.
 */
@SpringBootApplication
public class StreamingApiApplication {

	/**
	 * Static helper that can be used to run a JVM from the specified source using default settings.
	 * @param args the application arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(StreamingApiApplication.class, args);
	}

}
