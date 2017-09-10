package de.wenzel.kos;


import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.wenzel.kos.data.InputReader;
import de.wenzel.kos.data.KosInput;

public class DefaultKosRunner implements IKosRunner{
	Logger logger = LoggerFactory.getLogger(DefaultKosRunner.class);

	@Inject
	InputReader reader;

	@Override
	public KosInput readInput() {
		logger.info("reading input");
		KosInput input = reader.read();
		return input;
	}

}
