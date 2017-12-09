package com.purejadeite.genee.definition.option;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.purejadeite.genee.option.OptionInterface;
import com.purejadeite.genee.option.cell.CellOptionManager;

abstract public class AbstractOptionTest {

	protected static final Map<String, Object> EMPTY_CONFIG = new HashMap<>();

	protected void assertOption(OptionInterface option, Object source, Object expected) {
		assertThat(option.apply(source, null), equalTo(expected));
	}

	protected void assertOption(Class<?> clazz, Object source, Object expected) {
		assertThat(getOption(clazz).apply(source, null), equalTo(expected));
	}

	protected OptionInterface getOption(Class<?> clazz) {
		return getOption(clazz.getSimpleName());
	}

	protected OptionInterface getOption(String type) {
		Map<String, Object> config = new HashMap<>();
		config.put(OptionInterface.CFG_TYPE, type);
		return CellOptionManager.build(null, type, config);
	}

	protected Map<String, Object> getConfig(String type) {
		Map<String, Object> config = new HashMap<>();
		config.put(OptionInterface.CFG_TYPE, type);
		return config;
	}

}
