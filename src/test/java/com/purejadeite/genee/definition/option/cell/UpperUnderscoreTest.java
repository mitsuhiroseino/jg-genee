package com.purejadeite.genee.definition.option.cell;

import org.junit.Test;

import com.purejadeite.genee.definition.option.AbstractOptionTest;
import com.purejadeite.genee.option.cell.UpperUnderscore;

public class UpperUnderscoreTest extends AbstractOptionTest {

	@Test
	public void fromLowerCamel() {
		assertOption(UpperUnderscore.class, "abcDef" ,"ABC_DEF");
	}

	@Test
	public void fromLowerHyphen() {
		assertOption(UpperUnderscore.class, "abc-def" ,"ABC_DEF");
	}

	@Test
	public void fromLowerUnderscore() {
		assertOption(UpperUnderscore.class, "abc_def" ,"ABC_DEF");
	}

	@Test
	public void fromUpperCamel() {
		assertOption(UpperUnderscore.class, "AbcDef" ,"ABC_DEF");
	}

	@Test
	public void fromUpperHyphen() {
		assertOption(UpperUnderscore.class, "ABC-DEF" ,"ABC_DEF");
	}

	@Test
	public void fromUpperUnderscore() {
		assertOption(UpperUnderscore.class, "ABC_DEF" ,"ABC_DEF");
	}

}
