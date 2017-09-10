package de.wenzel.kos;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.wenzel.kos.cdi.CdiContext;
import de.wenzel.kos.data.KosInput;

public class Starter {
	
    public static void main(String[] args) throws IOException {
    	Logger logger = LoggerFactory.getLogger(Starter.class);
    	logger.info("starting");
        CdiContext context = CdiContext.INSTANCE;

        IKosRunner starter = context.getBean(IKosRunner.class);
        KosInput input = starter.readInput();
        input.getResources();
    }
}