package com.purejadeite.genee.definition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.purejadeite.genee.option.book.BookOptionManager;

/**
 * Bookの読み込み定義です
 * @author mitsuhiroseino
 *
 */
public class BookDefinition extends AbstractParentDefinition<NoDefinitionInterface, SheetDefinition> {

	private static final long serialVersionUID = 1118031049839086924L;

	/**
	 * シート
	 */
	public static final String CFG_SHEETS = "sheets";

	/**
	 * コンストラクタ
	 * @param config コンフィグ
	 */
	public BookDefinition(Map<String, Object> config) {
		super(config);
	}

	/**
	 * インスタンスを取得します
	 * @param config コンフィグ
	 * @return インスタンス
	 */
	public static BookDefinition newInstance(Map<String, Object> config) {
		return new BookDefinition(config);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFullId() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		List<Map<String, Object>> sheetMaps = new ArrayList<>();
		for(SheetDefinition sheet: children) {
			sheetMaps.add(sheet.toMap());
		}
		map.put("sheets", sheetMaps);
		return map;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildOptions(DefinitionInterface<?> definition, List<Map<String, Object>> options) {
		this.options = BookOptionManager.build(definition, options);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookDefinition getBook() {
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SheetDefinition getOutputSheet() {
		for (SheetDefinition child : this.children) {
			if (child.isOutput()) {
				return child;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SheetDefinition getSheet(String id) {
		for (SheetDefinition child : this.children) {
			if (child.getId().equals(id)) {
				return child;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DefinitionInterface<?> getCell(String sheetId, String cellId) {
		SheetDefinition sheet = getSheet(sheetId);
		if (sheet == null) {
			return null;
		}
		return sheet.getCell(cellId);
	}

}
