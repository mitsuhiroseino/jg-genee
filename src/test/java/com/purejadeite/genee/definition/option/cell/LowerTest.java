package com.purejadeite.genee.definition.option.cell;

import org.junit.Test;

import com.purejadeite.genee.definition.option.AbstractOptionTest;
import com.purejadeite.genee.option.cell.Lower;

public class LowerTest extends AbstractOptionTest {

	@Test
	public void half() {
		assertOption(Lower.class, "ABC" ,"abc");
	}

	@Test
	public void em() {
		assertOption(Lower.class, "ＡＢＣ" ,"ａｂｃ");
	}

}
