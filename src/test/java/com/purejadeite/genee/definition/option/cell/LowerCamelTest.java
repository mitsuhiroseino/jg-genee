package com.purejadeite.genee.definition.option.cell;

import org.junit.Test;

import com.purejadeite.genee.definition.option.AbstractOptionTest;
import com.purejadeite.genee.option.cell.LowerCamel;

public class LowerCamelTest extends AbstractOptionTest {

	@Test
	public void fromLowerCamel() {
		assertOption(LowerCamel.class, "abcDef" ,"abcDef");
	}

	@Test
	public void fromLowerHyphen() {
		assertOption(LowerCamel.class, "abc-def" ,"abcDef");
	}

	@Test
	public void fromLowerUnderscore() {
		assertOption(LowerCamel.class, "abc_def" ,"abcDef");
	}

	@Test
	public void fromUpperCamel() {
		assertOption(LowerCamel.class, "AbcDef" ,"abcDef");
	}

	@Test
	public void fromUpperHyphen() {
		assertOption(LowerCamel.class, "ABC-DEF" ,"abcDef");
	}

	@Test
	public void fromUpperUnderscore() {
		assertOption(LowerCamel.class, "ABC_DEF" ,"abcDef");
	}

}
