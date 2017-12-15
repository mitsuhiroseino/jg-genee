package com.purejadeite.genee.option.book;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.content.SpecificValue;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.option.AbstractOption;

/**
 * Bookの値を変換する抽象クラス
 *
 * @author mitsuhiroseino
 */
abstract public class AbstractBookOption extends AbstractOption implements BookOptionInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2367058643988632150L;

	/**
	 * コンストラクタ
	 */
	public AbstractBookOption(DefinitionInterface<?> definition) {
		super(definition);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object apply(Object values, ContentInterface<?, ?> content) {
		if (values == SpecificValue.UNDEFINED) {
			return values;
		}
		return applyImpl((List<Map<String, Object>>) values, content);
	}

	/**
	 * テーブルの変換を行います
	 *
	 * @param values
	 *            変換前のテーブル
	 * @return 変換後のテーブル
	 */
	abstract protected Object applyImpl(List<Map<String, Object>> values, ContentInterface<?, ?> content);

	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		map.put("name", this.getClass().getSimpleName());
		return map;
	}
}
