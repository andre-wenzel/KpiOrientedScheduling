package de.wenzel.kos.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultKosInputReader implements InputReader {
	Logger logger = LoggerFactory.getLogger(DefaultKosInputReader.class);

	@Override
	public KosInput read() {
		logger.info("using default reader");
		return new DefaultKosInput();
	}

}
