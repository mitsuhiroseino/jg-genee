package com.purejadeite.genee.option;

import com.purejadeite.genee.option.book.BookOptionInterface;
import com.purejadeite.genee.option.book.BookOptionManager;
import com.purejadeite.genee.option.cell.CellOptionInterface;
import com.purejadeite.genee.option.cell.CellOptionManager;
import com.purejadeite.genee.option.sheet.SheetOptionInterface;
import com.purejadeite.genee.option.sheet.SheetOptionManager;
import com.purejadeite.genee.option.table.TableOptionInterface;
import com.purejadeite.genee.option.table.TableOptionManager;

public class OptionRegistry {

	public static void registerCellOption(Class<? extends CellOptionInterface> clazz) {
		CellOptionManager.register(clazz);
	}

	public static void registerTableOption(Class<? extends TableOptionInterface> clazz) {
		TableOptionManager.register(clazz);
	}

	public static void registerSheetOption(Class<? extends SheetOptionInterface> clazz) {
		SheetOptionManager.register(clazz);
	}

	public static void registerBookOption(Class<? extends BookOptionInterface> clazz) {
		BookOptionManager.register(clazz);
	}

}
