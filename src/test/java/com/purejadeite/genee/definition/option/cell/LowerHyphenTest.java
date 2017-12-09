package com.purejadeite.genee.definition.option.cell;

import org.junit.Test;

import com.purejadeite.genee.definition.option.AbstractOptionTest;
import com.purejadeite.genee.option.cell.LowerHyphen;

public class LowerHyphenTest extends AbstractOptionTest {

	@Test
	public void fromLowerCamel() {
		assertOption(LowerHyphen.class, "abcDef" ,"abc-def");
	}

	@Test
	public void fromLowerHyphen() {
		assertOption(LowerHyphen.class, "abc-def" ,"abc-def");
	}

	@Test
	public void fromLowerUnderscore() {
		assertOption(LowerHyphen.class, "abc_def" ,"abc-def");
	}

	@Test
	public void fromUpperCamel() {
		assertOption(LowerHyphen.class, "AbcDef" ,"abc-def");
	}

	@Test
	public void fromUpperHyphen() {
		assertOption(LowerHyphen.class, "ABC-DEF" ,"abc-def");
	}

	@Test
	public void fromUpperUnderscore() {
		assertOption(LowerHyphen.class, "ABC_DEF" ,"abc-def");
	}

}
