package com.purejadeite.genee;

import java.io.IOException;
import java.util.List;

import com.purejadeite.genee.content.BookContent;
import com.purejadeite.genee.content.ContentBuilder;
import com.purejadeite.genee.content.SheetContent;
import com.purejadeite.genee.definition.BookDefinition;
import com.purejadeite.genee.definition.SheetDefinition;
import com.purejadeite.util.collection.Table;

/**
 * <pre>
 * 値をMapへマッピングするクラスです。
 * </pre>
 *
 * @author mitsuhiroseino
 */
public class Jadegreen {

	/**
	 * Sheetから値を取得します
	 *
	 * @param sheets
	 *            値のみを持ったシートのリスト
	 * @param bookDefinition
	 *            ブック定義
	 * @return ブック単位の値
	 * @throws IOException
	 *             ファイル読み込み例外
	 */
	public Object map(List<Table<String>> sheets, BookDefinition bookDefinition) throws IOException {
		BookContent bookContent = ContentBuilder.build(bookDefinition);
		for (Table<String> sheet : sheets) {
			String name = sheet.getOption("sheetName");
			for (SheetDefinition sheetDefinition : bookDefinition.getChildren()) {
				if (sheetDefinition.match(name, sheet)) {
					SheetContent sheetContent = ContentBuilder.build(bookContent, sheetDefinition, name);
					sheetContent.capture(sheet);
					bookContent.addSheet(sheetContent);
				}
			}
		}
		return bookContent.getValues();
	}
}
