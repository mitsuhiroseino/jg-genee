package com.purejadeite.genee.option.cell;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;

/**
 * 重複削除
 * @author mitsuhiroseino
 *
 */
public class Unique extends AbstractListCellOption {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1855654317938783557L;

	/**
	 * コンストラクタ
	 * @param config コンバーターのコンフィグ
	 */
	public Unique(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Object applyImpl(List<Object> values, ContentInterface<?, ?> content) {
		return new ArrayList<>(new LinkedHashSet<>(values));
	}

}