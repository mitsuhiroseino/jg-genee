package com.purejadeite.genee.definition.option.cell;

import org.junit.Test;

import com.purejadeite.genee.definition.option.AbstractOptionTest;
import com.purejadeite.genee.option.cell.Upper;

public class UpperTest extends AbstractOptionTest {

	@Test
	public void half() {
		assertOption(Upper.class, "abc", "ABC");
	}

	@Test
	public void em() {
		assertOption(Upper.class, "ａｂｃ", "ＡＢＣ");
	}

}
