package com.purejadeite.genee.option.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.content.SheetContent;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.definition.SheetDefinition;
import com.purejadeite.util.SimpleValidator;

/**
 * 指定したシートの値をbookとして扱う
 *
 * @author mitsuhiroseino
 *
 */
public class From extends AbstractBookOption {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7423027913699410742L;
	
	/**
	 * 必須項目名称
	 */
	private static final String[] CONFIG = { };

	/**
	 * コンストラクタ
	 *
	 * @param config
	 *            コンバーターのコンフィグ
	 */
	public From(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
		SimpleValidator.containsKey(config, CONFIG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Object applyImpl(List<Map<String, Object>> values, ContentInterface<?, ?> content) {
		SheetDefinition outputSheet = content.getDefinition().getOutputSheet();
		List<SheetContent> sheetContents = content.getSheets(outputSheet);
		List<Object> newBookValues = new ArrayList<>();
		for (SheetContent sheetContent : sheetContents) {
			Object sheetValues = sheetContent.getValues();
			newBookValues.add(sheetValues);
		}
		if (newBookValues.size() == 1) {
			return newBookValues.get(0);
		} else {
			return newBookValues;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		return map;
	}
}